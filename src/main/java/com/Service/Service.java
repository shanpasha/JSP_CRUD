package com.Service;

import java.util.List;

import com.Model.Student;

public interface Service {
	
	public List<Student> GetAll();
	public void delete_by_ID(int id);
	public void AddStudent (Student student);
	public Student  GetbyId(int id);
	public void update(Student student);
}
