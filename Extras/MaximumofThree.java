package JavaString.Extras;
import java.util.Scanner;
public class MaximumofThree{
    static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[3];
        System.out.println("Enter first number:");
        arr[0]=sc.nextInt();
        System.out.println("Enter second number:");
        arr[1]=sc.nextInt();
        System.out.println("Enter third number:");
        arr[2]=sc.nextInt();
        return arr;
    }
    static int findMaximum(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    public static void main(String[]args){
        int[]numbers=takeInput();
        int max=findMaximum(numbers[0],numbers[1],numbers[2]);
        System.out.println("Maximum number is: "+max);
    }
}