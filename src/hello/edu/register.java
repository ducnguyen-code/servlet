package hello.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletOutputStream out = response.getOutputStream();
		
		 out.println("<h1 style=\"margin-left: 300px;\">Register</h1>");
		 out.println("      <div style=\"border: 1px solid rgb(173, 172, 172); width: 380px; margin-left: 300px; height: 450px;\">");
		 out.println("        <form action=\"login\" method=\"post\" style=\"width: 450px; margin-left: 20px; margin-right: 15px; margin-top: 40px;\" >");
		 out.println("		");
		 out.println("          Phone<br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		 out.println("          <div style=\"display: flex;\">");
		 out.println("              <div >");
		 out.println("                First name&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"password\" name=\"password\" size=\"10\"/>");
		 out.println("              </div>");
		 out.println("              <div style=\"margin-left: 30px;\">");
		 out.println("                Last name&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"password\" name=\"password\" size=\"10\"/>");
		 out.println("              </div>");
		 out.println("          </div>");
		 out.println("          <br></br>");
		 out.println("          Email address&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		 out.println("          Password&nbsp;<i style=\"font-size: 10px; color: red;\" class=\"fas fa-star-of-life\"></i><br><input type=\"text\" name=\"username\" size=\"30\"/><br></br>");
		 out.println("          <input type=\"submit\" name=\"login\" value=\"REGISTER\" size=\"10\"/>&nbsp;&nbsp;&nbsp;");
		 out.println("         ");
		 out.println("         ");
		 out.println("          ");
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
