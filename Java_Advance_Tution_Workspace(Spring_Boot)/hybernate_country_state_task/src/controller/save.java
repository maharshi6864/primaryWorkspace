package controller;

import java.io.IOException;
import java.util.List;

import vo.*;
import dao.Dao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class save
 */
@WebServlet("/save")
public class save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public save() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String flag=request.getParameter("flag");
		if(flag.equals("ins")){
			searchCountry(request, response);
			response.sendRedirect("add_state.jsp");
		}else if(flag.equals("vs"))
		{
			searchstate(request, response);
			response.sendRedirect("view_state.jsp");
		}else if(flag.equals("vc"))
		{
			searchCountry(request, response);
			response.sendRedirect("view_country.jsp");
		}else if(flag.equals("es"))
		{
			editState(request,response);
			searchCountry(request, response);
			response.sendRedirect("edit_state.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String flag=request.getParameter("flag");
		if(flag.equals("ic")){
			insert_country(request, response);
			response.sendRedirect("add_country.jsp");
		}else if(flag.equals("is"))
		{
			insertState(request, response);
			response.sendRedirect("add_state.jsp");
		}else if(flag.equals("us")){
			updateState(request,response);
			response.sendRedirect("menu.jsp");
		}
	}
	protected void insert_country(HttpServletRequest request, HttpServletResponse response){
		String countryname=request.getParameter("countryname");
		
		CountryVo c=new CountryVo();
		Dao d=new Dao();
		
		c.setCountry(countryname);
		d.insertCountry(c);
		
		
		
	}
	protected void searchCountry(HttpServletRequest request, HttpServletResponse response)
	{
		Dao d=new Dao();
		List searchCountry=d.searchCountry();
		HttpSession s=request.getSession();
//		System.out.println(searchCountry);
		s.setAttribute("sc", searchCountry);
	}
	protected void insertState(HttpServletRequest request, HttpServletResponse response)
	{
		StateVo s=new StateVo();
		Dao d=new Dao();
		CountryVo c=new CountryVo();
		
		int id=Integer.parseInt(request.getParameter("countryid"));
		String state=request.getParameter("statename");
		c.setId(id);
		s.setState(state);
		s.setCountryVo(c);
		d.insertState(s);
	}
	protected void searchstate(HttpServletRequest request, HttpServletResponse response)
	{
		Dao d=new Dao();
		List searchState=d.searchState();
		HttpSession s=request.getSession();
		s.setAttribute("searchstate", searchState);
		
	}
	protected void editState(HttpServletRequest request, HttpServletResponse response)
	{
		Dao d=new Dao();
		StateVo v=new StateVo();
		int id=Integer.parseInt(request.getParameter("id"));
		v.setId(id);
		List findState=d.findState(v);
		HttpSession s=request.getSession();
		System.out.println(findState);
		s.setAttribute("fs", findState);
		
	}
	protected void updateState(HttpServletRequest request, HttpServletResponse response)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String state=request.getParameter("state");
		int countId=Integer.parseInt(request.getParameter("cou"));
		Dao d=new Dao();
		StateVo s=new StateVo();
		CountryVo c=new CountryVo();
		c.setId(countId);
		s.setId(id);
		s.setState(state);
		s.setCountryVo(c);
		d.updateState(s);
	}
}
