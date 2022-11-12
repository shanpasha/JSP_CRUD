package Dao.Util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UtilConnection {
	
	public static  Properties pro=null;
	public static Connection con=null;
	public static Statement statement=null;
	public static ResultSet result=null;
	
	
	static {
		try {
			pro=new Properties();
			pro.load(UtilConnection.class.getClassLoader().getResourceAsStream("Db.properties"));
		
		Class.forName(pro.getProperty("driver"));
		con=DriverManager.getConnection(pro.getProperty("url"),pro.getProperty("userName"),pro.getProperty("password"));
	
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connection getConnection() {
		return con;
		
	}
	
	public static void close(Connection con,Statement statement,ResultSet resultSet) {
		try {
			con.close();
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void close(Connection con,Statement statement) {
		try {
			con.close();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(getConnection());
	}

}
