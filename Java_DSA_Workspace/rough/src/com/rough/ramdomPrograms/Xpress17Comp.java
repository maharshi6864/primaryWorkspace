package com.rough.ramdomPrograms;

import java.util.Scanner;

public class Xpress17Comp {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements in an array :");
        int numbers=input.nextInt();
        int arr[]=new int[numbers+1];
        for (int i = 0; i < numbers;i++) {
            System.out.println("Enter number at index of : "+i);
            arr[i]= input.nextInt();
        }
        for (int i = 0; i <numbers ; i++) {
            for (int j = i+1; j < numbers; j++) {
                if (arr[i]==arr[j])
                {
                    for (int k = j; k < 10; k++) {
                        arr[k]=arr[k+1];
                    }
                    numbers--;
                }
            }
        }
        System.out.println("All the unique numbers are :::");
        for (int i = 0; i < numbers; i++) {
            System.out.println(arr[i]);
        }
    }
}
