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
@WebServlet(urlPatterns={"/memberFormExe"}, initParams= {@WebInitParam(name="job",value="�л�")})
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
		
		System.out.println("doPost �޼��尡 �����");
		
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
		writer.println("���̵� : " + id + "<br/>");
		writer.println("��й�ȣ : " + pw + "<br/>");
		writer.println("�̸� : " + name + "<br/>");
		writer.println("E-mail : " + email_1 + "@ " + email_2 + "<br/> ");
		writer.println("���� : " + job + "<br/>");
			if(job=="")
			{
				writer.println("���� : " + jobInit);
			}
			else
			{
				writer.println("���� : " + job);
			}

		writer.println("</body></html>");
		
		writer.close();
	}

}
