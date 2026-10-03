
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis 
    public static void main(String[] args) {
        int[] sortedArray = new int[]{2, 4, 8, 12, 23, 38, 56, 72, 91};
        int low = 0;
        int high = sortedArray.length - 1;

        // Test 1 - key present in the array
        int key1 = 23;
        int result1 = runBinarySearchIteratively(sortedArray, key1, low, high);
        if (result1 != Integer.MAX_VALUE) {
            System.out.println("Element " + key1 + " found at index " + result1);
        } else {
            System.out.println("Element " + key1 + " not found");
        }

        // Test 2 - key not present in array
        int key2 = 40;
        int result2 = runBinarySearchIteratively(sortedArray, key2, low, high);
        if (result2 != Integer.MAX_VALUE) {
            System.out.println("Element " + key2 + " found at index " + result2);
        } else {
            System.out.println("Element " + key2 + " not found");
        }
    }


/*
Time Complexity - The best case is O(1) when the target key is located directly at the intial mid pt
the worst case is O(log n) because the search interval is halfed on each step.

Space complexity - O(1) space since the binary search uses a constant number of pointers
(low, high mid) without adding too much extra space to call stacks.
 */

}