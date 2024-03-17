package com.rough.ramdomPrograms;

import java.util.Scanner;

public class ArrayDeleteOperation {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 4, 5, 6, 7, 8, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the postion you want to delete :  ");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();
        for (int i = position-1; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        System.out.println("Element deleted array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
