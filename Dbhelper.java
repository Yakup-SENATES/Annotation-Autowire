package com.proje.db;

public class Dbhelper {
	
	private Database database;   
	
	private Properties property;

	public void openConnetion() {
		
		System.out.println("Connection created !\n");
		System.out.println("username : " +this.database.getUsr()); 
		System.out.println("password : "+this.database.getPass() ); 
		System.out.println("url : "+this.database.getUrl()+"\n");
		
		System.out.println("----- properties -----");
		System.out.println("property 1 : "+property.getProperty1());
		System.out.println("property 2 : " +property.getProperty2());
	}
	
	
	public void closeConnection() {
		
		System.out.println("\nConnection Closed ");
		
	}
	
	public void updateDatabase() {
		
		System.out.println("\nUpdate Succesfull !!");
		
	}


	public Database getDatabase() {
		return database;
	}


	public Properties getProperty() {
		return property;
	}


	public void setProperty(Properties property) {
		this.property = property;
	}


	public void setDatabase(Database database) {
		this.database = database;
	}
	
	
	
}
