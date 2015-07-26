package com.city.coffeeserve.admin.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import com.city.coffeeserve.admin.business.impl.WaitersImpl;
import com.city.coffeeserve.admin.dao.IWaitersDao;
import com.city.coffeeserve.admin.factory.DaoFactory;
import com.city.coffeeserve.note.value.waitersvalue;


/**
 * Servlet implementation class WaiterSeekAction
 */
@WebServlet("/login.do")
public class WaiterSeekAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WaiterSeekAction() {
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
		boolean t;
		//businessFactory bf=new businessFactory();
		//IWaiters iw=bf.createWaiter();
		//t=iw.seekWaiter();
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		WaitersImpl wi=new WaitersImpl();
		waitersvalue wv=new waitersvalue();
	    	try{
	    		wv=wi.selectWaiter(username,password);
	    	}catch (Exception e) {
				// TODO: handle exception
			}		
	    	HttpSession session=request.getSession();
			//保存员工的登录会话信息
			session.setAttribute("waiter", wv);
	//	ServletContext con = request.getServletContext();
		
	    try {
	    	t=wi.seekWaiter(username,password);
	    	

	    	if(t)
	    		response.sendRedirect("main.jsp");
	    	else
	    		response.sendRedirect("login.jsp");
	    }catch (Exception e) {
			// TODO: handle exception
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
