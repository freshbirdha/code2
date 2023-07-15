import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Scanlesson14Test3 {


	    public static void main(String[] args) {
	    	System.out.println("��ӭʹ�ð����ļ�����ϵͳ[Version 0.2]");
	        System.out.println("(c) 2019 ����������̽���. All rights reserved");
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
	             			System.out.println("�����������!");
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
	                		if(file.isDirectory()) {
	                            File[] files = file.listFiles();
	                            for(File f : files) {
	                                System.out.println(f.getAbsolutePath());
	                                if(f.isDirectory()) {
	                                	printFile(f);
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
	            	        			count++;
	            	        			copyfileName = fileName + "(" + count + ")";
	            	        			/**
	            	        			 * 	int index = fileName.lastIndexOf(".");
		        	        		     *  String filename = fileName.substring(0, index);
		        	        		     *  String strfile = fileName.substring(index);
		        	        		     *  copyfileName = filename + "(" + count + ")" + strfile;
	            	        			 * 
	            	        			 */
	            	        	      
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
	        	        					System.out.println("�����ļ��ɹ������ļ�����·��Ϊ��" + copynewFile.getAbsolutePath());				
											
										} catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}              	        					
	        	        		    }
	        	        	   }
	        	         }
	            	        
	        	   }else if(commandArr.length == 3) {
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
	        		                    System.out.println("�����ļ��гɹ������ļ��о���·��Ϊ��" + copynewDir.getAbsolutePath());
	        		                    try {
	        		                        copyDir(oldFile, copynewDir);
	        		                    } catch (IOException e) {
	        		                        e.printStackTrace();
	        		                    }
	        		                }
	        		            }
	        		        } else {      //��������ļ�����ָ��Ҫ���Ƶ�Ŀ¼�ﲻ����
	        		            try {
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
	        	        System.out.printf("������=%.2f GB, ����δʹ��=%.2f GB, �Ѿ�ʹ��=%.2f GB%n", totalGB, freeGB, usedGB);    	          	        
		           }
	        	           	      	   
	           }else if("cd".equals(commandArr[0])) {
	        	   if(commandArr.length == 2) {
	        		   String cdDirName = commandArr[1];
	        	       userHome = userHome + "\\" + cdDirName; 
	        	     // System.out.println(userHome);
	        	        File file = new File(userHome);
	        	        if(file.exists() && file.isDirectory()) {
	        	            System.setProperty("user.home", userHome);  //��ϵͳ���� "user.home"��ֵ����ΪuserHome�������������ַ���  
	        	        }else {
	        	            System.out.println("û���ҵ�" + commandArr[1] + "�ļ���");
	        	        }      		     
	        	   }
	        	  
	           }else if ("d:".equals(commandArr[0])) { 
	        	    userHome = "D:\\";
	        	    File disk = new File(userHome);
	        	    if (disk.exists()) {
	        	        System.setProperty("user.home", userHome);  
	        	    } else {
	        	        System.out.println("�豸δ����");
	        	    }
	        	   
	        	   
	        	   
	           }else if ("cd../".equals(commandArr[0])) {
	        	   
	        	    String[] cdArr = userHome.split("\\\\");  //�ĸ���б�ܱ�ʾһ����б��
	        	    
	        	    /**
	        	     * 
	        	     * cdArr[0] = c:
	        	     * cdArr[1] = users
	        	     * cdArr[2] = USER
	        	     * ��һ�͵�����б�����ַ�����ת�����ת���Ľ����\\
	        	     * split���������Ĳ����ַ������������������ʽ�е�\\�����Ӧ\
	        	     * ���Էָ���б�ܵ�ʱ��Ҫд�ĸ���б�ܡ�
	        	     * 
	        	     */
	        	    int len = cdArr.length;
	        	    if (len > 1) {
	        	        String cdDir = userHome.substring(0, userHome.lastIndexOf("\\"));
	        	        System.setProperty("user.home", cdDir);
	        	    } else {
	        	        System.out.println("�Ѿ������Ŀ¼���޷��ٷ�����һ��");
	        	    }
	        	}

	           else{                	
		               System.out.println("'"  +  commandArr[0] + "'"  +  
		               "�����ڲ����ⲿ����,Ҳ���ǿ����еĳ�����������ļ�");
		            }
	                
		        }// while end
			}// try end

		}// main end
		

		
		
		

		
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
	   
}
































	                           	               














