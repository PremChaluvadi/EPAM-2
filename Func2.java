package com.epam.assignment1.premchaluvadi;
public class Func2 implements Func1 {
		String sweet;
		int price;
		public Func2() {
			sellingprice(50);
		}
		public void sellingprice(int price) {
			this.price=price;
		}
		public int getprice() {
			return price;
		}
}