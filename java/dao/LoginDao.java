package dao;

public interface LoginDao {
	public boolean authenticate(String email, String password) throws Exception;
}