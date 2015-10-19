/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler003
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner kbd = new Scanner(System.in);
        T = kbd.nextInt();
        long arr[] = new long[T];
        long fromBottom = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = kbd.nextLong();
        }
        boolean result;
        long num;
        for (int i = 0; i < T; i++) {
            result = false;
            num = 0;
            fromBottom = 0;
            if(checkPrime(arr[i])) {
                System.out.println(arr[i]);
                continue;
            }
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    num = arr[i] / j;
                    result = checkPrime(num);
                    if (result) {
                        System.out.println(num);
                        break;
                    } else {
                        if (checkPrime(j)) {
                            fromBottom = j;
                        }
                    }
                }
            }
            if (!result && fromBottom != 0) {
                System.out.println(fromBottom);
            }
        }
    }
    private static boolean checkPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}