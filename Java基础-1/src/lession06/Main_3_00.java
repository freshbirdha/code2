package lession06;

import java.util.Scanner;

/**
 * 作业类型：代码编写
 * 作业内容：在本代码中指定行填写注释
 * 
  * 《《《DVD管理系统0.1版本》》》
 * 
 * @author banma
 */
public class Main_3_00 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
		String[] name = new String[50];
		// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
		int[] state = new int[50];
		// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
		String[] date = new String[50];

		// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
		name[0] = "罗马假日";
		state[0] = 0;
		date[0] = "2010-7-1";

		name[1] = "风声鹤唳";
		state[1] = 1;
		date[1] = "";

		name[2] = "浪漫满屋";
		state[2] = 1;
		date[2] = "";

		// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
		while (true) {
			System.out.println("欢迎使用迷你DVD管理器");
			System.out.println("-----------------------");
			System.out.println("1，新增DVD");
			System.out.println("2，查看DVD");
			System.out.println("3，删除DVD");
			System.out.println("4，借出DVD");
			System.out.println("5，归还DVD");
			System.out.println("6，退\t出");
			System.out.println("-----------------------");

			System.out.print("请选择： ");
			String numb = sc.next();
			
			// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
			if ("1".equals(numb)) {
				System.out.println("----> 新增DVD");
				System.out.println(" ");
				System.out.print("请输入需要增加的DVD名称：");
				
				String dvdName = sc.next();
				boolean isAddSuccess = false;
				
				for (int i = 0; i < name.length; i++) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (name[i] == null) {
						name[i] = dvdName;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						state[i] = 1;
						date[i] = "";
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						isAddSuccess = true;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						break;
					}
				}
				
				if(isAddSuccess) {
					System.out.println("添加DVD《"+dvdName+"》成功！");
				}else {
					// 请在这样写出 什么情况下会失败的 注释
					System.out.println("添加DVD《"+dvdName+"》失败！");
				}
				
			} else if ("2".equals(numb)) {
				
				System.out.println("----> 查看DVD");
				System.out.println(" ");
				System.out.println("序号\t状态\t 名称\t\t借出日期");

				for (int i = 0; i < name.length; i++) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (name[i] == null) {
						continue;
					}
					
					String states = "可借";
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (state[i] == 0) {
						states = "已借出";
					}

					System.out.println((i + 1) + "\t" + states + "\t" + name[i]
							+ "\t" + date[i]);
				}
			} else if ("3".equals(numb)) {
				
				System.out.println("----> 删除DVD");
				System.out.println(" ");
				System.out.print("请输入DVD名称：");
				String del = sc.next();
				
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				boolean deletesucess = false;
				for (int i = 0; i < name.length; i++) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (name[i] == null) {
						continue;
					}
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (del.equals(name[i])) {
						name[i] = null;
						deletesucess = true;
						break;
					}
				}
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				if (deletesucess) {
					System.out.println("删除成功！");
				} else {
					System.out.println("删除失败！需要删除的dvd没有！");
				}

			} else if ("4".equals(numb)) {
				System.out.println("----> 借出DVD");
				System.out.println(" ");
				System.out.print("请输入DVD名称：");
				String lend = sc.next();
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				boolean has = false;
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				boolean islend = false;
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				int index = 0;

				for (int i = 0; i < name.length; i++) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (name[i] == null) {
						continue;
					}
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (lend.equals(name[i])) {
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						index = i;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						if (state[i] == 0) {
							// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）	
							islend = true;
						}
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						has = true;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						break;
					}
				}// end for

				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				if (has) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (islend) {
						System.out.print("已经借出，不能借了。");
						return;
					}

					System.out.print("请输入借出日期(年-月-日)：");
					String d = sc.next();

					date[index] = d;
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					state[index] = 0;

					System.out.println("借出 《" + lend + "》 成功!");

				} else {
					System.out.println("借出失败！需要借出的dvd没有！");
				}
				
			} else if ("5".equals(numb)) {
				
				System.out.println("----> 归还DVD");
				System.out.println(" ");
				System.out.print("请输入需要归还DVD名称：");
				String retur = sc.next();
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				boolean have = false;
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				boolean isretur = false;
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				int index = 0;

				for (int i = 0; i < name.length; i++) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (name[i] == null) {
						continue;
					}
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (retur.equals(name[i])) {
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						index = i;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						if (state[i] == 0) {
							// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
							isretur = true;
						}
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						have = true;
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						break;
					}
				}

				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				if (have) {
					// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
					if (isretur == false) {
						System.out.println("归还失败！ 没有借出过这个DVD。");
					}else {
						// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
						System.out.println("归还 《" + retur + "》 成功!");
						state[index] = 1;
						date[index] = "";
					}

				
				} else {
					System.out.println("归还失败！需要归还的dvd没有！");
				}

			} else if ("6".equals(numb)) {
				// 请在这行填写注释，解释下部分代码的含义/作用 等！（尽可能让看代码的人通过观看注释 能对代码有较好的理解）
				System.out.println("谢谢使用！");
				break;
			}else{// 什么情况下会进入这个else语句？？？
				System.out.println("错误选项！请重新选择");
			}
			
			System.out.println("************************");
			System.out.print ("输入0返回：");
			System.out.println (" ");
			//返回主页，这里仅仅只是为了让程序停顿下来
			sc.next(); 
			
		}// while end
	}
}
