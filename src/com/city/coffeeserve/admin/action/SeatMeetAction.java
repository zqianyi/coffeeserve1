package com.city.coffeeserve.admin.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.city.coffeeserve.admin.business.impl.SeatsImpl;
import com.city.coffeeserve.admin.business.impl.WaitersImpl;
import com.city.coffeeserve.admin.dao.impl.SeatsDaoImpl;
import com.city.coffeeserve.note.value.SeatsValue;
import com.city.coffeeserve.note.value.waitersvalue;

/**
 * Servlet implementation class SeatMeetAction
 */
@WebServlet("/meet.do")
public class SeatMeetAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeatMeetAction() {
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
		try{
			int t=0;
			String sid=request.getParameter("sid");
			System.out.println(sid);
			System.out.println("ok");
			SeatsImpl adi=new SeatsImpl();
		   t=adi.getseat(sid);
		   if(t==0) 	response.sendRedirect("customer/successmeet.jsp");
		   else response.sendRedirect("customer/failmeet.jsp");
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
