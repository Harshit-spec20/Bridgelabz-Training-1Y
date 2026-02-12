package com.gla.arrays.array;

public class Minimum {
    static void main(String[] args) {
        int arr[]={5,6,2,7,9,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
