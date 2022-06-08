package com.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginManager {
	Map<String, String> map;

	public LoginManager() {
		loadCredentials();
	}

	private Map<String, String> loadCredentials() {
		map = new HashMap();

		map.put("admin", "admin123");
		map.put("sonu@gmail.com", "Test@123");

		return map;
	}
	
	public String getPassword(String userId) {
		return map.get(userId);
	}
}
