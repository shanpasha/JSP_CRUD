package Dao;

import java.util.List;

import com.Model.Student;

public interface Dao {
	public List<Student> GetAll();
	public void delete_by_ID(int id);
	public void AddStudent (Student student);
	public Student  GetbyId(int id);
	public void update(Student student);
	
	
}
