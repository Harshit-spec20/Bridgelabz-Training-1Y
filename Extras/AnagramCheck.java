package JavaString.Extras;
import java.util.Scanner;
public class AnagramCheck{
    static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s+","").toLowerCase();
        s2=s2.replaceAll("\\s+","").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        int[]freq=new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        if(isAnagram(s1,s2)){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }
    }
}
