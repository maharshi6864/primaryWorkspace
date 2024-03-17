
package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.DAO.*;
import com.VO.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/Rg")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String flag = request.getParameter("flag");

		if (flag.equals("search")) {
			search(request, response);
			response.sendRedirect("search_page.jsp");
		}else if(flag.equals("delete"))
		{
			delete(request);
			search(request, response);
			response.sendRedirect("search_page.jsp");
		}else if(flag.equals("edit"))
		{
			System.out.print("delete");

			edit(request, response);
			System.out.println("hrllo");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String flag = request.getParameter("flag");
		if (flag.equals("insert")) {
			insert(request, response);
		}else if(flag.equals("update"))
		{
			update(request,response);
			search((HttpServletRequest) request, response);
			response.sendRedirect("search_page.jsp");
		}
	}

	public static void search(HttpServletRequest request, HttpServletResponse response) throws IOException {

		List SearchList = new ArrayList<>();

		Dao regDAO = new Dao();
		SearchList = regDAO.search();

		HttpSession session = request.getSession();
		session.setAttribute("SearchList", SearchList);
		// try {
		// response.sendRedirect("search_page.jsp");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public static void insert(ServletRequest request, HttpServletResponse response) {
		Vo v = new Vo();

		String lastname = request.getParameter("lastname");
		String firstname = request.getParameter("firstname");

		v.setFirstname(firstname);
		v.setLastname(lastname);

		Dao d = new Dao();

		d.register(v);

		try {
			response.sendRedirect("register_page.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void delete(ServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		
		Vo v=new Vo();
		Dao d=new Dao();
		
		v.setId(id);
		d.delete(v);
		
		
	}
	public static void edit(HttpServletRequest request, HttpServletResponse response){
		try {
		int id=Integer.parseInt(request.getParameter("id"));
		
		Vo v=new Vo();
		v.setId(id);
		List SearchList = new ArrayList<>();

		Dao regDAO = new Dao();
		SearchList = regDAO.edit(v);
		
		HttpSession session=request.getSession();
		session.setAttribute("SearchList", SearchList);
		
	
			response.sendRedirect("edit_page.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void update(ServletRequest request, HttpServletResponse response) throws IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		Vo v=new Vo();
		v.setId(id);
		v.setFirstname(firstname);
		v.setLastname(lastname);
		
		Dao d=new Dao();
		d.update(v);
		
	}

}
