public boolean startHi(String str) {
  String hi = "hi";
  
  if(str.length()<=1){
    return false;
  }
  else if (str.substring(0,2).equals(hi)){
    return true;
  }
  else{
    return false;
  }
  
}
