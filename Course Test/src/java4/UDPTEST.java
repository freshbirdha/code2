package java4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class UDPTEST {

	public static void main(String[] args) throws Exception {
		System.out.println("欢迎使用斑马文件管理系统[Version 0.7]");
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
                	
                	logger("使用 " + "exit"); 
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
                    logger("使用 " + "dir" ); 
                    
                }else if("mkdir".equals(commandArr[0])) {
                	 if (commandArr.length == 2) {
                		 String dirName = commandArr[1];
		                 File sub = new File(userHome, dirName);
		             	 sub.mkdirs();
		             	logger("mkdir " + dirName); 
             		}else {
             			System.out.println("输入参数有误!");
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
        	        					
        	        					System.out.println("复制文件成功，新文件绝对路径为：" + copynewFile.getAbsolutePath());				
        	        					
        	        					logger("copy " + fileName);  
									} catch (Exception e) {
										// TODO: handle exception
										e.printStackTrace();
									}              	        					
        	        		    }
        	        	   }
        	         }
            	        
        	   }else if(commandArr.length == 3) {  //复制文件到指定的绝对路径中
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
        		           
        		            System.out.println("复制文件成功，新文件绝对路径为：" + copyFile.getAbsolutePath());
        		           
        		            logger("copy " + fileName); 
        		        } catch (Exception e) {
        		            e.printStackTrace();
        		        } 
        		    } else if(oldFile.isDirectory()) {
        		        String dirName = commandArr[1];  // 获取输入的文件夹名称
        		        String copydirPath = commandArr[2];// 获取输入的复制文件夹路径
        		        File copyDir = new File(copydirPath, dirName);// 创建复制文件夹的File对象
        		        if(copyDir.exists()) {
        		            String copydirName = dirName;
        		            int count = 0;
        		            boolean flag = false;
        		            while(!flag) {
        		                File copynewDir = new File(copydirPath,copydirName);  // 创建新的复制文件夹对象
        		                if(copynewDir.exists()) {  // 如果新的复制文件夹对象在指定目录里已经存在
        		                	 count++;
         		                     copydirName = dirName + "(" + count + ")";

        		                } else {  //如果新的复制文件夹对象在指定目录里不存在
        		                    copynewDir.mkdirs(); 
        		                    flag = true;
        		                   
        		                    System.out.println("复制文件夹成功，新文件夹绝对路径为：" + copynewDir.getAbsolutePath());
        		                    logger("copy " + dirName); 	                 
        		                    try {
        		                        copyDir(oldFile, copynewDir);
        		                        
        		                    } catch (IOException e) {
        		                        e.printStackTrace();
        		                    }
        		                }
        		            }
        		        } else {      //如果复制的文件夹在指定要复制的目录里不存在
        		            try {      		            	 
								copyDir(oldFile, copyDir);  //用递归方法遍历文件夹的内容到指定目录
								
        		            } catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
        		            System.out.println("复制文件夹成功，新文件夹绝对路径为：" + copyDir.getAbsolutePath());
        		            logger("copy " + dirName); 
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
        	        System.out.printf("总容量=%.2f GB, 空闲未使用=%.2f GB, 已经使用=%.2f GB%n", totalGB, freeGB, usedGB);    	          	        
        	        logger("df " + root); 
        	   }
        	           	      	   
           }else if("cd".equals(commandArr[0])) {
        	   if(commandArr.length == 2) {
        		   String cdDirName = commandArr[1];
        	       userHome = userHome + "\\" + cdDirName; 
        	     // System.out.println(userHome);
        	        File file = new File(userHome);
        	        if(file.exists() && file.isDirectory()) {
        	            System.setProperty("user.home", userHome);  //将系统属性 "user.home"的值设置为userHome变量所代表的字符串  
        	            logger("cd " + cdDirName); 
        	        }else {
        	            System.out.println("没有找到" + commandArr[1] + "文件夹");
        	        }      		     
        	   }
        	  
           }else if ("d:".equals(commandArr[0])) { 
        	    userHome = "D:\\";
        	    File disk = new File(userHome);
        	    if (disk.exists()) {
        	        System.setProperty("user.home", userHome); 
        	        logger("d: " + "D:\\"); 
        	    } else {
        	        System.out.println("设备未就绪");
        	    }
        	        	         	   
           }else if ("cd../".equals(commandArr[0])) {
        	 //split函数解析的不是字符串而是正则，正则表达式中的\\结果对应\，所以用反斜杠分隔的时候要写四个反斜杠
        	   LinkedList<String> cdList = new LinkedList<>(Arrays.asList(userHome.split("\\\\")));
        	   
        	   /**
        	    * userHome字符串被\分割后
        	    * 
        	    * cdList[0] = C:
        	    * cdList[1] = Users
        	    * cdList[2] = USER
        	    */
        	   
        	    int len = cdList.size();
        	    if (len > 1) {
        	        cdList.removeLast();
        	        String cdDir = String.join("\\", cdList);  // 将数组里的元素合并成一个字符串
        	        System.setProperty("user.home", cdDir);
        	        logger("cd../ " + cdDir); 
        	    } else {
        	        System.out.println("退无可退了别再退了");
        	    }
        	   
        	}else if (commandArr[0].startsWith("cd../")) {
        		LinkedList<String> cdList = new LinkedList<>(Arrays.asList(userHome.split("\\\\")));
        		String substringDir = commandArr[0].substring(5); // 5是指从输入字符串中的第6个字符开始截取,相当于从cd../这个字符串后面开始截取
  
     	    	 File file = new File(userHome + "\\" + substringDir);
     	         if (file.exists() && file.isDirectory()) {
         	        if (cdList.size() > 1) {
         	            cdList.removeLast();
         	            cdList.addLast(substringDir);
         	            userHome = String.join("\\", cdList);
         	            System.setProperty("user.home", userHome);
         	            logger("cd../ " + substringDir); 
         	            
         	        } else {
         	            System.out.println("退无可退了别再退了");
         	        }
    	     	}else {
    	     		System.out.println("系统未找到该路径");
    	     	}
         	      	  
         }else if (commandArr[0].equals("find") && commandArr[1].equals("/")) {
        	    String searchPattern = ".*";
        	    List<File> fileList = new ArrayList<>(); // 用List数组来存储匹配到的文件
        	    File[] roots = File.listRoots();  //获取磁盘的所有根目录并返回数组
        	    
        	    if (commandArr.length > 3 && commandArr[3].equals(">") && commandArr[4].equals("info.txt")) {
        	        //多线程搜索盘符指定文件	    	
        	    	 String fileName = commandArr[2].replaceAll("\\.", "\\\\.");
         	         fileName = fileName.replaceAll("\\*", ".*");
         	         searchPattern = ".*" + fileName;
         	         FileThread fileThread = new FileThread(roots, Pattern.compile(searchPattern), fileList);
         	         fileThread.start();
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
             	          logger("使用" + "find / * > info.txt 查找" + commandArr[2]); 
             	    } catch (IOException e) {
             	        // TODO Auto-generated catch block
             	        e.printStackTrace();
             	    }
        	        
        	    } else { //控制台搜索盘符指定文件
        	    	if (commandArr.length > 2 ) {
            	        String fileName = commandArr[2].replaceAll("\\.", "\\\\.");
            	        fileName = fileName.replaceAll("\\*", ".*");
            	        searchPattern = ".*" + fileName;
            	    }
        	    	
            	    Pattern  pattern = Pattern.compile(searchPattern);

            	    for (File root : roots) {
            	        findFiles(root, pattern, fileList);
            	    }
            	    
            	    System.out.println("一共找到" + fileList.size() + "个匹配文件");
            	    logger("find / *" + commandArr[2]);  	    	
        	    }
        	    
        	  
        	}else if(commandArr[0].startsWith("find")) {
        		
        		if (commandArr.length == 2) { // 家目录查找
        			
        		    String fileName = commandArr[1];
        		    searchFiles(System.getProperty("user.home"), fileName);
        		    
        		    logger("find" + fileName); 
        		    
        		    
        		} else if (commandArr.length == 3) { // 指定目录查找
        			
        		    String directory = commandArr[1];
        		    String fileName = commandArr[2];
        		    searchFiles(directory, fileName);
        		    
        		    logger("find" + commandArr[1]  + " " + fileName); 
        		}

            				
        	} else if("notepad".equals(commandArr[0])){
        			try {
        				String [] cmd = {"cmd","/C","start notepad"};
						Runtime.getRuntime().exec(cmd);
						logger("使用 " + "notepad");
					} catch (IOException e) {
						e.printStackTrace();
					}
        		
        	}else if (commandArr[0].equals("getHash")) {
        		
        		if (commandArr.length > 2) {     			
        	        String hashAlgorithm = commandArr[1];
        	        String fileName = commandArr[2];
        	        calculateHash(fileName, hashAlgorithm);
        	    }
		  		   	
    	
        	}else if(commandArr[0].equals("encode") && commandArr[1].equals("VisualStudioSetup.exe")) {
        		
        		  byte[] key = "0123456789abcdef".getBytes("UTF-8");
        		  
        		  String fileName = "VisualStudioSetup.exe";
        		  
        		  File inputFile = new File(fileName);
        		  
        		  byte[] data = readFile(inputFile);
        		  
                  byte[] encrypted = encrypt(key, data);
	    		      		  
	    		  String scString = Base64.getEncoder().encodeToString(encrypted);
	    		  
	    		  System.out.println("加密成功,您的密钥为:" + scString + " 请保存好您的密钥，否则后果自负");
	    		  
	    		  File encryptedFile = new File("VisualStudioSetup(已加密).exe");
	    		  
	    		  renamenewFile(encrypted, encryptedFile);
	    		  
                  System.out.println("加密后的文件:" + encryptedFile.getName());
                  
               
        		
        	}else if(commandArr[0].equals("decode") && commandArr[1].equals("VisualStudioSetup(已加密).exe")) {
	        		
        		    byte[] key = "0123456789abcdef".getBytes("UTF-8");
        		    
        		    String fileName = "VisualStudioSetup(已加密).exe";
        		    
        		    File encryptedFile = new File(fileName);
        		    
        		    byte[] encryptedData = readFile(encryptedFile);
        		    
        		    byte[] decrypted = decrypt(key, encryptedData);
        		    
        		    File decryptedFile = new File("VisualStudioSetup(已解密).exe");
        		    
        		    renamenewFile(decrypted, decryptedFile);
        		    
        		    System.out.println("解密后的文件:" + decryptedFile.getName());
            }else if(commandArr[0].equals("ping")) {
            	
            	  if (commandArr.length > 1) {
	                    String hostname = commandArr[1]; 
	                   
	                    InetAddress address = InetAddress.getByName(hostname);
	                    long start = System.currentTimeMillis();
	                    boolean isReachable = address.isReachable(1000);
	                    long end = System.currentTimeMillis();
	                    long diff = end - start;
                        if (isReachable) {
                            System.out.println("Reply from " + address.getHostAddress() + " time=" + diff + "ms");
                        } else {
                            System.out.println("未找到网址或连接出错");
                        }
                 }
            	
            }else if(commandArr[0].equals("who")) {
            	
            	         getUsers();
                         	
            } else {            		              	
	               System.out.println("'"  +  commandArr[0] + "'"  +  
	               "不是内部或外部命令,也不是可运行的程序或批处理文件");
	            }
                
	        }// while end
	
		}// try end

	}// main end
	
	
	

	private static void getUsers() {
		// TODO Auto-generated method stub
		
		String username = System.getProperty("user.home");
			
		//获取IP地址
		InetAddress localhost = null;
		
		try {
			localhost = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ipAddress = localhost.getHostAddress();
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
        Date currentTime = new Date();
        
        String currenttimeStr = ft.format(currentTime);
        
        // 打印用户信息
        
        String[] userStrings = username.split("\\\\");
        String lastString = userStrings[userStrings.length - 1];
        
        System.out.println(lastString + " " + ipAddress + " " + currenttimeStr);
    }
  
	
	private static byte[] decrypt(byte[] key, byte[] encrypted) {
		// TODO Auto-generated method stub
		try {
	        Cipher cipher = Cipher.getInstance("AES");
			SecretKey keySpec = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.DECRYPT_MODE, keySpec);
			return cipher.doFinal(encrypted);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}




	private static void renamenewFile(byte[] encrypted, File encryptedFile) {
		// TODO Auto-generated method stub
		try {
			 FileOutputStream fileOutputStream = new FileOutputStream(encryptedFile);
		     fileOutputStream.write(encrypted);
		     fileOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}



	private static byte[] readFile(File inputFile) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream(inputFile);
        byte[] bytes = new byte[(int) inputFile.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        return bytes;
	}


	private static byte[] encrypt(byte[] key, byte[] data) throws GeneralSecurityException {
		// TODO Auto-generated method stub		
		Cipher cipher = Cipher.getInstance("AES");
		SecretKey keySpec = new SecretKeySpec(key, "AES");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		return cipher.doFinal(data);
	}


	private static void calculateHash(String fileName, String hashAlgorithm) {
		// TODO Auto-generated method stub
		try {
			File file = new File(fileName);
	        if (file.exists()) {
	            FileInputStream inputStream = new FileInputStream(file);
	            MessageDigest mDigest = MessageDigest.getInstance(hashAlgorithm);
	            byte[] bytes = new byte[2048];
	            int len;
	            while ((len = inputStream.read(bytes)) != -1) {
	            	mDigest.update(bytes, 0, len);
	            	bytes = new byte[2048];
	            }           
	            inputStream.close();	
	            
	            String hashString = new BigInteger(1,mDigest.digest()).toString(16);
	            System.out.println(hashString);
	        } else {
	            System.out.println("没有找到文件");
	        }
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}

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

	    System.out.println("一共找到" + count + "个匹配文件");
		
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
	            	int index = fileList.size() - 1; // 获取新加文件的索引
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
		
	    String fileName = new SimpleDateFormat("yyyyMMdd'.log'").format(new Date());// 获取当前日期作为日志文件名
	    
	    // 在系统用户目录下创建logs文件夹
	    File logsDir = new File(System.getProperty("user.home"), "logs"); 
	    logsDir.mkdirs();   
	    
	    //创建日志文件
	    File logFile = new File(logsDir, fileName);
	    
	    try {
	        if (!logFile.exists()) {// 如果日志文件不存在的话，则新建文件
	            logFile.createNewFile();
	        }
	        FileWriter writer = new FileWriter(logFile, true); // 创建FileWriter对象，并设置为追加模式
	        //格式化日志信息
	        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        String dateTimeStr = dateTimeFormat.format(new Date());
	        String logMessage = String.format("%s %s%n", dateTimeStr, message);
	        
	        // 将格式化后的日志消息写入日志文件中
	        writer.write(logMessage);
	        writer.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
}// class Main_0_1 end



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
	                int index = fileList.size() - 1; // 获取新加文件的索引
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

