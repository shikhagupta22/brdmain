package com.nucleus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.entity.Customer;
import com.nucleus.service.CustomerServiceI;

@Controller
public class MainController 
{
	@Autowired
	private MessageSource msgSource;
	@Autowired
	CustomerServiceI customerServiceI;
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView save()
	{
		String New=this.msgSource.getMessage("New", null, null,null);
		System.out.println(New);
		return new ModelAndView(New,"customer",new Customer());
	}
	@RequestMapping(value="/update1", method=RequestMethod.GET)
	public String update1()
	{
		String Update1=this.msgSource.getMessage("Update1", null, null,null);
		return Update1;
	}
	@RequestMapping(value="/single1", method=RequestMethod.GET)
	public String single1()
	{
		String Single1=this.msgSource.getMessage("Single1", null, null,null);
		return Single1;
	}
	@RequestMapping(value="/all1", method=RequestMethod.GET)
	public String all1()
	{
		String All1=this.msgSource.getMessage("All1", null, null,null);;
		return All1;
	}
	@RequestMapping(value="/delete1", method=RequestMethod.GET)
	public String delete()
	{
		String Delete1=this.msgSource.getMessage("Delete1", null, null,null);
		return Delete1;
	}
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult result)
	{
		String finalnew=this.msgSource.getMessage("finalnew", null, null,null);
		if(result.hasErrors())
		{
			return new ModelAndView("New","customer",customer);
		}
		int insert=customerServiceI.insert(customer);
		return new ModelAndView(finalnew,"customer",customer);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView selectCustomer(@RequestParam("code") String code)
	{
		String Update=this.msgSource.getMessage("Update", null, null,null);
		Customer customer=(Customer)customerServiceI.selectToUpdate(code);
		return new ModelAndView(Update,"customer",customer);
		
	}
	@RequestMapping(value="/updatedo", method=RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("customer") Customer customer)
	{
		String finalupdate=this.msgSource.getMessage("finalupdate", null, null,null);
		int isUpdated=customerServiceI.updateCustomer(customer,customer.getCode());
		return finalupdate;
		
	}
	@RequestMapping(value="/viewById",method=RequestMethod.POST)
	public ModelAndView viewById(@RequestParam("code") String code)
	{
		String Single=this.msgSource.getMessage("Single", null, null,null);
		Customer customer=customerServiceI.viewbyId(code);
		return new ModelAndView(Single,"customers",customer);
	}
	@RequestMapping(value="/viewAll", method=RequestMethod.GET)
	public ModelAndView viewAll()
	{
		String All=this.msgSource.getMessage("All", null, null,null);
		List<Customer> customer=customerServiceI.viewAll();
		return new ModelAndView(All,"customers",customer);
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(@RequestParam("code") String code)
	{
		String Delete=this.msgSource.getMessage("Delete", null, null,null);
		int isDeleted=customerServiceI.delete(code);
		return Delete;
	}

}
