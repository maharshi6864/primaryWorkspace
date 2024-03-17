package com.rough.ramdomPrograms;

public class LeetCode451_1Program {

    public static String findDecendingString(String s) {
        String newString= String.valueOf(new StringBuilder());
        char []arr=s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    char temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

      return newString;
    }

    public static void main(String[] args) {

        String s = "abbA";
        String newString = findDecendingString(s);
        System.out.println(newString);


    }
}
