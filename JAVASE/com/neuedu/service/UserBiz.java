package com.neuedu.service;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User; 

public interface UserBiz{
     void register(String username, String password, String password2,
    		       String name, String email)throws RegisterException; //�û�ע��;
     void login(String username, String password)throws LoginException; //�û���¼;
     /**
      * �ж��û��Ƿ����
      */
	boolean isusernameexits(String username) throws LoginException; 
	boolean isusernameexits1(String username) throws RegisterException; 
	boolean ispasswordexits(String password) throws RegisterException; 
	boolean ispasswordexits1(String password,String password2) throws RegisterException;
     
}
