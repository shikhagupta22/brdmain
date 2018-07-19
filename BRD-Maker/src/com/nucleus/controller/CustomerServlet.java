package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nucleus.pojo.Customer;
import com.nucleus.service.ServiceCustomer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		PrintWriter out=response.getWriter();
		//request.getAttribute("")
		//out.println("Welcome");
		if(action.equals("new"))
		{

			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("New.jsp");
				rd.include(request, response);
				out.println("Welcome "+session.getAttribute("name"));
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		if(action.equals("update1"))
		{

			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("Update1.jsp");
				rd.include(request, response);
				out.println("Welcome "+session.getAttribute("name"));
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		if(action.equals("single1"))
		{

			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("Single1.jsp");
				rd.include(request, response);
				out.println("Welcome "+session.getAttribute("name"));
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		if(action.equals("all1"))
		{

			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("All1.jsp");
				rd.include(request, response);
				out.println("Welcome "+session.getAttribute("name"));
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		if(action.equals("delete1"))
		{

			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("Delete1.jsp");
				rd.include(request, response);
				out.println("Welcome "+session.getAttribute("name"));
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		ServiceCustomer sc=new ServiceCustomer();
		String action=request.getParameter("action");
		if(action.equals("new"))
		{
		RequestDispatcher rd=null;
		String code=request.getParameter("code");
		String name=request.getParameter("name");
		String AD1=request.getParameter("AD1");
		String AD2=request.getParameter("AD2");
		String pincode=request.getParameter("pincode");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String cperson=request.getParameter("cperson");
		String record=request.getParameter("record");
		String flag=request.getParameter("flag");
		String createby=request.getParameter("createby");
		String createdate=request.getParameter("createdate");
		Customer customer=new Customer();
		customer.setCode(code);
		customer.setName(name);
		customer.setAd1(AD1);
		customer.setCustAd2(AD2);
		customer.setCustPinCode(pincode);
		customer.setCustEmail(email);
		customer.setContact(contact);
		customer.setCustPrimaryContactPerson(cperson);
		customer.setCustRecordStatus(record);
		customer.setCustFlag(flag);
		customer.setCustCreatedBy(createby);
		customer.setCustCreateDate(createdate);
		System.out.println(code);
		int valid=sc.validId(code);
		if(valid==1)
		{
			int isInserted=sc.insert(customer);
			if(isInserted>0)
			{
				rd=request.getRequestDispatcher("Menu.html");
				rd.include(request,response);
				out=response.getWriter();
				out.println("Data Inserted Successfully");
			}
			else
			{
				rd=request.getRequestDispatcher("New.jsp");
				rd.include(request,response);
				out=response.getWriter();
				out.println("Data does not Inserted.");
			}
		}
		else
		{
			rd=request.getRequestDispatcher("New.jsp");
			rd.include(request,response);
			out=response.getWriter();
			out.println("Customer code should be unique");
		}

	}
		else if(action.equals("All"))
		{
			ArrayList<Customer> cust=new ArrayList<Customer>();
			cust=sc.viewAll();
			System.out.println(cust.size());
			request.setAttribute("customers",cust);
			RequestDispatcher rd=request.getRequestDispatcher("All.jsp");
		 	rd.include(request, response);
			
			
		}
		else if(action.equals("single"))
		{
			Customer customer=new Customer();
			String code=request.getParameter("code");
			customer=sc.view(code);
			request.setAttribute("customers",customer);
			RequestDispatcher rd=request.getRequestDispatcher("Single.jsp");
		 	rd.include(request, response);
			
			
		}
		else if(action.equals("delete"))
		{
			String code=request.getParameter("code");
			int isDeleted=sc.delete(code);
			RequestDispatcher rd=null;
			if(isDeleted==1)
			{
				rd=request.getRequestDispatcher("Delete.jsp");
				rd.include(request,response);
				//out=response.getWriter();
				//out.println("Data Deleted Successfully");	
			}
			else
			{
				
				rd=request.getRequestDispatcher("Home.jsp");
				rd.include(request,response);
				out=response.getWriter();
				out.println("Data does not Deleted.Customer code is invalid");
			}
		}
		else if(action.equals("update"))
		{
			Customer customer=new Customer();
			String code=request.getParameter("code");
			customer=sc.update(code);
			request.setAttribute("customers",customer);
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("Update.jsp");
			rd.include(request,response);
			
		}
		else if(action.equals("logout"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			out.println("You have successfully logged out");
		}
		else if(action.equals("updatedo"))
		{
			RequestDispatcher rd=null;
			String code=request.getParameter("code");
			String name=request.getParameter("name");
			String AD1=request.getParameter("AD1");
			String AD2=request.getParameter("AD2");
			String pincode=request.getParameter("pincode");
			String email=request.getParameter("email");
			String contact=request.getParameter("contact");
			String cperson=request.getParameter("cperson");
			String record=request.getParameter("record");
			String flag=request.getParameter("flag");
			String createby=request.getParameter("createby");
			String createdate=request.getParameter("createdate");
			Customer customer=new Customer();
			customer.setCode(code);
			customer.setName(name);
			customer.setAd1(AD1);
			customer.setCustAd2(AD2);
			customer.setCustPinCode(pincode);
			customer.setCustEmail(email);
			customer.setContact(contact);
			customer.setCustPrimaryContactPerson(cperson);
			customer.setCustRecordStatus(record);
			customer.setCustFlag(flag);
			customer.setCustCreatedBy(createby);
			customer.setCustCreateDate(createdate);
			System.out.println(code);
				int isUpdated=sc.updateDo(customer);
				if(isUpdated>0)
				{
					rd=request.getRequestDispatcher("Menu.html");
					rd.include(request,response);
					out=response.getWriter();
					out.println("Data Updated Successfully");
				}
				else
				{
					rd=request.getRequestDispatcher("Menu.html");
					rd.include(request,response);
					out=response.getWriter();
					out.println("Data does not Updated.Customer Code is invalid");
				}
			
		}
	}
		
		 
	}


