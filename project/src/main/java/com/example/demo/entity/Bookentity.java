package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookentity {
public Bookentity() {
		super();
		// TODO Auto-generated constructor stub
	}
public Bookentity(int bookid, String title, int price, String language, int stockquantity) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.language = language;
		this.stockquantity = stockquantity;
	}
@Id
	private int bookid;
    private String title;
    private int price;
    private String language;
    private int stockquantity;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getStockquantity() {
		return stockquantity;
	}
	public void setStockquantity(int stockquantity) {
		this.stockquantity = stockquantity;
	}
    


}
