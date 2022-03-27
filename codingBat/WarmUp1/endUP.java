public class endUP {

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
            
            int cut = str.length() - 3;
            String front = str.substring(0, cut);
            String back  = str.substring(cut);  // this takes from cut to the end
            
            return front + back.toUpperCase();
        
}


//will need to fix the result, since it only returns the toUpperCase 3 chars, instead of everything + 3 chars in UpperCase.
//but the direction is good.

/*

  String sub;
        
        if (str.length() >= 4){
          
          sub = str.substring(str.length()-3, str.length());
          
          return str.substring(0,str.length()-4) + sub.toUpperCase();
        }
        else {
        
          return str.toUpperCase();
        }
      
      }

*/

//searched for a useful method to cut Strings; found split(), but the regex;limit 
//both seemed very foreign and not suit for the problem...
//once again I'm beat by the simplicity of the domain-owner. 