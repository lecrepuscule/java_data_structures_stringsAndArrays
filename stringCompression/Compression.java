class StringCompression {
    
  public static String compress (String s){
      if(s.length() == 1 || s == "") return s;
      StringBuffer cs = new StringBuffer();
      char curChar = s.charAt(0);
      int count = 0, length = s.length();
      for(int i = 0; i< length; i++){
          if(curChar == s.charAt(i)){
            count++;
          } else {
              cs.append(curChar).append(count);
              curChar = s.charAt(i);
              count=1;
          }
          if (cs.length() >= length) return s;
      }
      return cs.append(curChar).append(count).toString();
  }
    
  public static void main(String[] args) {
    String test = "aabcccccca";
    System.out.println(compress(test));
  }
}