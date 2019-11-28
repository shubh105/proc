package com.ranps.proc.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.util.Properties;


	@Configuration
	@Component
	@EnableTransactionManagement
	@ComponentScan(basePackages={"com.ranps.proc"})
	public class DbConfig {
		
		@Bean(name="dataSource" )
		public DataSource getDataSource(){
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/ranps");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			return dataSource;
		}
		
		@Bean(name="sessionFactory")
		public SessionFactory getSessionFactory(){
			Properties properties=new Properties();
			properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
			properties.setProperty("hibernate.hbm2ddl.auto","update");
			properties.setProperty("hibernate.show_sql","true");
			
			LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
			builder.addProperties(properties);
			builder.scanPackages("com.ranps.proc.models");
			
			SessionFactory factory=builder.buildSessionFactory();
			return factory;
		}

		@Bean(name="hibernateTransactionManager")
		@Autowired
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
			HibernateTransactionManager txManager=new HibernateTransactionManager(sessionFactory);
			return txManager;
		}

	}

