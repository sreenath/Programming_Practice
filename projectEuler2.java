/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler002
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
        long current = 2;
        long previous = 1;
        long sum = 2;
        long arr[] = new long[T];
        long temp = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = kbd.nextLong();
        }
        for (int i = 0; i < T; i++) {
            temp = current + previous;
            while (temp < arr[i]) {
                sum += (temp % 2 == 0) ? temp : 0;
                previous = current; 
                current = temp;
                temp = current + previous;
            }
            System.out.println(sum);
            current = 2;
            previous = 1;
            sum = 2;
        }
    }
}