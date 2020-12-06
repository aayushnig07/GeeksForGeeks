package arrays;

//Move all zeroes to end of array
//        Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
//        For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
//        The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
//        Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
//        it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
//        The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i < len; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
