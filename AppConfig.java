package com.proje.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.Database;
import com.proje.db.Dbhelper;
import com.proje.db.Properties;

@Configuration
public class AppConfig {
	
	
	
	@Bean(name = "database")
	public Database database() {
		
		Database database = new Database();
		
		database.setUsr("root");
		database.setPass("12345");
		database.setUrl("localhos:3036");
		
		return database;
	}
	
	
	
	@Bean(name = "property")
	public Properties property() {
		
		Properties property = new Properties(); 
		property.setProperty1("min 5 connection");
		property.setProperty2("max 20 connection");
		return property;
	} 
	
	@Bean(autowire = Autowire.BY_NAME)
	public Dbhelper dbhelper() {
		
	Dbhelper dbhelper = new Dbhelper(); 
		
		return dbhelper;
	}
	

	
	
}
