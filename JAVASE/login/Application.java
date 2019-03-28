package com.login;

import java.util.Scanner;

import com.login.user.Admin;

public class Application {

	public static void main(String[] args) {
welcome();
		
		
		Admin[] admins = new Admin[5];
		initData(admins);//数据初始化
		operation(admins);
		}
	
	public static void initData(Admin[] admins){
		Admin admin = new Admin("admin","admin");
		admins[0] = admin;
	}
	
	public static void operation(Admin[] admins){
		Scanner s = new Scanner(System.in);
		System.out.print("请选择：");
		int operation = s.nextInt();
		
		if(operation == 1){
			//登录
			login(admins);
		}else if(operation == 2){
			//退出
			System.exit(0);
		}else {
			System.out.println("输入有误，请重新输入。。。。。");
			operation(admins);//递归调用
		}
		
	}
	
	public static void login(Admin[] admins){
		System.out.println("欢迎登录！");
		Scanner s = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = s.nextLine(); 
		System.out.print("请输入密码：");
		String password = s.nextLine();
		
		for(int i = 0;i < admins.length;i++){
			Admin admin = admins[i];
			
			if(admin == null){
				continue;
			}
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("登录成功");
				System.out.println("欢迎您，" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
	    System.out.println("---------------欢迎 登录学生信息管理系统---------------");
		System.out.println("1.登录   2.退出");
		System.out.println("-------------------------------------------------------");
    }
	
}



