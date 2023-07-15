import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Scanlesson14Test {
    public static void main(String[] args) {
        System.out.println("欢迎使用斑马文件管理系统[Version 0.1]");
        System.out.println("(c) 2019 东京斑马编程教室. All rights reserved");
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!"exit".equals(command)) {
            System.out.print(System.getProperty("user.home"));
            command = scanner.nextLine();
            if ("dir".equals(command)) {
                File[] files = new File(".").listFiles();
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
               
                for (File file : files) {
                    System.out.printf("%-20s", sdf.format(new Date(file.lastModified())));
                    if (file.isDirectory()) {
                        System.out.printf("%-20s", "<DIR>");
                    } else {
                        System.out.printf("%-20s", file.length() + " bytes");
                    }
                    System.out.printf("%-20s%n", file.getName());
                }
            }
        }
    }
}





	


