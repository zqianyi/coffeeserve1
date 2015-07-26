package com.city.coffeeserve.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class UserLoginCheckFilter
 */
@WebFilter("/main.jsp")
public class UserLoginCheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserLoginCheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("登录检查过滤器销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("登录检查过滤器过滤");
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		
		String uri=request.getRequestURI();
		if(uri.equals("login.jsp")||uri.equals("login.do"))
		{
			chain.doFilter(req, res);
		}
		else
		{		
			HttpSession session=request.getSession();
			//String name=(String)session.getAttribute("pass");
			String name=req.getParameter("username");
			System.out.println(name);
			if(session.getAttribute("waiter")==null)
			{
				response.sendRedirect("login.jsp");
			}
			else
			{
				chain.doFilter(req, res);
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("登录检查过滤器初始化");
	}

}
