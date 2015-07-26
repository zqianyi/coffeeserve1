package com.city.coffeeserve.listener;

import javax.servlet.ServletContext;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


/**
 * Application Lifecycle Listener implementation class SessionAttributeListener
 *
 */
@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttributeListener() {
        
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event) {
    	HttpSession session = event.getSession();
        ServletContext context = session.getServletContext();
        Integer num = (Integer)context.getAttribute("num")-1;
        context.setAttribute("num",num);
        
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event) {
        
        
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event) {
    	HttpSession session = event.getSession();
        ServletContext context = session.getServletContext();
        Integer num = (Integer)context.getAttribute("num");
        if(num==null||num==0){
        	context.setAttribute("num",new Integer(1));
        }else{
        	context.setAttribute("num",num+1 );
        }
    }
	
}
