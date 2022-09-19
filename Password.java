package com.gl.service;

import java.util.Random;

public class Password {
	
	public static char[] generatePassword() {
		String number="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter="!@#$%^&*_+?/";
		
		String values=capitalLetters+smallLetters+specialCharacter;
		Random random=new Random();
		char[] password=new char[8];
		
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
		
	}
	
}