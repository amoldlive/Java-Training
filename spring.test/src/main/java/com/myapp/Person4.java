package com.myapp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person4 {
	String name;

	List<String> cityName;

	Set<String> stateName;

	Map<Integer, String> userData;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCityName() {
		return cityName;
	}

	public void setCityName(List<String> cityName) {
		this.cityName = cityName;
	}

	public Set<String> getStateName() {
		return stateName;
	}

	public void setStateName(Set<String> stateName) {
		this.stateName = stateName;
	}

	

	public Map<Integer, String> getUserData() {
		return userData;
	}

	public void setUserData(Map<Integer, String> userData) {
		this.userData = userData;
	}

	public Person4() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person4 [name=" + name + ", cityName=" + cityName + ", stateName=" + stateName + ", userData="
				+ userData + "]";
	}

	public Person4(String name, List<String> cityName, Set<String> stateName, Map<Integer, String> userData) {
		super();
		this.name = name;
		this.cityName = cityName;
		this.stateName = stateName;
		this.userData = userData;
	}
	
	
	
}
