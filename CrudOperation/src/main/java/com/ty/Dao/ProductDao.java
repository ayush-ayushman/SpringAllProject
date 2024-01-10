package com.ty.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ty.entity.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	@Transactional
	public List<Product> getProducts()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
		
	}
	@Transactional
	public void deleteProduct(int pid)
	{
	  Product p=this.hibernateTemplate.get(Product.class,pid );
	  this.hibernateTemplate.delete(p);
		
	}
	@Transactional
	public Product getProduct(int pid)
	{
		Product p=this.hibernateTemplate.get(Product.class,pid );
		return p;
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
