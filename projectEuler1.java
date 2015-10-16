/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/challenges/plus-minus
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class projectEuler1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kbd = new Scanner(System.in);
        int T = kbd.nextInt();
        long arr[] = new long[T];
        long result[] = new long[T];
        for (int i = 0; i < T; i++) {
            arr[i] = kbd.nextLong();
        }
        
        for (int i = 0; i < T; i++) {
            long num = (arr[i] - 1);
            long factThree = num / 3;
            long factFive = num / 5;
            long factFifteen = num / 15;
            result[i] = 3 * sumFinder(factThree) + 5 * sumFinder(factFive) - 15 * sumFinder(factFifteen);
            System.out.println(result[i]);
        }
    }
    
    private static long sumFinder(long num) {
        return (num * (num + 1)) / 2;
    }
}