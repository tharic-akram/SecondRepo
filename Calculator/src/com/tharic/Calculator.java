package com.tharic;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a>b ? a+b: 0;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a>b ? a/b : b/a;
	}
}
