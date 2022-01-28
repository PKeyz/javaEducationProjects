public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length());
  str = front+back;
    
  return str;
}
