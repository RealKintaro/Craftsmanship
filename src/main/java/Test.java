import java.sql.Connection;

import dao.ConnectionManager;

public class Test {
public static void main(String[] args) {
	ConnectionManager cm=ConnectionManager.getInstance();
	Connection con=cm.openConnection();
	cm.closeConnection(con);
	System.out.println(con);
	System.out.println("Hello World");
}
}
