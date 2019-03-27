package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class ChargingSystem {
	public static void main(String[] args){
		ChargingSystem charge=new ChargingSystem();
		charge.choice();
		
	}
	
	public void choice(){
		System.out.println("-------欢迎访问计费系统--------");
		Scanner s= new Scanner(System.in);
		System.out.println("----请输入：1.登录  2.注册----");
		int num=s.nextInt();
		UserView view=new UserViewImpl();
		if(num==1) {
			
			try {
				view.login();
				}catch(LoginException e) {
					System.out.println( e.getMessage());
				}
			
			
		}else if(num==2) {
			
			try {
				view.register();
				}catch(RegisterException e) {
					System.out.println( e.getMessage());
				}
		}
		System.out.println("注册成功！！");
	}
	
	
	
}
