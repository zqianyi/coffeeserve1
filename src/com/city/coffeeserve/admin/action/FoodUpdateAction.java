package com.city.coffeeserve.admin.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.coffeeserve.admin.business.impl.FoodImpl;

/**
 * Servlet implementation class FoodUpdateAction
 */
@WebServlet("/foodupdate.do")
public class FoodUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodUpdateAction() {
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
			String fid=request.getParameter("fid");
			String fname=request.getParameter("fname");
			String ftype=request.getParameter("ftype");
			String fprice=request.getParameter("fprice");
			String fshock=request.getParameter("fshock");
			 i=Integer.parseInt(fid); 
			 FoodImpl fi=new FoodImpl();
			System.out.println(fid);
			
			fi.modify(i,fname,ftype,fprice,fshock);
			response.sendRedirect("/coffeeserve/food/success.jsp");
			}catch(Exception e){System.out.println(e.getMessage());}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
