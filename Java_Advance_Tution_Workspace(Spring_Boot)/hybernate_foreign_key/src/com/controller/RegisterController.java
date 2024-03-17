package com.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.*;
import VO.*;

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
		RegisterVo r = new RegisterVo();
		LoginVo l=new LoginVo();
		Dao d = new Dao();

		String lastname = request.getParameter("lastname");
		String firstname = request.getParameter("firstname");
		String username =request.getParameter("username");
		String password=request.getParameter("password");

		l.setPassword(password);
		l.setUsername(username);
		r.setFirstname(firstname);
		r.setLastname(lastname);
		
		d.register(l);
		
		
		r.setLogin_id(l);
		
		d.register1(r);

		

		;

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
		
		RegisterVo v=new RegisterVo();
		
		Dao d=new Dao();
		
		v.setId(id);
		List list=d.edit(v);
		RegisterVo login =(RegisterVo)list.get(0);
		LoginVo logid=login.getLogin_id();
		
		
		
		
		
		d.delete(v,logid);
		d.search();
		
		
	}
	public static void edit(HttpServletRequest request, HttpServletResponse response){
		try {
		int id=Integer.parseInt(request.getParameter("id"));
		
		
		RegisterVo v=new RegisterVo();
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
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int  logid=Integer.parseInt(request.getParameter("logob"));		
		RegisterVo v=new RegisterVo();
		int id=Integer.parseInt(request.getParameter("id"));
		v.setId(id);
		v.setLastname(lastname);
		v.setFirstname(firstname);
		
		
		LoginVo l=new LoginVo();
		l.setId(logid);
		l.setPassword(password);
		l.setUsername(username);
		v.setLogin_id(l);
			
		
		Dao d=new Dao();
		d.update(v);
		d.updateLogin(l);
		
	}

}
