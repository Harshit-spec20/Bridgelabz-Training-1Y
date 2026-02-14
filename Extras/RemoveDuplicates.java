package JavaString.Extras;
import java.util.Scanner;
public class RemoveDuplicates{
    static String removeDuplicates(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        String output=removeDuplicates(input);
        System.out.println("String after removing duplicates: "+output);
    }
}