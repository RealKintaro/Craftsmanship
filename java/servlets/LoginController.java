package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConnectionManager;
import dao.StatementManager;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ResultSet rs;
	private PreparedStatement ps;
	private Connection con;
	private String email,password;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//getting the parameters
		email=request.getParameter("gmail");
		password=request.getParameter("Password");
		
		System.out.println(email);
		System.out.println(password);
		
		
		try {
			ConnectionManager cm=ConnectionManager.getInstance();
			Connection con=cm.openConnection();
			String sql="select * from user where email=? and mdp=?";
			String args[]= {email,password};
			PreparedStatement ps=StatementManager.stmtprepare(con, sql, args);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//request.getRequestDispatcher("index.jsp").forward(request, response);
	
		
		//
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
