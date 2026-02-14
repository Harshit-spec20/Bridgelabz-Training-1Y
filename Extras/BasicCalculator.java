package JavaString.Extras;
import java.util.Scanner;
public class BasicCalculator {
    static double add(double a,double b){
        return a+b;
    }
    static double subtract(double a,double b){
        return a-b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    static double divide(double a,double b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter second number:");
        double num2=sc.nextDouble();
        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice=sc.nextInt();
        double result=0;
        if(choice==1){
            result=add(num1,num2);
        }else if(choice==2){
            result=subtract(num1,num2);
        }else if(choice==3){
            result=multiply(num1,num2);
        }else if(choice==4){
            result=divide(num1,num2);
        }else{
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Result: "+result);
    }
}