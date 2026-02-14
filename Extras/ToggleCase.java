package JavaString.Extras;
import java.util.Scanner;
public class ToggleCase{
    static String toggle(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                result=result+(char)(ch-32);
            }else if(ch>='A'&&ch<='Z'){
                result=result+(char)(ch+32);
            }else{
                result=result+ch;
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        String output=toggle(input);
        System.out.println("Toggled string: "+output);
    }
}