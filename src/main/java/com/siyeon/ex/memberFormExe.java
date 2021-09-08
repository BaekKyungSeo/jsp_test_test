package com.siyeon.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class memberFormExe
 */
@WebServlet(urlPatterns={"/memberFormExe"}, initParams= {@WebInitParam(name="job",value="학생")})
public class memberFormExe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberFormExe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		System.out.println("doPost 메서드가 실행됨");
		
		request.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		String email_1 = request.getParameter("email_1");
		String email_2 = request.getParameter("email_2");
		String job = request.getParameter("job");
		String jobInit = getInitParameter("job");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");
		writer.println("이름 : " + name + "<br/>");
		writer.println("E-mail : " + email_1 + "@ " + email_2 + "<br/> ");
		writer.println("직업 : " + job + "<br/>");
			if(job=="")
			{
				writer.println("직업 : " + jobInit);
			}
			else
			{
				writer.println("직업 : " + job);
			}

		writer.println("</body></html>");
		
		writer.close();
	}

}
