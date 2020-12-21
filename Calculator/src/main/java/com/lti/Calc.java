package com.lti;

public class Calc {
	
	public static int add(int n1,int n2){
		return n1+n2;
	}
	public static int sub(int n1,int n2){
		return n1-n2;
	}
	public static int prod(int n1,int n2){
		return n1*n2;
	}
	public static int div(int n1,int n2){
		return n1/n2;
	}

	public static void main(String[] args) {
		System.out.println("Add="+add(5,4));
		System.out.println("Sub="+sub(5,4));
		System.out.println("Prod="+prod(5,4));
		System.out.println("Quotient="+div(5,4));
	}
}