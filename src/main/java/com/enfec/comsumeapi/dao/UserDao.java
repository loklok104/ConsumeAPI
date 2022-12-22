package com.enfec.comsumeapi.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.enfec.comsumeapi.model.ResultType;
import com.enfec.comsumeapi.model.User;

@Repository
public class UserDao {
	List<User> userList = new ArrayList<>();

	public void getInfo(User[] info) {
		System.out.println("I am in dao");
		for (int i = 0; i < info.length; i++) {
//			System.out.println(i);
			userList.add(info[i]);
		}
		System.out.println(userList.size());
	}

	public ResultType[] getPartialInfo() {
		ResultType[] result = new ResultType[userList.size()];
//		List<String[]> result = new ArrayList<>();
//		System.out.println("I am in dao2");
		for (int i = 0; i < userList.size(); i++) {
//			result.add(new String[] {userList.get(i).getUsername(),
//					userList.get(i).getEmail(), userList.get(i).getAddress().getZipcode()});
			ResultType rt = new ResultType();
			rt.setUsername(userList.get(i).getUsername());
			rt.setEmail(userList.get(i).getEmail());
			rt.setZipcode(userList.get(i).getAddress().getZipcode());
			result[i] = rt;
			
		}
//		System.out.println("I am in dao3");
		return result;
	}

}
