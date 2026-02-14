package JavaString.Extras;
import java.util.Scanner;
public class ReplaceWord{
    static String replace(String sentence,String oldWord,String newWord){
        String[]words=sentence.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord)){
                result=result+newWord;
            }else{
                result=result+words[i];
            }
            if(i<words.length-1){
                result=result+" ";
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        System.out.println("Enter word to replace:");
        String oldWord=sc.nextLine();
        System.out.println("Enter new word:");
        String newWord=sc.nextLine();
        String output=replace(sentence,oldWord,newWord);
        System.out.println("Updated sentence: "+output);
    }
}