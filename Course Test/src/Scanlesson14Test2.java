import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Scanlesson14Test2 {


	    public static void main(String[] args) {
	        // �����ӭ��Ϣ
	        System.out.println("��ӭʹ�ð����ļ�����ϵͳ[Version 0.1]");
	        System.out.println("(c) 2019 ����������̽���. All rights reserved");
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        
	        try (Scanner input = new Scanner(System.in)) {
	            String command = null;
	            // ѭ����ȡ�û����룬ֱ������ 'q' Ϊֹ
	            while (!"q".equals(command)) {
	                // ��ȡ�û���Ŀ¼���������ʾ��
	            	String userHome = System.getProperty("user.home");
	                System.out.print(userHome + ">");
	                // ��ȡ�û����������
	                command = input.nextLine();
	                // ����û����� 'dir'����ִ���г��ļ��б��Ĳ���
	                if ("dir".equals(command)) {
	                    // ��ȡ�û���Ŀ¼�µ������ļ����ļ���
	                    File[] files = new File(userHome).listFiles();
	                    // �������ڸ�ʽ������
	                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	                    // ��ʼ���ļ����ļ��е��������Լ������ļ����ܴ�С�������ļ��е��ܴ�С
	                    int numFiles = 0;
	                    int numDirs = 0;
	                    long totalFileSize = 0;
	                    long totalDirSize = 0;

	                    // ���������ļ����ļ���
	                    for (File file : files) {
	                        // ������ļ��У������ļ�������
	                        if (file.isDirectory()) {
	                            numDirs++;
	                        } else {
	                            // ������ļ��������ļ��������Լ������ļ����ܴ�С
	                            numFiles++;
	                            totalFileSize += file.length();
	                        }

	                        // ����ļ����޸�ʱ�䡢���ͺ�����
	                        System.out.printf("%-20s", sdf.format(new Date(file.lastModified())));
	                        if (file.isDirectory()) {
	                            System.out.printf("%-20s", "<DIR>");
	                        } else {
	                            System.out.printf("%-20s",   " ");
	                        }
	                        System.out.printf("%-20s%n", file.getName());
	                    }

	                    // ����ļ��������ļ��ܴ�С���ļ����������ļ����ܴ�С
	                    System.out.printf("%d File(s)%14d bytes%n", numFiles, totalFileSize);
	                    System.out.printf("%d Dir(s) %14d bytes%n", numDirs, new File(".").getTotalSpace());
	                    System.out.printf("%n", totalDirSize, numDirs);
	                }
	            }
	        }
	    }
	}
































	                           	               














