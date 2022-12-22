package com.enfec.comsumeapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.enfec.comsumeapi.model.ResultType;
import com.enfec.comsumeapi.model.User;
import com.enfec.comsumeapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;	

	@GetMapping("/getInfo")
	@ResponseBody
	public void getInfo() {
		String url = "https://jsonplaceholder.typicode.com/users";
		RestTemplate restTemplate = new RestTemplate();
		User[] user = restTemplate.getForObject(url, User[].class);
//		Type[] type = new Type[user.length];
//		int i = 0;
//		for (User u : user) {
//			Type temp = new Type();
//			temp.setUsername(u.getUsername());
//			temp.setEmail(u.getEmail());
//			temp.setZipCode(u.getAddress().getZipcode());
//
//			type[i++] = temp;
//		}
//		return Arrays.asList(type);
		
		userService.getInfo(user);
//		System.out.println("User: " + user);
//		  
//		return "User detail page.";
	}
	
	static class Type {
		String username;
		String email;
		String zipcode;
		public void setUsername(String username) {}
		public void setEmail(String email) {}
		public void setZipCode(String zipcode) {}
	}
	
	@GetMapping("/getPartialInfo")
//	@ResponseBody
	public ResultType[] getPartialInfo() {
		return userService.getPartialInfo();
	}
}
