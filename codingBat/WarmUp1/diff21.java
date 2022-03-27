public int diff21(int n) {
  int diff;
  if (n < 21)
  {
    diff = 21 - n;
    return diff;
  }
  else{
    diff = (n - 21)*2;
    return diff;
  }
}
