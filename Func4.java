package com.epam.assignment1.premchaluvadi;
public class Func4 implements Func1 {
	String sweet;
	int price;
	public Func4() {
		sellingprice(200);
	}
	public void sellingprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
}