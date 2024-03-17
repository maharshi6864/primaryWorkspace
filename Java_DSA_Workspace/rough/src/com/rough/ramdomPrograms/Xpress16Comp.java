package com.rough.ramdomPrograms;

import java.util.Scanner;

public class Xpress16Comp {

    public static void main(String[] args) {
        System.out.println("Enter number of rows you want to print : ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        char ele='a';
        ele=(char)(ele+rows-1);
        for (int i = 0; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = rows-i; j >0; j--) {
                System.out.print(ele);
            }
            ele--;
            System.out.println();
        }
    }
}
