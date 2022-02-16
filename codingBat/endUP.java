public class endUP {

    public String endUp(String str) {
  
        String sub;
        
        if (str.length() >= 4){
          
          sub = str.substring(str.length()-3, str.length());
          
          return str.substring(0,str.length()-4) + sub.toUpperCase();
        }
        else {
        
          return str.toUpperCase();
        }
      
      }
      
}


//will need to fix the result, since it only returns the toUpperCase 3 chars, instead of everything + 3 chars in UpperCase.
//but the direction is good.