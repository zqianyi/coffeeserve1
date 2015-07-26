package com.city.coffeeserve.admin.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.coffeeserve.admin.business.impl.FoodImpl;
import com.city.coffeeserve.admin.business.impl.SeatbillsImpl;
import com.city.coffeeserve.admin.business.impl.WaitersImpl;
import com.city.coffeeserve.admin.dao.impl.FoodDaoImpl;
import com.city.coffeeserve.admin.dao.impl.seatbillsDaoImpl;
import com.city.coffeeserve.note.value.FoodValue;
import com.city.coffeeserve.note.value.SeatbillsValue;

/**
 * Servlet implementation class FoodOrderAction
 */
@WebServlet("/order.do")
public class FoodOrderAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodOrderAction() {
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
			int i=0;
			int j=0;
	
			int t=0;
			
			
		String food=request.getParameter("food");
		String seat=request.getParameter("seat");
		System.out.println("ok");
		 System.out.println(food);
		 i=Integer.parseInt(food); 
	    j=Integer.parseInt(seat); 
		 System.out.println(j);
			System.out.println("okkkkkk");
			List fList =new ArrayList();
			List sList =new ArrayList();
			SeatbillsImpl si=new SeatbillsImpl();
			FoodImpl fi=new FoodImpl();
			fList=fi.getFoodList(i);
			sList=si.getSeatbillList(j);
			System.out.println("ok");
			t=si.getbill(i,j);
			System.out.println(t);
				RequestDispatcher rd=request.getRequestDispatcher("/customer/bill.jsp");
				rd.forward(request,response);
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
