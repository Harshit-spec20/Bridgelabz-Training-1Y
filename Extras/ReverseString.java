package JavaString.Extras;
import java.util.Scanner;
public class ReverseString{
    static String reverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        String reversed=reverse(input);
        System.out.println("Reversed string: "+reversed);
    }
}