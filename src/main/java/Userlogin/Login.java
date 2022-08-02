package Userlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginChecker")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
		response.setContentType("text/html");
		String uname=request.getParameter("yourname");
		String pword=request.getParameter("yourpassword");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		
		if(uname.equalsIgnoreCase("Kuldeep") && pword.equals("12345")) {
			//out.println("you are welcomed");
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("invalid username or password Please try again!");
			rd=request.getRequestDispatcher("Loginform.html");
			rd.include(request, response);
		}
			
	}
		
	}
