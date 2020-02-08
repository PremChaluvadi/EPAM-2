package com.epam.assignment1.premchaluvadi;
public class Func5 implements Func1 {
	String sweet;
	int price;
	public Func5() {
		sellingprice(250);
	}
	public void sellingprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
}