 package com.ty.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.ty.Dao.ProductDao;
import com.ty.entity.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productdao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
	 List<Product> products=productdao.getProducts();
	 m.addAttribute("prod", products);
		return "index";
		
	}
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title","Add Product");
		return "addproduct";
	}
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView AddProduct(@ModelAttribute Product product,HttpServletRequest req)
	{
		productdao.createProduct(product);
		RedirectView op=new RedirectView();
		op.setUrl(req.getContextPath()+"/");
		return op;
		
	}
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest req)
	{
		this.productdao.deleteProduct(productId);
		RedirectView op=new RedirectView();
		op.setUrl(req.getContextPath()+"/");
		return op;
	}
	@RequestMapping("/update/{productId}")
	public String updateform(@PathVariable("productId") int pid,Model model)
	{
	 Product product=this.productdao.getProduct(pid);
	 model.addAttribute("product", product);
		return "updateform";
		
	}

}
