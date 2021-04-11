package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import beans.User;

public class SignupDaoImpl implements Dao{

	public SignupDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Object t) {
		// TODO Auto-generated method stub
		User user=(User)t;
		
		ConnectionManager cm= ConnectionManager.getInstance();
		Connection con= cm.openConnection();
		String sql="insert into user(nom,prenom,email,mdp) values(?,?,?,?)";
		String args[]= {user.getNom(),user.getPrenom(),user.getEmail(),user.getMotdepass()};
		PreparedStatement ps=StatementManager.stmtprepare(con, sql, args);
		try {
			boolean rs=ps.execute();
			if(rs) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
		
	}

	@Override
	public void update(Object t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object t) {
		// TODO Auto-generated method stub
		
	}

}
