package arrays;

//Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
//        Given an array of integers, task is to print the array in the order –
//        smallest number, Largest number, 2nd smallest number, 2nd largest number,
//        3rd smallest number, 3rd largest number and so on…..
//        Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
//        Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}

import java.util.Arrays;

public class SmallesLargestAndSoOn {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 4, 2, 8, 3, 6};
//        {1,2,3,4,5,6,7,8}
        int n = arr.length;
        int[] tempArr = new int[n];
        Arrays.sort(arr);
        int ArrIndex = 0;
        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2;
             i++, j--) {
            if (ArrIndex < n) {
                tempArr[ArrIndex] = arr[i];
                ArrIndex++;
            }

            if (ArrIndex < n) {
                tempArr[ArrIndex] = arr[j];
                ArrIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(tempArr[i]);
        }
    }
}

