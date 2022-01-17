public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  boolean trouble;
  
  if (aSmile && bSmile || !aSmile && !bSmile)
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
