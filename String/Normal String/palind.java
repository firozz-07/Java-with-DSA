public class palind{
  public static void main(String[] args) {
    String str="lejvel";
    int num=0;
    int left=0;
    int right=str.length()-1;
    while (left<right) {
      if(str.charAt(left)!=str.charAt(right)){
       num++;
      }
      left++;
      right--;
    }
    System.out.println(num==0 ?"palindrome" :"not palindrome");

  }
}