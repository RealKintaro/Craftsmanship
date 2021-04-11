package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatementManager {
	private static PreparedStatement ps;
	public static PreparedStatement stmtprepare(Connection con,String sql,Object args[]) {
		try {
			 ps=con.prepareStatement(sql);
	
		for(int i=0;i<args.length;i++) {
			
				ps.setObject(i+1, args[i]);
			
		}
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("errrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		}
		return ps;
		
	}
}
