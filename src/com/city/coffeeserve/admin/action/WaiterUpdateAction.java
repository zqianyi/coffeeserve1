package com.city.coffeeserve.admin.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.coffeeserve.admin.business.impl.FoodImpl;
import com.city.coffeeserve.admin.business.impl.WaitersImpl;

/**
 * Servlet implementation class WaiterUpdateAction
 */
@WebServlet("/waiterupdate.do")
public class WaiterUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WaiterUpdateAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int i=0;
			String wid=request.getParameter("wid");
			String wname=request.getParameter("wname");
			String wpassword=request.getParameter("wpassword");
			String wsex=request.getParameter("wsex");
			String wphone=request.getParameter("wphone");
			 i=Integer.parseInt(wid); 
			 WaitersImpl wi=new WaitersImpl();
			System.out.println(wid);
			
			wi.updatewaiter(i,wname,wpassword,wsex,wphone);
			response.sendRedirect("/coffeeserve/waiter/success.jsp");
			}catch(Exception e){System.out.println(e.getMessage());}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		doGet(request,response);
	}

}
