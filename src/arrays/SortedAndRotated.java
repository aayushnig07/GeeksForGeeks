package arrays;
//        Search an element in a sorted and rotated array
//        An element in a sorted array can be found in O(log n) time via binary search.
//        But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
//        So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {30, 40, 50, 10, 20};
        int key = 10;

        int pivotIndex = findPivotIndex(arr);
        int firstArrayStart = 0;
        int firstArrayEnd = pivotIndex;
        int secondArayStart = pivotIndex + 1;
        int secondArrayEnd = arr.length;

        int index = binarySearch(arr, firstArrayStart, firstArrayEnd, key);
        if (index == -1)
            index = binarySearch(arr, secondArayStart, secondArrayEnd, key);
        if (index != -1)
            System.out.println(index);
        else
            System.out.println("Element not found");


    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    private static int findPivotIndex(int[] arr) {
        int len = arr.length;
        int pivot = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}
