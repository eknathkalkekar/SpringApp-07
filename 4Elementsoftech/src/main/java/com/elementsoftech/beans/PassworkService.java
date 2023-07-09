package com.elementsoftech.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PassworkService {
	public String encodepwd(String password) {
		Encoder encoder = Base64.getEncoder();
		
		byte[] bytes = password.getBytes();
		String encodeToString = encoder.encodeToString(bytes);
		
		return encodeToString;
	}
	
	public String decode(String encryptedTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encryptedTxt);
		return new String(decode);
	}

}
