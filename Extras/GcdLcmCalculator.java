package JavaString.Extras;
import java.util.Scanner;
public class GcdLcmCalculator{
    static int takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        return sc.nextInt();
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static void displayResult(int gcdValue,int lcmValue){
        System.out.println("GCD is: "+gcdValue);
        System.out.println("LCM is: "+lcmValue);
    }
    public static void main(String[]args){
        System.out.println("Enter first number:");
        int num1=takeInput();
        System.out.println("Enter second number:");
        int num2=takeInput();
        int gcdValue=gcd(num1,num2);
        int lcmValue=lcm(num1,num2);
        displayResult(gcdValue,lcmValue);
    }
}