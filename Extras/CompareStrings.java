package JavaString.Extras;
import java.util.Scanner;
public class CompareStrings{
    static int compare(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        int min=len1<len2?len1:len2;
        for(int i=0;i<min;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2){
                return c1-c2;
            }
        }
        return len1-len2;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        int result=compare(s1,s2);
        if(result==0){
            System.out.println("Both strings are equal");
        }else if(result<0){
            System.out.println("First string comes before second string");
        }else{
            System.out.println("First string comes after second string");
        }
    }
}