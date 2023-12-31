import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Scanlesson14Test2 {


	    public static void main(String[] args) {
	        // 输出欢迎信息
	        System.out.println("欢迎使用斑马文件管理系统[Version 0.1]");
	        System.out.println("(c) 2019 东京斑马编程教室. All rights reserved");
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        
	        try (Scanner input = new Scanner(System.in)) {
	            String command = null;
	            // 循环获取用户输入，直到输入 'q' 为止
	            while (!"q".equals(command)) {
	                // 获取用户家目录，并输出提示符
	            	String userHome = System.getProperty("user.home");
	                System.out.print(userHome + ">");
	                // 获取用户输入的命令
	                command = input.nextLine();
	                // 如果用户输入 'dir'，则执行列出文件列表的操作
	                if ("dir".equals(command)) {
	                    // 获取用户家目录下的所有文件和文件夹
	                    File[] files = new File(userHome).listFiles();
	                    // 创建日期格式化对象
	                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	                    // 初始化文件和文件夹的数量，以及所有文件的总大小和所有文件夹的总大小
	                    int numFiles = 0;
	                    int numDirs = 0;
	                    long totalFileSize = 0;
	                    long totalDirSize = 0;

	                    // 遍历所有文件和文件夹
	                    for (File file : files) {
	                        // 如果是文件夹，增加文件夹数量
	                        if (file.isDirectory()) {
	                            numDirs++;
	                        } else {
	                            // 如果是文件，增加文件数量，以及所有文件的总大小
	                            numFiles++;
	                            totalFileSize += file.length();
	                        }

	                        // 输出文件的修改时间、类型和名称
	                        System.out.printf("%-20s", sdf.format(new Date(file.lastModified())));
	                        if (file.isDirectory()) {
	                            System.out.printf("%-20s", "<DIR>");
	                        } else {
	                            System.out.printf("%-20s",   " ");
	                        }
	                        System.out.printf("%-20s%n", file.getName());
	                    }

	                    // 输出文件数量、文件总大小、文件夹数量和文件夹总大小
	                    System.out.printf("%d File(s)%14d bytes%n", numFiles, totalFileSize);
	                    System.out.printf("%d Dir(s) %14d bytes%n", numDirs, new File(".").getTotalSpace());
	                    System.out.printf("%n", totalDirSize, numDirs);
	                }
	            }
	        }
	    }
	}
































	                           	               















