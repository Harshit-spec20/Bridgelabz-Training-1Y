package JavaString.Extras;
import java.util.Scanner;
public class PalindromeStringCheck{
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        if(isPalindrome(input)){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}