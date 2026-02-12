package JavaString.Extras;
import java.util.Scanner;
public class RemoveSpecificCharacter{
    static String removeChar(String str,char ch){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                result=result+str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        System.out.println("Enter character to remove:");
        char ch=sc.nextLine().charAt(0);
        String output=removeChar(input,ch);
        System.out.println("Result: "+output);
    }
}