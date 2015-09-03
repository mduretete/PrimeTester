package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        // if (n == null) {
        //     return false;
        //}
        if (n < 2) {
            return false;
        }
        else if (n % 2 == 0) {
            if (n == 2){
                return true;
            }
            return false;
        }
        int sqrtN = (int) Math.sqrt(n) + 1;
        for (int a = 3; a < sqrtN; a = a + 2){
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }
}


