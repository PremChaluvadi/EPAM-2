package com.epam.assignment1.premchaluvadi;
public class Func6 implements Func1 {
	String sweet;
	int price;
	public Func6() {
		sellingprice(275);
	}
	public void sellingprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
}