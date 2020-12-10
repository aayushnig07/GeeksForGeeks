package arrays;

import java.util.Arrays;

//Find all elements in array which have at-least two greater elements
//        Given an array of n distinct elements,
//        the task is to find all elements in array which have at-least two greater elements than themselves.
//        Input : arr[] = {2, 8, 7, 1, 5};
//        Output : 2  1  5
//        The output three elements have two or
//        more greater elements
//
//        Input  : arr[] = {7, -2, 3, 4, 9, -1};
//        Output : -2  3  4 -1
public class ElementHavingAtLeast2GreaterElements {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 5};
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len - 2; i++) {
            System.out.println(arr[i]);
        }
    }
}
//    In second method we simply calculate second maximum
//    element of array and print all element which is less than or equal to second maximum.
