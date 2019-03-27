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
		System.out.println("-------��ӭ���ʼƷ�ϵͳ--------");
		Scanner s= new Scanner(System.in);
		System.out.println("----�����룺1.��¼  2.ע��----");
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
		System.out.println("ע��ɹ�����");
	}
	
	
	
}
