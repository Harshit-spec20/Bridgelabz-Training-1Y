package JavaString.Extras;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    static int generateGuess(int min,int max){
        Random r=new Random();
        return r.nextInt(max-min+1)+min;
    }
    static String getFeedback(Scanner sc){
        System.out.println("Enter feedback (high/low/correct):");
        return sc.nextLine();
    }
    static int nextGuess(String feedback,int guess,int min,int max){
        if(feedback.equalsIgnoreCase("high")){
            max=guess-1;
        }else if(feedback.equalsIgnoreCase("low")){
            min=guess+1;
        }
        return generateGuess(min,max);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=100;
        int guess=generateGuess(min,max);
        while(true){
            System.out.println("Computer guess: "+guess);
            String feedback=getFeedback(sc);
            if(feedback.equalsIgnoreCase("correct")){
                System.out.println("Computer guessed correctly");
                break;
            }
            if(feedback.equalsIgnoreCase("high")){
                max=guess-1;
            }else if(feedback.equalsIgnoreCase("low")){
                min=guess+1;
            }
            guess=generateGuess(min,max);
        }
    }
}