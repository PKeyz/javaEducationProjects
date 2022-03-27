public int max1020(int a, int b) {
  (10 <= a <=20)? a: !a;
  (10 <= b <=20)? b: !b;
  
  if(a && b && a > b ){
    return a
  }
  if(a && b && b > a ){
    return b
  }
  else{
    return 0;
  }
}


Their Solution:
public int max1020(int a, int b) {
  if (b > a) {
  int temp = a;
  a = b;
  b = temp;
  }
  
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}


// I tried it again and I understood their solution - it makes so much sense! 