
public String everyNth(String str, int n) {
  
    String result = "";
    
    
    // Copy character by character into array
    for (int i = 0; i < str.length(); i= i+n) {
          result = result + str.charAt(i);
    }
    
    return result;
  }

  //you create a second String and a char Array out of the first String str.
  //you add every Nth char from str into result String and return the info