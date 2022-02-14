public boolean stringE(String str) 
{
  char[] ar = str.toCharArray();
  char chE = 'e';
  int eCounter = 0;
  
  for (int i = 0; i <= ar.length -1; i++)
  {
    if ( ar.charAt(i) == chE) 
    {
      eCounter++;
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



Solution:
public boolean stringE(String str) {
  int count = 0;

  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
    // alternately: str.substring(i, i+1).equals("e")
  }

  return (count >= 1 && count <= 3);
}

/*
  What I realize here, is that even though my solution didn't work in the end, because of
  some minor syntax error that I didn't see even after checking five times,
  The logic is basically the same, and this really motivates me right now.
  the biggest problem in programming is not the syntax, but to find the correct logic to
  solve the task, and my logic definitely works. 
  
*/


 