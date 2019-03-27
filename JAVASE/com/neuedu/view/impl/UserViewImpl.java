package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;
/**
 * ������û��������ռ��û�¼����Ϣ
 */
public class UserViewImpl implements UserView{
	UserBiz userbiz=new UserBizImpl();
	
	public void login() throws  LoginException{ 
		Scanner s=new Scanner(System.in);
		System.out.print("�������û���:");
		String username=s.nextLine();
		boolean a=userbiz.isusernameexits(username);
		if(a) {
			 System.out.print("����������:");
			 String password=s.nextLine();
			 userbiz.login(username, password);
		}
	}
   public void register() throws RegisterException {
	   Scanner s=new Scanner(System.in);
	    System.out.print("�������û���:");
	    String username=s.nextLine();
	    boolean a=userbiz.isusernameexits1(username);
	    if(a) {
	    	System.out.print("����������:");
	    	String password=s.nextLine();
	    	boolean a1=userbiz.ispasswordexits(password);
	    	if(a1) {
	    		 System.out.print("���ظ�����:");
	    		 String password2=s.nextLine();
	    		 boolean a2=userbiz.ispasswordexits1(password, password2);
	    		 if(a2) {
	    			   System.out.print("��������ʵ����:");
	    			   String name=s.nextLine();
	    			   System.out.print("����������ʼ���ַ:");
	    			   String email=s.nextLine(); 
	    		 }
	    		 
	    	}
	    }
	    
	   
	   
	 
   }
}
