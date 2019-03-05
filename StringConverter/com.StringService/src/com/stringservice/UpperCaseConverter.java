package com.stringservice;

public class UpperCaseConverter extends StringConverter {

	@Override
	public String convertString(String str) {

		return str.toUpperCase();
	}

	@Override
	public void convertASCII(String str) {
	}

	@Override
	public void translate(String fromLang, String toLang, String text) throws Exception {
	}

}
