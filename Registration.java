package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name=request.getParameter("user");
			String password=request.getParameter("password");
			String sql="insert into LOGIN values(?,?)";
			
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.executeUpdate();
			PrintWriter out=response.getWriter();
			out.println("You have Registered");
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
