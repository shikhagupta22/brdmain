package com.nucleus.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import com.nucleus.service.Service;

/**
 * Servlet Filter implementation class ValidationFilter
 */
@WebFilter("/LoginServlet")
public class ValidationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidationFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		//out.println("Welcome "+ name);
		String pass=request.getParameter("pass");
		//out.println(pass);
		Service service=new Service();
		int val=service.login(name,pass);
		if(val==1)
		{
		chain.doFilter(request, response);
		}
		else if(val==2)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Checker.html");
			rd.include(request, response);
		}
		else
		{
			out.println("Invalid Login");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
