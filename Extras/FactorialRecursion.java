package JavaString.Extras;
import java.util.Scanner;
public class FactorialRecursion{
    static int takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        return sc.nextInt();
    }
    static long factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void displayResult(long result){
        System.out.println("Factorial is: "+result);
    }
    public static void main(String[]args){
        int num=takeInput();
        long result=factorial(num);
        displayResult(result);
    }
}