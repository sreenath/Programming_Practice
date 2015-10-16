/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/challenges/diagonal-difference/
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        Scanner kbd = new Scanner(System.in);
        N = kbd.nextInt();
        int matrix[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = kbd.nextInt();
            }
        }
        int fromLeft = 0;
        int fromRight = N - 1;
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < N; i++) {
            sumLeft += matrix[i][fromLeft++];
            sumRight += matrix[i][fromRight--];
        }
        int result = sumLeft > sumRight ? (sumLeft - sumRight) : (sumRight - sumLeft);
        System.out.println(result);
    }
}