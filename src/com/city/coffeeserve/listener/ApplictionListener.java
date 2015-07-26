package com.city.coffeeserve.listener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ApplictionListener
 *
 */
@WebListener
public class ApplictionListener implements ServletContextListener {
	int clickNum = 0;
    /**
     * Default constructor. 
     */
    public ApplictionListener() {
    	
    	
                
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        context.setAttribute("clickNum", clickNum);
        
        String path = context.getRealPath("/WEB-INF/info.txt");
        
        File file=new File(path);
    	Reader read;
		/*try {
			read = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            lineTxt = bufferedReader.readLine();
            //clickNum = Integer.valueOf(lineTxt);
            System.out.println("���������ݣ�"+ lineTxt);
            read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		try {
            Scanner in = new Scanner(new File(path));  
            while (in.hasNextLine()) {
                String lineTxt = in.nextLine();
                clickNum = Integer.valueOf(lineTxt);
                context.setAttribute("clickNum", clickNum);
                System.out.println("���������ݣ�"+ lineTxt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event) {
    	ServletContext context = event.getServletContext();
    	clickNum = (int)context.getAttribute("clickNum"); 
    	String path = context.getRealPath("/WEB-INF/info.txt");
    	File f = new File(path);
    	BufferedWriter output;    	
		try {
			output = new BufferedWriter(new FileWriter(f));
			output.write(String.valueOf(clickNum));  
	        output.close();  
		} catch (IOException e) {
			e.printStackTrace();
		}  
        
    	
    }
	
}
