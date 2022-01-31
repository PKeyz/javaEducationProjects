public boolean parrotTrouble(boolean talking, int hour) {
  boolean trouble;
  
  if(talking && hour < 7 || talking && hour > 20)
  {
    trouble = true;
    return trouble;
  }
  else
  {
    trouble = false;
    return trouble;
  }
}
