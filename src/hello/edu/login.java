package hello.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;
/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 ServletOutputStream out = response.getOutputStream();
	        
		 
		 out.println("<h1 style=\"margin-left: 300px;\">Login</h1>");
		 out.println("      <div style=\"border: 1px solid rgb(173, 172, 172); width: 380px; margin-left: 300px; height: 300px;\">");
		 out.println("        <form action=\"login\" method=\"post\" style=\"width: 360px; margin-left: 20px; margin-right: 15px; margin-top: 40px;\" >");
		 out.println("		");
		 out.println("          Username or email address<br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		 out.println("          Password<br><input type=\"password\" name=\"password\" size=\"30\"/><br></br>");
		 out.println("          <input type=\"submit\" name=\"login\" value=\"Login\" size=\"10\"/>&nbsp;&nbsp;&nbsp;");
		 out.println("          <input type=\"checkbox\"/>Remember me<br>");
		 out.println("          <br>");
		 out.println("          <a href=\"#\">Lost your password?</a>");
		 out.println("        </form>");
		 out.println("      </div>");
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
