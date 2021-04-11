package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static ConnectionManager instance;
	static String url="jdbc:mysql://localhost:3306/hajar-store?useSSL=false";
	static String user="root";
	static String password="";
	public ConnectionManager() {
		
	}
	public static ConnectionManager getInstance() {
		if(instance==null)instance=new ConnectionManager();
		return instance;
	}
	public  Connection openConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hajar-store","root","");
		
			
			return con; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
