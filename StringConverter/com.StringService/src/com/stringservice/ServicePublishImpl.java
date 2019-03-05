package com.stringservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublishImpl implements ServicePublish {

	@Override
	public void publishService() throws IOException {
		
		GetFactory factory = new GetFactory();

		System.out.println("Convert String To Upper Case : Code => UPPER / upper");
		System.out.println("Convert String To Lower Case : Code => LOWER / lower");
		System.out.println("Get ASCII Vales Characters Of Strings  : Code => ASCII / ascii");
		System.out.println("Translate String : Code => TRANSLATE / translate");
				
		System.out.println("Enter Service Code You Expect To Have: ");  
		
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	    
	    String planName=br.readLine();  
	   
	    
	    StringConverter p =factory.getPlan(planName);
	    
	    System.out.print("Enter String: "); 
	    BufferedReader str =new BufferedReader(new InputStreamReader(System.in));
	    
	    String string = str.readLine();
	    
	  
	    if(planName.equalsIgnoreCase("ASCII")) {
	    	
	    	try {
				
	    		p.convertASCII(string);
	    		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    }
	    else if(planName.equalsIgnoreCase("TRANSLATE")) {
	    	
	    	System.out.print("Enter input language: "); 
		    BufferedReader str1 =new BufferedReader(new InputStreamReader(System.in)); 
		    String inlang = str1.readLine();
		    
		    System.out.print("Do You Want Open Output Language Support (Yes/No): "); 
		    BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in)); 
		    String answer = br2.readLine();
		    
		    if(answer.equalsIgnoreCase("YES")) {
		    	
		    	p.printLanguages();
		    	
		    	System.out.print("Enter output laguage: "); 
			    BufferedReader str2 =new BufferedReader(new InputStreamReader(System.in)); 
			    String outlang = str2.readLine();
		    	
		    	 try {
						
			    		p.translate(inlang, outlang, string);
			    		
					} catch (Exception e) {
						
						e.printStackTrace();
					}
		    }
		    if(answer.equalsIgnoreCase("NO")) {
		    	  
			    System.out.print("Enter output laguage: "); 
			    BufferedReader str2 =new BufferedReader(new InputStreamReader(System.in)); 
			    String outlang = str2.readLine();
		   
		    try {
				
	    		p.translate(inlang, outlang, string);
	    		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		    }
	    }
	    else {
	    
		    try {
		    	
		    System.out.println(p.convertString(string));
		    
		    }catch(Exception e) {
		    	
		    	e.printStackTrace();
		    }
		    
	    }
		
	    	
	}

}
