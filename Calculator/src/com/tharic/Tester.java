package com.tharic;

public class Tester {

	public static void main(String[] args) {
		// Adding this comment to check auto triggering of build in jenkins
		Calculator c=new Calculator();
		System.out.println(c.add(3,5));
		System.out.println(c.sub(34,12));
		System.out.println(c.multiply(5,6));
		System.out.println(c.divide(343,7));
		
	}

}
