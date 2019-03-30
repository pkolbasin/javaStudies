package lesson6;

import java.util.Date;

public class User {
	String name;
	int age;
	String city;
	Date lastActiveDate;
	boolean isActive;
	
	public User(String name, int age, String city, Date lastActiveDate, boolean isActiv) {
	
		this.name = name;
		this.age = age;
		this.city = city;
		this.lastActiveDate = lastActiveDate;
		this.isActive = isActiv;
	}
	
	void logIn(){
		lastActiveDate = new Date();
		
	}
	
	
	void isActive(boolean status){
		isActive = status;
	}
	void increaseAge() {
		age++;
	}

	public User(String name) {
		this.name = name;
	}

	public User() {
		
	}                     
}
