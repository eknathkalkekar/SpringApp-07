package com.eknath;

import com.elementsoftech.beans.PassworkService;

public class Test {

	public static void main(String[] args) {
		
		PassworkService service=new PassworkService();
		String encodepwd = service.encodepwd("4lementsoftech");
		System.out.println(encodepwd);
		
		String decode = service.decode(encodepwd);
		System.out.println(decode);

	}

}
