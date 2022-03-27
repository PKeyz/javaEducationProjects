public String frontBack(String str) {
  // the only difference was 
  // if ( str.length() <= 1) return str;
  char front = str.charAt(0);
  char back = str.charAt(str.length()-1);
  String mid = str.substring(1,str.length()-1);
  
    return str = back + mid + front;
  
}


/*

THEIR ELEGANCT SOLUTION
    public String frontBack(String str) {
  if (str.length() <= 1) return str;
  
  String mid = str.substring(1, str.length()-1);
  
  // last + mid + first
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}


*/