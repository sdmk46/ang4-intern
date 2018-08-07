package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Connection con=null;
		
		PrintWriter out=response.getWriter();
		Integer userid= Integer.parseInt(request.getParameter("userid"));
		System.out.println(userid);
		String password= request.getParameter("password");
		System.out.println(password);
		String email=request.getParameter("email");
		System.out.println(email);
		Integer mobile=Integer.parseInt(request.getParameter("mobile"));
		System.out.println(mobile);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Error");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
			System.out.println("Error1");
			ps.setInt(1,userid);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setInt(4,mobile);
			System.out.println("Error2");
			int x= ps.executeUpdate();
			if(x>0)
			{
				out.println("user register sucess");
				
			}
			else
			{
				out.println("error");

			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally{
			try{
				con.close();
				
			}
			catch(Exception e)
			{
			}
			}
			}
}
	
