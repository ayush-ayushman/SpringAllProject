package com.ty.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.app.entities.BillOperator;
import com.ty.app.entities.Customer;


@Controller
public class BillController {
	private List<BillOperator> bill = new ArrayList<BillOperator>();
	private List<Customer> cust = new ArrayList<Customer>();

	@RequestMapping(value = "/reg")
	public String red() {
		return "billoperatorregistration";

	}

	@RequestMapping(value = "/log")
	public String log() {
		return "billoperatorlogin";

	}

	@RequestMapping(value = "/validate")
	public String loginValidation(HttpServletRequest request) {

		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		if (username.equals("admin@gmail.com") && password.equals("admin")) {
			request.setAttribute("name", "Admin successfully logged in");
			return "validate";
		} else {
			request.setAttribute("name", "invalid credentials");
			return "billoperatorlogin";
		}

	}

	@RequestMapping(value = "/savebilloperator")
	public String userdetails(HttpServletRequest request) {
		String billoperatorid = request.getParameter("boid");
		String billoperatoename = request.getParameter("boname");
		String billoperatoremail = request.getParameter("boemail");
		String billoperatorphone = request.getParameter("bophone");
		String billoperatoraddress = request.getParameter("boaddress");
		String billoperatorpassword = request.getParameter("bopassword");
		BillOperator billop = new BillOperator();
		billop.setBoId(billoperatorid);
		billop.setBoName(billoperatoename);
		billop.setBoemail(billoperatoremail);
		billop.setBopassword(billoperatorpassword);
		billop.setBophone(billoperatorphone);
		billop.setBoaddress(billoperatoraddress);
		bill.add(billop);
		request.setAttribute("billope", bill);

		return "billoperatorlogin";

	}

	@RequestMapping(value = "/consum")
	public String saveUser(HttpServletRequest requset) {
		String customerId = requset.getParameter("cid");
		String customerNamee = requset.getParameter("cname");
		String caddress = requset.getParameter("caddress");
		String rrnumber = requset.getParameter("crr");
		String unitConsumed = requset.getParameter("cunitconsume");
		String billAmount = requset.getParameter("cbamount");
		Customer c = new Customer();
		c.setCustomerId(customerId);
		c.setCustomerNamee(customerNamee);
		c.setRrnumber(rrnumber);
		c.setUnitConsumed(unitConsumed);
		c.setCaddress(caddress);
		c.setBillAmount(billAmount);
		cust.add(c);
		requset.getServletContext().setAttribute("name", cust);
		return "userdisplay";

	}

	@RequestMapping(value = "/userdata")
	public String userDel() {
		return "customerreg";

	}
	@RequestMapping("/update")
    public String billupdate(HttpServletRequest httpServletRequest) {
    	String rrno= httpServletRequest.getParameter("rrno");
    	
    	List<Customer> cust1 =(List<Customer>) httpServletRequest.getServletContext().getAttribute("name");
    	
    	for (Customer caa : cust1) {
			if(rrno.equals(caa.getRrnumber())) {
				httpServletRequest.setAttribute("billupdate",caa);
			}
		}

        return "update";
    }
	@RequestMapping("/billupdate")
    public String updatedbill(HttpServletRequest req) {
		String customerId = req.getParameter("cid");
		String customerNamee = req.getParameter("cname");
		String caddress = req.getParameter("caddress");
		String rrnumber = req.getParameter("crr");
		String unitConsumed = req.getParameter("cunitconsume");
		String billAmount = req.getParameter("cbamount");
		Customer c1 = new Customer();
		c1.setCustomerId(customerId);
		c1.setCustomerNamee(customerNamee);
		c1.setRrnumber(rrnumber);
		c1.setUnitConsumed(unitConsumed);
		c1.setCaddress(caddress);
		c1.setBillAmount(billAmount);
		cust.add(c1);
		req.setAttribute("name", cust);
		return "userdisplay";

	
		
	}
    
	
}
