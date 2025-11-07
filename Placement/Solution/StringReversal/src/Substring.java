public class Substring {
    public static void main(String[] args){
      String str = "Fun world";
      String pattern = "wos";
      System.out.println("The String and the pattern are respectively given as :" + str + pattern);
      int i=0 , j=0;
      int count=0;
      while(i<str.length() && j<pattern.length()){
        if(str.charAt(i)==pattern.charAt(j) ){
            if(j==pattern.length()-1){
                count = 1;
            }
            i++;
            j++;
        }else{
            i++;
        }
      }
      if(count==1){
        System.out.println("The given Strng is a substring");
      }
      else{
        System.out.println("The given string is not substring");
      }
    }
    
}
