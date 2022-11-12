package com.Service;

import java.util.List;

import com.Model.Student;

import Dao.DataImpl;

public class ServiceImpl implements Service {
DataImpl service=new DataImpl();
	public List<Student> GetAll() {
		
		return service.GetAll();
	}
	public void delete_by_ID(int id) {
		service.delete_by_ID(id);
		
	}
	public void AddStudent(Student student) {
	service.AddStudent(student);
		
	}
	public Student GetbyId(int id) {
		
		return service.GetbyId(id);
		
		
	}
	public void update(Student student) {
		service.update(student);
		
	}

//	public static void main(String[] args) {
//		ServiceImpl s=new ServiceImpl();
//		
//		Student student=new Student("shan", 1, "java", "hyd");
//		
//		s.update(student);
//	}
}
