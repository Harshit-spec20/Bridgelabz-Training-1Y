package JavaString.Extras;
import java.util.Scanner;
public class LongestWord{
    static String findLongest(String sentence){
        String[]words=sentence.split(" ");
        String longest="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        return longest;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        String longest=findLongest(sentence);
        System.out.println("Longest word: "+longest);
    }
}
