package JavaString.Extras;
import java.util.Scanner;
public class PalindromeChecker{
    static String takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        return sc.nextLine();
    }
    static boolean isPalindrome(String str){
        String s=str.replaceAll("\\s+","").toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void displayResult(boolean result){
        if(result){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
    public static void main(String[]args){
        String input=takeInput();
        boolean result=isPalindrome(input);
        displayResult(result);
    }
}