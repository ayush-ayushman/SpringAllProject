package org.jsp.springjdbc;

import javax.sql.DataSource;

import org.jsp.springjdbc.dao.StudentDao;
import org.jsp.springjdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource()
	{
		 DriverManagerDataSource ds=new DriverManagerDataSource();
		 ds.setDriverClassName("com.mysql.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		 ds.setUsername("root");
		 ds.setPassword("admin");
		
		return ds;
		
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new  JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	@Bean("studentDao")
	public StudentDao getStudentDao()
	{
		StudentDaoImpl st=new StudentDaoImpl();
		st.setJdbcTemp(getTemplate());
		
		return st;
		
	}

}
