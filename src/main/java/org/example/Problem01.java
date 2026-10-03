
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    // Method to check if a number is prime
    public static boolean isPrime(int n){
    if (n <= 1) {
    return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }


    public static long getSumOfPrimes(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {

                sum += i;
            }
        }
        return sum;
    }

    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution

public static void main(String[] args) {
    int n1 = 10;
    System.out.println("Sum of primes up to " + n1 + ": +  " + getSumOfPrimes(n1));

    int n2 = 20;
    System.out.println("Sum of primes up to " + n2 + ": +  " + getSumOfPrimes(n2));
}
    //          Analyze its space and time  
    /*
    Time Complexity is O(n* sqrt(n)) since the loop runs n times and checks up to sqrt(i).
    The space complexity is O(1) auxillary space using only prime accumulator variables.
     */


    
}
