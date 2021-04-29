package com.proje.db;

public class Database {

	private String usr, pass , url;

	
	

	
	public Database(){}
	
	public Database(String usr, String pass, String url) {
		super();
		this.usr = usr;
		this.pass = pass;
		this.url = url;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

	
}
