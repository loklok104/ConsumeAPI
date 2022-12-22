package com.enfec.comsumeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enfec.comsumeapi.dao.UserDao;
import com.enfec.comsumeapi.model.ResultType;
import com.enfec.comsumeapi.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public void getInfo(User[] info) {
		System.out.println("I am in service");
		userDao.getInfo(info);
	}

	public ResultType[] getPartialInfo() {
		return userDao.getPartialInfo();
	}

}
