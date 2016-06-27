package com.caveofprogramming.spring.web.dao;

public class Offer {
    private int id;
    private String name;
    private String email;
    private String text;
    
    
   public Offer() {
   	
   }
   
	public Offer(int id, String name, String email, String text) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer(String name, String email, String text) {
		System.out.print("In the 3 param constructor...");
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}