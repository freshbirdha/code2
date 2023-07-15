import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Scanlesson14Test4 {

	public static void main(String[] args) {
		System.out.println("��ӭʹ�ð����ļ�����ϵͳ[Version 0.4]");
        System.out.println("(c) 2019 ���������̽���. All rights reserved");
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
                	
                	logger("ʹ�� " + "exit"); 
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
                    logger("ʹ�� " + "dir" ); 
                    System.out.printf("%d File(s)%14d bytes%n", numFiles, totalFileSize);
                    System.out.printf("%d Dir(s) %14d bytes%n", numDirs, new File(userHome).getTotalSpace());
                    System.out.printf("%n", totalDirSize, numDirs);
                    
                }else if("mkdir".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                		 String dirName = commandArr[1];
		                 File sub = new File(userHome, dirName);
		             	 sub.mkdirs();
		             	logger("mkdir " + dirName); 
             		}else {
             			System.out.println("�����������!");
             		}
                	 
                }else if("mkfile".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                		 String fileName = commandArr[1];
		                 File file = new File(userHome, fileName);
		             	 try {
							file.createNewFile();
							logger("mkfile " + fileName); 
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
                		
                		logger("rm " + rmfileName); 
                	}    
                	
                }else if("rname".equals(commandArr[0])) {
                	if(commandArr.length == 3) {
                		 String oldfileName = commandArr[1];
                		 String newfileName = commandArr[2];
                	     File oldFile = new File(userHome, oldfileName);
                	     File newFile = new File(userHome, newfileName);
                		 oldFile.renameTo(newFile); 
                		 
                		 logger("rname " + oldfileName); 
                	}
                	
                }else if("cat".equals(commandArr[0])) {
                	if(commandArr.length == 2) {
                		String catfileName = commandArr[1];               	
                		File file = new File(userHome, catfileName);
                		String filePath = file.getAbsolutePath();
                		if(file.isDirectory()) {
                            File[] files = file.listFiles();
                            for(File f : files) {
                                System.out.println(f.getAbsolutePath());
                                if(f.isDirectory()) {
                                	printFile(f);
                                	 logger("cat " + catfileName); 
                                }
                            }
                        }else {
                        	
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
                    			
                    			logger("cat " + catfileName); 
                    		} catch (Exception e) {
                    			// TODO Auto-generated catch block
                    			e.printStackTrace();
                    		}
                        	
                        }
                		
                	}
                	
                }else if("copy".equals(commandArr[0])) {
                
                	  if (commandArr.length == 2) {
                	        String fileName = commandArr[1];
                	        File copyFile = new File(userHome, fileName);
                	        if(copyFile.exists()) {
            	        	String copyfileName = fileName;
            	        	int count = 0;
            	        	boolean flag = false;
            	        	while(!flag) {
            	        		File copynewFile = new File(userHome,copyfileName);
            	        		if(copynewFile.exists()) {
            	        			//count++;
            	        			//copyfileName = fileName + "(" + count + ")";
            	        			int index = fileName.lastIndexOf(".");
        	        		        String filename = fileName.substring(0, index);
        	        		        String strfile = fileName.substring(index);
        	        		        copyfileName = filename + "(" + count + ")" + strfile;
            	        	      
            	        		}else {
            	        			try {
            	        				FileInputStream inputStream = new FileInputStream(copyFile);
        	        					FileOutputStream outputStream = new FileOutputStream(copynewFile);
        	        					byte[] bytes = new byte[1024];
        	        					int len = inputStream.read(bytes);
        	        			        while (len != -1) {
        	        			            outputStream.write(bytes, 0, len);
        	        			            bytes = new byte[1024];
        	        			            len = inputStream.read(bytes);
        	        			        }
        	        					inputStream.close();
        	        					outputStream.close();
        	        					flag = true;
        	        					
        	        					logger("copy " + fileName);       	        					
        	        					System.out.println("�����ļ��ɹ������ļ�����·��Ϊ��" + copynewFile.getAbsolutePath());				
										
									} catch (Exception e) {
										// TODO: handle exception
										e.printStackTrace();
									}              	        					
        	        		    }
        	        	   }
        	         }
            	        
        	   }else if(commandArr.length == 3) {  //�����ļ���ָ���ľ���·����
        		    String fileName = commandArr[1];
        		    String copyfilePath = commandArr[2];
        		    File file = new File(userHome, fileName);
        		    String filePath = file.getAbsolutePath();

        		    File oldFile = new File(filePath);
        		    File newPath = new File(copyfilePath);

        		    if(oldFile.isFile()) {
        		        File copyFile = new File(newPath, oldFile.getName());
        		        try {
        		            FileInputStream inputStream = new FileInputStream(oldFile);
        		            FileOutputStream outputStream = new FileOutputStream(copyFile);
        		            byte[] bytes = new byte[1024];

        		            int len = inputStream.read(bytes);
        		            while (len != -1) {
        		                outputStream.write(bytes, 0, len);
        		                bytes = new byte[1024];
        		                len = inputStream.read(bytes);
        		            }
        		            inputStream.close();
        		            outputStream.close();
        		            logger("copy " + fileName); 
        		            System.out.println("�����ļ��ɹ������ļ�����·��Ϊ��" + copyFile.getAbsolutePath());
        		        } catch (Exception e) {
        		            e.printStackTrace();
        		        } 
        		    } else if(oldFile.isDirectory()) {
        		        String dirName = commandArr[1];  // ��ȡ������ļ�������
        		        String copydirPath = commandArr[2];// ��ȡ����ĸ����ļ���·��
        		        File copyDir = new File(copydirPath, dirName);// ���������ļ��е�File����
        		        if(copyDir.exists()) {
        		            String copydirName = dirName;
        		            int count = 0;
        		            boolean flag = false;
        		            while(!flag) {
        		                File copynewDir = new File(copydirPath,copydirName);  // �����µĸ����ļ��ж���
        		                if(copynewDir.exists()) {  // ����µĸ����ļ��ж�����ָ��Ŀ¼���Ѿ�����
        		                	 count++;
         		                     copydirName = dirName + "(" + count + ")";

        		                } else {  //����µĸ����ļ��ж�����ָ��Ŀ¼�ﲻ����
        		                    copynewDir.mkdirs(); 
        		                    flag = true;
        		                    logger("copy " + dirName); 
        		                    System.out.println("�����ļ��гɹ������ļ��о���·��Ϊ��" + copynewDir.getAbsolutePath());
        		                    try {
        		                        copyDir(oldFile, copynewDir);
        		                    } catch (IOException e) {
        		                        e.printStackTrace();
        		                    }
        		                }
        		            }
        		        } else {      //������Ƶ��ļ�����ָ��Ҫ���Ƶ�Ŀ¼�ﲻ����
        		            try {
        		            	 logger("copy " + dirName); 
								copyDir(oldFile, copyDir);  //�õݹ鷽�������ļ��е����ݵ�ָ��Ŀ¼
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
        		            System.out.println("�����ļ��гɹ������ļ��о���·��Ϊ��" + copyDir.getAbsolutePath());
        		        }
        		    } 
        		}

                	      	
           }else if("df".equals(commandArr[0])) {
        	   File [] roots = File.listRoots();
        	   for (File root : roots) {
        	        long totalSpace = root.getTotalSpace();
        	        long freeSpace = root.getFreeSpace();
        	        long usedSpace = totalSpace - freeSpace;
        	        double totalGB = (double) totalSpace / (1024 * 1024 * 1024);
        	        double usedGB = (double) usedSpace / (1024 * 1024 * 1024);
        	        double freeGB = (double) freeSpace / (1024 * 1024 * 1024);
        	        System.out.printf("%s%n", root.getAbsolutePath());
        	        logger("df " + root); 
        	        System.out.printf("������=%.2f GB, ����δʹ��=%.2f GB, �Ѿ�ʹ��=%.2f GB%n", totalGB, freeGB, usedGB);    	          	        
	           }
        	           	      	   
           }else if("cd".equals(commandArr[0])) {
        	   if(commandArr.length == 2) {
        		   String cdDirName = commandArr[1];
        	       userHome = userHome + "\\" + cdDirName; 
        	     // System.out.println(userHome);
        	        File file = new File(userHome);
        	        if(file.exists() && file.isDirectory()) {
        	            System.setProperty("user.home", userHome);  //��ϵͳ���� "user.home"��ֵ����ΪuserHome������������ַ���  
        	            logger("cd " + cdDirName); 
        	        }else {
        	            System.out.println("û���ҵ�" + commandArr[1] + "�ļ���");
        	        }      		     
        	   }
        	  
           }else if ("d:".equals(commandArr[0])) { 
        	    userHome = "D:\\";
        	    File disk = new File(userHome);
        	    if (disk.exists()) {
        	        System.setProperty("user.home", userHome); 
        	        logger("d: " + "D:\\"); 
        	    } else {
        	        System.out.println("�豸δ����");
        	    }
        	        	         	   
           }else if ("cd../".equals(commandArr[0])) {
        	 //split���������Ĳ����ַ�����������������ʽ�е�\\�����Ӧ\�������÷�б�ָܷ���ʱ��Ҫд�ĸ���б��
        	   LinkedList<String> cdList = new LinkedList<>(Arrays.asList(userHome.split("\\\\")));
        	   
        	   /**
        	    * userHome�ַ�����\�ָ��
        	    * 
        	    * cdList[0] = C:
        	    * cdList[1] = Users
        	    * cdList[2] = USER
        	    */
        	   
        	    int len = cdList.size();
        	    if (len > 1) {
        	        cdList.removeLast();
        	        String cdDir = String.join("\\", cdList);  // ���������Ԫ�غϲ���һ���ַ���
        	        System.setProperty("user.home", cdDir);
        	        logger("cd../ " + cdDir); 
        	    } else {
        	        System.out.println("���޿����˱�������");
        	    }
        	   
        	}else if (commandArr[0].startsWith("cd../")) {
        		LinkedList<String> cdList = new LinkedList<>(Arrays.asList(userHome.split("\\\\")));
        		String substringDir = commandArr[0].substring(5); // 5��ָ�������ַ����еĵ�6���ַ���ʼ��ȡ,�൱�ڴ�cd../����ַ������濪ʼ��ȡ
  
     	    	 File file = new File(userHome + "\\" + substringDir);
     	         if (file.exists() && file.isDirectory()) {
         	        if (cdList.size() > 1) {
         	            cdList.removeLast();
         	            cdList.addLast(substringDir);
         	            userHome = String.join("\\", cdList);
         	           logger("cd../ " + substringDir); 
         	            System.setProperty("user.home", userHome);
         	        } else {
         	            System.out.println("���޿����˱�������");
         	        }
    	     	}else {
    	     		System.out.println("ϵͳδ�ҵ���·��");
    	     	}
         	      	  
         }else if (commandArr[0].equals("find") && commandArr[1].equals("/")) {
        	    String searchPattern = ".*";
        	    List<File> fileList = new ArrayList<>(); // ��List�������洢ƥ�䵽���ļ�
        	    File[] roots = File.listRoots();  //��ȡ���̵����и�Ŀ¼����������
        	    
        	    if (commandArr.length > 3 && commandArr[3].equals(">") && commandArr[4].equals("info.txt")) {
        	        //ʹ�ö��߳�����ָ���ļ�	    	
        	    	 String fileName = commandArr[2].replaceAll("\\.", "\\\\.");
         	         fileName = fileName.replaceAll("\\*", ".*");
         	         searchPattern = ".*" + fileName;
         	         FileThread fileScanThread = new FileThread(roots, Pattern.compile(searchPattern), fileList);
        	    	 fileScanThread.start();
        	    	 int index = fileList.size() - 1;
             	     try {
		         	       File writeNameFile = new File(System.getProperty("user.home"),"info.txt");
		                   writeNameFile.createNewFile();
		                   FileWriter writer = new FileWriter(writeNameFile, true);
		                   writer.write("[" + (index + 1) + "] " + writeNameFile.getName());
		                    
             	    	   /**FileWriter writer = new FileWriter("info.txt", true);
             	           for (int i = 0; i < fileList.size(); i++) {
             	           File file = fileList.get(i);
             	           String str = "[" + (i + 1) + "] " + file.getAbsolutePath()+"\n";           	            
             	           writer.write(str);        
             	           }*/
		                    
             	           writer.close();
             	          
             	    } catch (IOException e) {
             	        e.printStackTrace();
             	    }
        	        
        	    } else {
        	    	if (commandArr.length > 2 ) {
            	        String fileName = commandArr[2].replaceAll("\\.", "\\\\.");
            	        fileName = fileName.replaceAll("\\*", ".*");
            	        searchPattern = ".*" + fileName;
            	    }
            	    Pattern  pattern = Pattern.compile(searchPattern);

            	    for (File root : roots) {
            	        findFiles(root, pattern, fileList);
            	    }
            	    
            	    System.out.println("һ���ҵ�" + fileList.size() + "��ƥ���ļ�");
            	     	    	
        	    }
        	    
        	  
        	}else if(commandArr[0].startsWith("find")) {
        		
        		if (commandArr.length == 2) { // ��Ŀ¼����
        			
        		    String fileName = commandArr[1];
        		    searchFiles(System.getProperty("user.home"), fileName);
        		    
        		} else if (commandArr.length == 3) { // ָ��Ŀ¼����
        			
        		    String directory = commandArr[1];
        		    String fileName = commandArr[2];
        		    searchFiles(directory, fileName);
        		}

            				
        	} else {               	
	               System.out.println("'"  +  commandArr[0] + "'"  +  
	               "�����ڲ����ⲿ����,Ҳ���ǿ����еĳ�����������ļ�");
	            }
                
	        }// while end
		}// try end

	}// main end
	
	
	
	private static void searchFiles(String property, String fileName) {
		// TODO Auto-generated method stub
		String searchPattern = fileName;
	    int count = 0;
	    File searchFile = new File(property);
	    
	    if (fileName.contains("*")) { 
	        searchPattern = fileName.replaceAll("\\.", "\\\\."); 
	        searchPattern = searchPattern.replaceAll("\\*", ".*");
	        searchPattern = "^" + searchPattern + "$";
	    }

	    Pattern pattern = Pattern.compile(searchPattern);

	    File[] files = searchFile.listFiles();

	    for (File file : files) {
	        if (file.isFile() && pattern.matcher(file.getName()).matches()) {
	            count++;
	            System.out.println(file.getAbsolutePath());
	        }
	    }

	    System.out.println("һ���ҵ�" + count + "��ƥ���ļ�");
		
	}
	
	private static void findFiles(File root, Pattern pattern,  List<File> fileList) {
		// TODO Auto-generated method stub
	    File[] files = root.listFiles();
	    if (files != null) {
	        for (File file : files) {
	            if (file.isDirectory()) {
	                findFiles(file, pattern, fileList);
	            } else if (file.isFile() && pattern.matcher(file.getName()).matches()) {
	            	fileList.add(file); 
	            	int index = fileList.size() - 1; // ��ȡ�¼��ļ�������
	            	System.out.println("[" + (index + 1) + "] " + file.getAbsolutePath()); 
	            }
	        }
	    }
	}

	private static void copyDir(File oldFile, File copynewDir) throws IOException {
		// TODO Auto-generated method stub
	  if (!copynewDir.exists()) {
	        copynewDir.mkdir();
	    }
	  
	    File[] files = oldFile.listFiles();
	    
	    for (File file : files) {
	    	
	        if (file.isDirectory()) {
	        	
	            copyDir(file, new File(copynewDir, file.getName()));
	            
	        } else {
	            File newFile = new File(copynewDir, file.getName());
	            FileInputStream inputStream = new FileInputStream(file);
	            FileOutputStream outputStream = new FileOutputStream(newFile);
	            byte[] bytes = new byte[1024];
	            int len = inputStream.read(bytes);
                while (len != -1) {
                    outputStream.write(bytes, 0, len);
                    bytes = new byte[1024];
                    len = inputStream.read(bytes);
                }
	            inputStream.close();
	            outputStream.close();
	        }
	    }	
	}

	public static void printFile(File file) {
			
			if(file.exists()) {
				
				System.out.println(file.getPath());		
			
				if(file.isDirectory()) {
						
					File[] files = file.listFiles();
							
					for(File f: files) {
						
						printFile(f);
					}
				}
			}
	    }

	public static void logger(String message) {
		
	    String fileName = new SimpleDateFormat("yyyyMMdd'.log'").format(new Date());// ��ȡ��ǰ������Ϊ��־�ļ���
	    
	    // ��ϵͳ�û�Ŀ¼�´���logs�ļ���
	    File logsDir = new File(System.getProperty("user.home"), "logs"); 
	    logsDir.mkdirs();   
	    
	    //������־�ļ�
	    File logFile = new File(logsDir, fileName);
	    
	    try {
	        if (!logFile.exists()) {// �����־�ļ������ڵĻ������½��ļ�
	            logFile.createNewFile();
	        }
	        FileWriter writer = new FileWriter(logFile, true); // ����FileWriter���󣬲�����Ϊ׷��ģʽ
	        //��ʽ����־��Ϣ
	        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        String dateTimeStr = dateTimeFormat.format(new Date());
	        String logMessage = String.format("%s %s%n", dateTimeStr, message);
	        
	        // ����ʽ�������־��Ϣд����־�ļ���
	        writer.write(logMessage);
	        writer.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
}


class FileThread extends Thread {

	private File[] roots;
	private Pattern pattern;
	private List<File> fileList;

	public FileThread(File[] roots, Pattern pattern, List<File> fileList) {
	    this.roots = roots;
	    this.pattern = pattern;
	    this.fileList = fileList;
	}

	@Override
	public void run() {
	    for (File root : roots) {
	        threadFindFiles(root, pattern, fileList);
	    }
	}


	
	public static  void threadFindFiles(File root, Pattern pattern, List<File> fileList) {
	    File[] files = root.listFiles();
	    if (files != null) {
	        for (File file : files) {
	            if (file.isDirectory()) {
	                threadFindFiles(file, pattern, fileList);
	            } else if (file.isFile() && pattern.matcher(file.getName()).matches()) {
	                fileList.add(file);
	                int index = fileList.size() - 1; // ��ȡ�¼��ļ�������
	                try {
	                	File writeNameFile = new File(System.getProperty("user.home"),"info.txt");
	                	writeNameFile.createNewFile();
                        FileWriter writer = new FileWriter(writeNameFile, true);
                        writer.write("[" + (index + 1) + "] " + file.getName());
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
	            }
	        }
	    }
	}

}
































	                           	               















