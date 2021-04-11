package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl implements LoginDao{
	public LoginDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean authenticate(String email, String password) throws Exception {
		
		// TODO Auto-generated method stub
		ConnectionManager cm=ConnectionManager.getInstance();
		Connection con=cm.openConnection();
		String sql="select email,password from user where email=? and password=?";
		String [] args= {email,password};
		PreparedStatement ps=StatementManager.stmtprepare((Connection) con,sql,args);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

	

}
