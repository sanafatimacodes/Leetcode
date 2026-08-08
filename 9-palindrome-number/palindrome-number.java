import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
       while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;    
    } 
    if (rev==original){
            return true;
        }else{
            return false;
        }
       
       }
       
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    System.out.println(isPalindrome(x));
    }


}