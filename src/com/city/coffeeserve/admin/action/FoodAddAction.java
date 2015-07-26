package com.city.coffeeserve.admin.action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.coffeeserve.admin.business.impl.FoodImpl;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;

/**
 * Servlet implementation class FoodAddAction
 */
@WebServlet("/addfood.do")
public class FoodAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config=null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodAddAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
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
		
		
		
       	SmartUpload upload=new SmartUpload(); 
		
		try
		{  	
			upload.initialize(config, request, response);
			upload.upload();
			
	Request req=upload.getRequest();
			int i=0;
			String id=req.getParameter("id");
		
			String name=req.getParameter("name");
			String type=req.getParameter("type");
			String price=req.getParameter("price");
			String shock=req.getParameter("shock");
		    i = Integer.parseInt(id); 
			FoodImpl fi=new  FoodImpl();
			fi.addFood(i, name, type, price, shock);
			System.out.println("ok");
			System.out.println("okkkk");
		
		
	System.out.println("okk");
			
				//如果有文件上传
				if(upload.getFiles().getCount()>0)
				{
					//取得文件名
					String fileName=upload.getFiles().getFile(0).getFileName();
					//取得文件类型
					String contentType=upload.getFiles().getFile(0).getContentType().trim();
					System.out.println("okkkkkkkk");
					if(fileName!=null&&fileName.trim().length()>0)
					{
						//将文件保存到/upload目录下
						upload.getFiles().getFile(0).saveAs("/upload/"+fileName);
						//取得/upload的物理路径
						String filePath=request.getServletContext().getRealPath("/upload");
						System.out.println("fileName");
						System.out.println("filePath");
						//保存员工的照片进行如数据库
					//	employeeBusiness.savePhoto(id, filePath, fileName, contentType);
						System.out.println("o");
						fi.savephoto(id, filePath, fileName, contentType);
					
						response.sendRedirect("/coffeeserve/food/success.jsp");
						
						
						
					}
				}
			//	response.sendRedirect("tomain.do");
			
			
		}
		catch(Exception e)
		{
			System.out.println("food增加处理错误"+e.getMessage());
			
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
