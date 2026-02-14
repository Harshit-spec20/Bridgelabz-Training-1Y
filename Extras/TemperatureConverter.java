package JavaString.Extras;
import java.util.Scanner;
public class TemperatureConverter {
    static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Celsius to Fahrenheit");
        System.out.println("Enter 2 for Fahrenheit to Celsius");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter temperature in Celsius:");
            double c=sc.nextDouble();
            double f=celsiusToFahrenheit(c);
            System.out.println("Temperature in Fahrenheit: "+f);
        }else if(choice==2){
            System.out.println("Enter temperature in Fahrenheit:");
            double f=sc.nextDouble();
            double c=fahrenheitToCelsius(f);
            System.out.println("Temperature in Celsius: "+c);
        }else{
            System.out.println("Invalid choice");
        }
    }
}