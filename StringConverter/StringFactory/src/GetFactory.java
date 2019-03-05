
public class GetFactory {

	   public StringConverter getPlan(String planType){  
		   
         if(planType == null){  
        	   
            return null;  
            
           }  
         
         if(planType.equalsIgnoreCase("UPPER")) {  
        	 
                return new UpperCaseConverter();  
              }   
         
          else if(planType.equalsIgnoreCase("LOWER")){  
        	  
               return new LowerCaseConverter();  
           }   
         
         else if(planType.equalsIgnoreCase("ASCII")) { 
        	 
               return new ASCIIReader();  
         }
         else if(planType.equalsIgnoreCase("TRANSLATE")) {
        	 
        	 	return new Translator();
         }
         
     return null;  
  }
}
