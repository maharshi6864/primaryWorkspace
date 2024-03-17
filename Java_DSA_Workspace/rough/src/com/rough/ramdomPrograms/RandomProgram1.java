package com.rough.ramdomPrograms;
//Write a program to find the position in an array whose sum is the target number here in this number its 9.
public class RandomProgram1 {

    public static void main(String[] args) {

        int []arr={1,2,3,4,5,2,1,3,52,2,34};
        int []pos=new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i]+arr[j])==9)
                {
                    pos[0]=arr[i];
                    pos[1]=arr[j];
                }
            }
        }

        System.out.println("The postions in the array whose addition will be 9 is : "+pos[0]+" and "+pos[1]+" .");
    }
}
