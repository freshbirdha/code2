import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateManagentSystem {
	public static void main(String[] args) {
		System.out.println("欢迎使用斑马文件管理系统[Version 0.2]");
        System.out.println("(c) 2019 东京斑马编程教室. All rights reserved");
        System.out.println();
        System.out.println();
        System.out.println();
        
        try (Scanner input = new Scanner(System.in)) {
			while (true) {
            	String userHome = System.getProperty("user.home");
                System.out.print(userHome + ">");
                String[] commandArr = input.nextLine().split(" ");
                
                if ("exit".equals(commandArr[0])) {
                	System.out.println("Bye!!!");
                    break; 
                }else if ("dir".equals(commandArr[0])) {
                    File[] files = new File(userHome).listFiles();

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

                    int numFiles = 0;
                    int numDirs = 0;
                    long totalFileSize = 0;
                    long totalDirSize = 0;

                    for (File file : files) {
                        if (file.isDirectory()) {
                            numDirs++;
                          
                        } else {
                            numFiles++;
                            totalFileSize += file.length();
                        }

                        System.out.printf("%-20s", sdf.format(new Date(file.lastModified())));
                        
                        if (file.isDirectory()) {
                            System.out.printf("%-20s", "<DIR>");
                        } else {
                            System.out.printf("%-20s",   " ");
                        }
                        System.out.printf("%-20s%n", file.getName());
                    }

                    System.out.printf("%d File(s)%14d bytes%n", numFiles, totalFileSize);
                    System.out.printf("%d Dir(s) %14d bytes%n", numDirs, new File(userHome).getTotalSpace());
                    System.out.printf("%n", totalDirSize, numDirs);
                }else if("mkdir".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                		 String dirName = commandArr[1];
		                 File sub = new File(userHome, dirName);
		             	 sub.mkdirs();
             		}else {
             			System.out.println("输入参数有误!");
             		}
                }else if("mkfile".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                		 String fileName = commandArr[1];
		                 File file = new File(userHome, fileName);
		             	 try {
							file.createNewFile();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		             }
                }else if("rm".equals(commandArr[0])) {
                	if(commandArr.length == 2) {
                		String rmfileName = commandArr[1];
                		File delfile = new File(userHome, rmfileName);
                		delfile.delete();
                	}              	
                }else if("rname".equals(commandArr[0])) {
                	if(commandArr.length == 3) {
                		 String oldfileName = commandArr[1];
                		 String newfileName = commandArr[2];
                	     File oldFile = new File(userHome, oldfileName);
                	     File newFile = new File(userHome, newfileName);
                		 oldFile.renameTo(newFile);              		
                	}
                }else if("cat".equals(commandArr[0])) {
                	if(commandArr.length == 2) {
                		String catfileName = commandArr[1];               	
                		File file = new File(userHome, catfileName);
                		
                		String filePath = file.getAbsolutePath();
                		
                		StringBuffer buffer = new StringBuffer();
                		
                		try {
                			
                			FileInputStream fInputStream = new FileInputStream(filePath);

                			byte[] bytes = new byte[1024];
                			
                			int x = -1;
                			do {
                				x = fInputStream.read(bytes, 0, bytes.length);
                				buffer.append(new String(bytes));
                				bytes = new byte[1024];
                				
                			} while (x!=-1);
                			
                			fInputStream.close();
                			System.out.println(buffer);
                		} catch (Exception e) {
                			// TODO Auto-generated catch block
                			e.printStackTrace();
                		}
                	}
                }else if("copy".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                	        String fileName = commandArr[1];
                	        File oldFile = new File(fileName);
                	        if(oldFile.exists()) {
                	            String copyFileName = fileName;
                	            int count = 0;
                	            boolean flag = false;
                	            while(!flag) {
                	                File newFile = new File(userHome, copyFileName);
                	                if(newFile.exists()) {
                	                    count++;
                	                    copyFileName = fileName + "(" + count + ")";
                	                } else {
                	                    try {
                	                        FileInputStream inputStream = new FileInputStream(oldFile);
                	                        FileOutputStream outputStream = new FileOutputStream(newFile);
                	                        byte[] bytes = new byte[1024];
                	                        int len = inputStream.read(bytes);
                	                        while (len != -1) {
                	                            outputStream.write(bytes, 0, len);
                	                            len = inputStream.read(bytes);
                	                        }
                	                        inputStream.close();
                	                        outputStream.close();
                	                        flag = true;
                	                        System.out.println("复制文件成功，新文件绝对路径为：" + newFile.getAbsolutePath());
                	                    } catch (Exception e) {
                	                        e.printStackTrace();
                	                    }
                	                }
                	            }
                	        } else {
                	            System.out.println("要复制的文件不存在！");
                	        }
                	    } else if(commandArr.length == 3) {
                	        String fileName = commandArr[1];
                	        String copyfilePath = commandArr[2];
                	        File oldFile = new File(fileName);
                	        File newDir = new File(copyfilePath);

                	        if(oldFile.exists() && oldFile.isFile() && newDir.isDirectory()) {
                	            File copyFile = new File(newDir, oldFile.getName());
                	            try {
                	                FileInputStream inputStream = new FileInputStream(oldFile);
                	                FileOutputStream outputStream = new FileOutputStream(copyFile);
                	                byte[] bytes = new byte[1024];
                	                int len = inputStream.read(bytes);
                	                while (len != -1) {
                	                    outputStream.write(bytes, 0, len);
                	                    len = inputStream.read(bytes);
                	                }
                	                inputStream.close();
                	                outputStream.close();
                	                System.out.println("复制文件成功，新文件绝对路径为：" + copyFile.getAbsolutePath());
                	            } catch (Exception e) {
                	                e.printStackTrace();
                	            }
                	        } else {
                	            System.out.println("要复制的文件不存在或目标路径不是目录！");
                	        }
            	        }
                	      	
           }else{                	
	               System.out.println("'"  +  commandArr[0] + "'"  +  
	               "不是内部或外部命令,也不是可运行的程序或批处理文件");
	            }
	        }
		}

	}

}
