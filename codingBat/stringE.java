public boolean stringE(String str) {
  char[] ar = str.toCharArray();
  int e = 0;
  
  for (int i = 0; i <= ar.length -1; i++)
  {
    
    if ( ar.charAt(i) == 'e')
    {
       
      e++;
    }
  }
  
  if ( e >= 1 && e <= 3) return true;
  else return false;
}



//contains('e')
// split string into char array and loop through char array index by index / for each
// 'e'  make e++  end at array.length --> if ( e>=1 && e <=3) true    else fales


 