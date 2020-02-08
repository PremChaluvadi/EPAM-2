package com.epam.assignment1.premchaluvadi;
public class Func3 implements Func1 {
	String sweet;
	int price;
	public Func3() {
		sellingprice(100);
	}
	public void sellingprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
}