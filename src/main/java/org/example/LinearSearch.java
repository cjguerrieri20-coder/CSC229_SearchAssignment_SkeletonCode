
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // return index
            }
        }
        return -1; // target not found in array

    }

    // test driver
    public static void main(String[] args) {
        int[] data = {14, 5, 27, 8, 42, 19};

        // Test 1 to see if element is visible in array
        int key1 = 42;
        int result1 = search(data, key1);
        if (result1 != -1) {
            System.out.println("Element " + key1 + " found at index: " + result1);
        } else {
            System.out.println("Element " + key1 + " not found.");
        }

        // Test 2: Element not present in array
        int key2 = 99;
        int result2 = search(data, key2);
        if (result2 != -1) {
            System.out.println("Element " + key2 + " found at index: " + result2);
        } else {
            System.out.println("Element " + key2 + " not found.");
        }
    }

/*
Asymptotic Analysis:
The time complexity for the best case is O(1) when the target is at index -.
The worst case is O(n) when the target is at index n - 1

The space complexity is O(1) space since only scalar variables (n, i) are used
 */

}