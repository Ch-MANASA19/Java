//implementation of binary search in java

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    // Function to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}