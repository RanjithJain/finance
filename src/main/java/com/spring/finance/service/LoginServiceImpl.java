package com.spring.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.finance.dao.*;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDao loginDao;

	   public void setLoginDao(LoginDao loginDAO) {
              this.loginDao = loginDAO;
       }
      
       public boolean checkLogin(String userName, String userPassword){
              System.out.println("In Service class...Check Login");
              return loginDao.checkLogin(userName, userPassword);
       }
}
