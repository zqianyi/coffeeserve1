package com.city.coffeeserve.admin.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.coffeeserve.admin.ConnectionFactory.ConnectionFactory;
import com.city.coffeeserve.admin.business.impl.WaitersImpl;
import com.city.coffeeserve.admin.dao.impl.FoodphotoDaoImpl;
import com.city.coffeeserve.note.value.FoodphotosValue;

/**
 * Servlet implementation class photoshow
 */
@WebServlet("/photoshow.do")
public class photoshow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public photoshow() {
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
		
             String id=request.getParameter("id");
		FoodphotoDaoImpl fpi=new FoodphotoDaoImpl();
	   FoodphotosValue fpv=new FoodphotosValue();
			
			try{
			fpv=fpi.getFoodphoto(id);
		
			
				String fileName=fpv.getPhotofilename();
				//String fileName="1.jpg";
				System.out.println("okkkkkkkkk");
				
				System.out.println(fileName);
				
				String contentType=fpv.getPhotocontenttype();
				response.setContentType(contentType);
				OutputStream out=response.getOutputStream();
				String sql="select photo from foodphoto where fpid=?";
				Connection cn=ConnectionFactory.getConnection();
				PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
		if(rs.next())
			{
				InputStream in=rs.getBinaryStream("photo");
					byte[] data=new byte[100];
					int len=0;
				while((len=in.read(data))!=-1)
				{
						out.write(data, 0, len);
				}
					System.out.println("ok");
					
					in.close();
					
				}
			rs.close();
				ps.close();
				cn.close();
				out.close();
		
		}
		catch(Exception e)
		{
			System.out.println("员工照片显示处理器错误"+e.getMessage());
			//response.sendRedirect("../error.jsp?mess="+e.getMessage());
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
