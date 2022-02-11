public boolean in3050(int a, int b) {
  
  int min;
  int max;
  int lowerBound = 30;
  int upperBound = 40;
  
  boolean result;
  
  // define bigger and lower number
  if (a > b)
  {
    return max = a;
    return min = b;
    
  }
  else
  {
    return max = b;
    return min = a;
  }
  //
  if (lowerBound <= max - min <= upperBound)
  {
    return result = true;
  }
  else
  {
    return result = false;
  }
}


Solution:
public boolean in3050(int a, int b) {
  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
    return true;
  }
  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
    return true;
  }
  return false;
  // This could be written as one very large expression,
  // connecting the two main parts with ||
}

// misunterdestood the RANGE as DIFFERENCE and wanted to create something much more complex
// than the needed solution....