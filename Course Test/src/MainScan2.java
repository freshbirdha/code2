import java.io.*;

import java.util.*;
import java.util.regex.*;

public class MainScan2 {
    public static void main(String[] args) {
        if (args.length < 3 || !args[0].equals("find") || !args[1].equals("/") || !args[args.length - 2].equals(">")) {
            System.out.println("Usage: find / pattern > filename");
            return;
        }

        String patternStr = args[2];
        patternStr = patternStr.replaceAll("\\.", "\\\\."); 
        patternStr = patternStr.replaceAll("\\*", ".*");
        patternStr = "^" + patternStr + "$";
        Pattern pattern = Pattern.compile(patternStr);

        String outputFileName = args[args.length - 1];
        String home = System.getProperty("user.home");
        String outputFilePath = home + "/" + outputFileName;

        File outputFile = new File(outputFilePath);
        if (outputFile.exists()) {
            System.out.println(outputFileName + " already exists, overwrite? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                return;
            }
        }

        FileScanThread fileScanThread = new FileScanThread();
        fileScanThread.setPattern(pattern);
        fileScanThread.start();

        try (OutputStream outputStream = new FileOutputStream(outputFilePath)) {
            fileScanThread.join();
            List<File> fileList = fileScanThread.getFileList();
            int count = fileList.size();
            String result = "一共找到" + count + "个匹配文件\n";
            outputStream.write(result.getBytes());

            for (int i = 0; i < count; i++) {
                File file = fileList.get(i);
                String line = "[" + (i + 1) + "] " + file.getAbsolutePath() + "\n";
                outputStream.write(line.getBytes());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class FileScanThread extends Thread {
        private Pattern pattern;
        private List<File> fileList;

        public void setPattern(Pattern pattern) {
            this.pattern = pattern;
        }

        public List<File> getFileList() {
            return fileList;
        }

        @Override
        public void run() {
            fileList = new ArrayList<>();
            File[] roots = File.listRoots();
            if (roots != null) {
                for (File root : roots) {
                    findFiles(root, pattern, fileList);
                }
            }
            System.out.println("扫描完毕，一共找到" + fileList.size() + "个匹配文件");
        }
    }

    private static void findFiles(File root, Pattern pattern, List<File> fileList) {
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFiles(file, pattern, fileList);
                } else if (file.isFile() && pattern.matcher(file.getName()).matches()) {
                    fileList.add(file);
                }
            }
        }
    }
}
