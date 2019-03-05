package com.stringservice;

public class ASCIIReader extends StringConverter {

	@Override
	public String convertString(String str) {
		
		return null;
	}

	@Override
	public void convertASCII(String str) {
		
		int value = 0,i;
		
		for(i=0; i < str.length(); i++) {
			
			value = (int) str.charAt(i);
			
			System.out.println(str.charAt(i)+" => " + value);
		}
		
	}

	@Override
	public void translate(String fromLang, String toLang, String text) throws Exception {		
	}

}
