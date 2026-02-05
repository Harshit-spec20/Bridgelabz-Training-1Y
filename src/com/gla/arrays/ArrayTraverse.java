package com.gla.arrays;
import java.util.Scanner;
public class ArrayTraverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter your number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your numbers are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
