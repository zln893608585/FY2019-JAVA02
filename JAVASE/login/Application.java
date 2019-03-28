package com.login;

import java.util.Scanner;

import com.login.user.Admin;

public class Application {

	public static void main(String[] args) {
welcome();
		
		
		Admin[] admins = new Admin[5];
		initData(admins);//���ݳ�ʼ��
		operation(admins);
		}
	
	public static void initData(Admin[] admins){
		Admin admin = new Admin("admin","admin");
		admins[0] = admin;
	}
	
	public static void operation(Admin[] admins){
		Scanner s = new Scanner(System.in);
		System.out.print("��ѡ��");
		int operation = s.nextInt();
		
		if(operation == 1){
			//��¼
			login(admins);
		}else if(operation == 2){
			//�˳�
			System.exit(0);
		}else {
			System.out.println("�����������������롣��������");
			operation(admins);//�ݹ����
		}
		
	}
	
	public static void login(Admin[] admins){
		System.out.println("��ӭ��¼��");
		Scanner s = new Scanner(System.in);
		System.out.print("�������û�����");
		String username = s.nextLine(); 
		System.out.print("���������룺");
		String password = s.nextLine();
		
		for(int i = 0;i < admins.length;i++){
			Admin admin = admins[i];
			
			if(admin == null){
				continue;
			}
			if(username.equals(admin.username) && password.equals(admin.password)){
				System.out.println("��¼�ɹ�");
				System.out.println("��ӭ����" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
	    System.out.println("---------------��ӭ ��¼ѧ����Ϣ����ϵͳ---------------");
		System.out.println("1.��¼   2.�˳�");
		System.out.println("-------------------------------------------------------");
    }
	
}



