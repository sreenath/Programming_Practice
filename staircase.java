/* 
 * Author: Sreenath T V
 * https://www.hackerrank.com/challenges/plus-minus
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kbd = new Scanner(System.in);
        int N;
        N = kbd.nextInt();
        String hashArr[] = new String[N];
        String spaceArr[] = new String[N];
        String tempHash = "";
        String tempSpace = "";
        
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                tempHash += "#";
            } else {
                tempHash += "#";
                tempSpace += " ";
            }
            hashArr[i] = tempHash;
            spaceArr[i] = tempSpace;
        }
        
        for(int i = 0, j = N-1; i < N && j >= 0; i++, j--) {
            System.out.println(spaceArr[j] + hashArr[i]);
        }
    }
}