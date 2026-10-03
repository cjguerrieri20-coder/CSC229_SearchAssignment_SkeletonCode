package org.example;

import java.util.Arrays;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int[] a, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                // ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    // Swap adjacent out-of-order elements
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    // Test driver
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    /*
     * Time Complexity:
     *   - Best Case: O(n^2) for this standard version since both nested loops
     *     execute fully regardless of initial element ordering.
     *   - Average Case: O(n^2) where elements require roughly n(n - 1) / 4 comparisons
     *     and swaps.
     *   - Worst Case: O(n^2) when the array is in reverse sorted order,
     *     performing n(n - 1) / 2 comparisons and swaps.
     *
     * Space Complexity:
     *   - Auxiliary Space: O(1) in-place sorting algorithm utilizing only
     *     primitive pointer and swap variables (outer, inner, temp).
     */
}