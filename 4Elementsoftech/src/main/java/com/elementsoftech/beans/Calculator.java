package com.elementsoftech.beans;

public class Calculator {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Total : :"+c);
		
		PassworkService pwdservice = new PassworkService();
		String encodepwd = pwdservice.encodepwd("elements");
		System.out.println(encodepwd);
		
		String decode = pwdservice.decode("ZWxlbWVudHM=");
		
		System.out.println(decode);

	}

}
