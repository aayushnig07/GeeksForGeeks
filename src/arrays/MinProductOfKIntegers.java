package arrays;

import java.util.Arrays;
//Minimum product of k integers in an array of positive Integers
//        Given an array of n positive integers.
//        We are required to write a program to print the minimum product of k integers of the given array.
//        Input : 198 76 544 123 154 675
//        k = 2
//        Output : 9348
//        We get minimum product after multiplying
//        76 and 123.
//
//        Input : 11 8 5 7 5 100
//        k = 4
//        Output : 1400

public class MinProductOfKIntegers {
    public static void main(String[] args) {
        int[] arr = {198, 76, 544, 123, 154, 675};
        int k = 2;
        int len = arr.length;
        Arrays.sort(arr);
        int product = 1;
        for (int i = 0; i < k; i++) {
            product = product * arr[i];
        }
        System.out.println(product);
    }
}
