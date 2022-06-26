package com.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsManager {
	Map<String, String> map;

	public ContactsManager() {
		loadContacts();
	}

	private Map<String, String> loadContacts() {
		map = new HashMap();

		map.put("Rohan Roy", "9999999999");
		map.put("Priya Sharma", "7777777777");
		map.put("Shreya Thorat", "1234456789");
		map.put("Mina Kumari", "6666666666");
		map.put("Suraj Varma", "1111111111");

		return map;
	}
	
	public Map<String, String> getContacts() {
		return map;
	}
}
