public boolean stringE(String str) 
{
  char[] ar = str.toCharArray();
  char chE = 'e';
  int eCount = 0;
  
  for (int i = 0; i <= ar.length -1; i++)
  {
    if ( ar.charAt(i) == chE) 
    {
      e++;
    }
  }
  if ( e >= 1 && e <= 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//contains('e')
// split string into char array
//loop through char array index by index / for each
// each 'e'  make e++  end at array.length -1
//--> if ( e>=1 && e <=3) true    else false

for (int i = 0; i < check.length(); i++)
     if (check.charAt(i) == vowel[i])
         counter[i]++;


 