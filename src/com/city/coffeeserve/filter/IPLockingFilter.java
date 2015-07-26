package com.city.coffeeserve.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class IPLockingFilter
 */
@WebFilter("/*")
public class IPLockingFilter implements Filter {

    String IP=null;
	/**
     * Default constructor. 
     */
    public IPLockingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("IP检查过滤器过滤了。。。");
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("error.jsp");
		//HttpSession session= request.getSession();
		//ServletContext sc =this.getServletContext();
		String uri=request.getRequestURI();
		//String IP=config.getInitParameter("IP");
			String ip=request.getRemoteAddr();
			
			if(ip.equals(IP))
			{
				reqDispatcher.forward(req, res);
			}
			else
			{
				 chain.doFilter(req, res);
			}
			
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		IP=fConfig.getInitParameter("IP");
		if (IP == null)IP = "";
	}

}
