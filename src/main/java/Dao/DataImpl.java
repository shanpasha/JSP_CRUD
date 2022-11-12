package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.Model.Student;
import com.mysql.cj.util.Util;

import Dao.Util.UtilConnection;



public class DataImpl implements Dao {

	public List<Student> GetAll() {
		List<Student> list = new ArrayList<Student>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		con = UtilConnection.getConnection();

		try {
			ps = con.prepareStatement("select*from student");

			rs= ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				student.setRoll(rs.getInt("roll"));
				student.setName(rs.getString("name"));
				student.setCourse(rs.getString("course"));
				student.setLocation(rs.getString("location"));

				list.add(student);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
//public static void main(String[] args) {
//	DataImpl s=new DataImpl();
//	System.out.println(s.GetAll());
//	

	public void delete_by_ID(int id) {

		Connection con = UtilConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("delete from student where roll=?");

			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//public static void main(String[] args) {
//	
//	DataImpl m=new DataImpl();
//	m.delete_by_ID(3);
//	
//			
//}

	public void AddStudent(Student student) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		con = UtilConnection.getConnection();

		try {
			ps = con.prepareStatement("insert into student values(?,?,?,?)");

			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getLocation());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Student GetbyId(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		con = UtilConnection.getConnection();
		try {
			ps = con.prepareStatement("select*from student where roll=?");
			ps.setInt(1, id);

			rs = ps.executeQuery();
			Student student = new Student();
			if (rs.next()) {

				student.setRoll(rs.getInt(1));
				student.setName(rs.getString(2));
				;
				student.setCourse(rs.getString(3));
				student.setLocation(rs.getString(4));

			}

			return student;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public void update(Student student) {
		Connection con = null;
		PreparedStatement ps = null;

		con = UtilConnection.getConnection();
		try {
			ps = con.prepareStatement("update student set name=?,course=?,location=? where roll=?");
			ps.setInt(4, student.getRoll());
			ps.setString(1, student.getName());
			ps.setString(2, student.getCourse());
			ps.setString(3, student.getLocation());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	public static void main(String[] args) {
//		DataImpl s=new DataImpl();
//		System.out.println(s.GetAll());
//				
//	}
}
