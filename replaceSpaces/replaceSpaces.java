class ReplaceSpaces {
    
  public static String replaceSpaces(String s){
      StringBuffer chars = new StringBuffer();
      int counter = 0, i = 0;
      for (i=0; i+counter<s.length(); i++) {
          if(s.charAt(i) == ' '){
             System.out.println("found char: " + s.charAt(i));
             chars.append('%').append('2').append('0');
            //  chars.append('2');
            //  chars.append('0');
             counter += 2;
          } else {
            System.out.println("found char: " + s.charAt(i));
             chars.append(s.charAt(i));
          }
      }
      return chars.toString();
  }

  public static void replaceSpaces(char[] str, int length){
    boolean trail = true;
    int count = 0;
    for (int i=length-1; i>= 0 ; i--){
        if(str[i] != ' ' && trail == true) {
            trail = false;
            count = length - 1 - i;
            str[i+count] = str[i];
        } else if (trail == false && str[i] != ' '){
            str[i+count] = str[i];
        } else if (trail == false) {
            str[i+count] = '0';
            str[i+count-1] = '2';
            str[i+count-2] = '%';
            count -= 2;
        }
    }
  }


    
  public static void main(String[] args) {
    String test = "Mr John Smith    ";
    System.out.println(replaceSpaces(test));
  }
}