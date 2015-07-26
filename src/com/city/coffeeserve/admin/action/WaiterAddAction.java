package com.city.coffeeserve.admin.action;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.Session;
//import org.apache.tomcat.jni.Address;

import com.city.coffeeserve.admin.business.impl.WaitersImpl;

/**
 * Servlet implementation class WaiterAddAction
 */
@WebServlet("/addwaiter.do")
public class WaiterAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WaiterAddAction() {
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
		int i=0;
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String sex=request.getParameter("sex");
		String phone=request.getParameter("phone");
		System.out.println(id);
		 i = Integer.parseInt(id); 
		WaitersImpl wi=new WaitersImpl();
		try{
		 wi.addWaiter(i,name,pass,sex,phone);
		 
		// try{	
				Properties p=new Properties();
				 p.put("mail.smtp.host", "127.0.0.1");
				 p.put("mail.smtp.auth", "false");
				 p.put("mail.transport.protocol", "smtp");
				 Session session=Session.getInstance(p);
				 Message message=new MimeMessage(session);
		        Address from=new InternetAddress("sys@city.com");
			 message.setFrom(from);
				 Address to=new InternetAddress("aaa");
			 message.setRecipient(Message.RecipientType.TO, to);
			 message.setSubject("用户注册确认信息");
			 message.setContent("zhucechenggong", "text/html");
			 Transport.send(message);
			 System.out.println("邮件发送成功");
		//	 }
		//	catch(Exception e){System.out.println(e.getMessage());}
		//	 
				 
			//}
		 
		 
		 
		 
		 response.sendRedirect("../coffeeserve/waiter/email.jsp");
		}catch(Exception e) {
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
