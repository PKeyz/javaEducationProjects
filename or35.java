public boolean or35(int n) {
  if(n % 3 != 0 && n % 5 != 0) 
  {
    return false;
  }
  else
  {
    return true;
  }
}


/*
//their solution:

public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}

*/
