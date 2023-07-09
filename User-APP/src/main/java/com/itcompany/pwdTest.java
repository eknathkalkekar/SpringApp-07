package com.itcompany;

import com.elementsoftech.beans.PassworkService;

public class pwdTest {
	
	public static void main(String[] args) {
		PassworkService ser =new PassworkService();
		String encodepwd = ser.encodepwd("Ekn;ath");
		System.out.println(encodepwd);
		
		String decode = ser.decode(encodepwd);
		System.out.println(decode);
		
	}
	
	

}
