package com.Model;

public class Student {
	private String name;
	private int roll;
	private String course;
	private String location;
	public Student(String name, int roll, String course, String location) {
		super();
		this.name = name;
		this.roll = roll;
		this.course = course;
		this.location = location;
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", course=" + course + ", location=" + location + "]";
	}
	
	

}
