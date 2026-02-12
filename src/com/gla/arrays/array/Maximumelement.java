package com.gla.arrays.array;

public class Maximumelement {
    static void main(String[] args) {
        int arr[]={5,6,2,7,9,1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
