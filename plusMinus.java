/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/challenges/plus-minus
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class plusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
    Scanner kbd = new Scanner(System.in);
    N = kbd.nextInt();
    int arr[] = new int[N];
    int cp = 0, cn = 0, cz = 0;
    for (int i = 0; i < N; i++) {
        arr[i] = kbd.nextInt();
        if (arr[i] > 0) {
            cp++;
        } else if (arr[i] < 0) {
            cn++;
        } else {
            cz++;
        }
    }
    float total = N * 1.0f;
    System.out.println(String.format("%.3f", (cp / total)));
    System.out.println(String.format("%.3f", (cn / total)));
    System.out.println(String.format("%.3f", (cz / total)));
    }
}