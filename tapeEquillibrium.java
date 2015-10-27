/* 
 * Author: Sreenath T V
 * https://codility.com/demo/results/trainingEUJ79J-59Z/#task-0
 */


import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        for (int i = 1; i < A.length; i++) {
            A[i] += A[i - 1];  
        }
        int total = A[A.length - 1]; 
        int min = Math.abs(total - (2 * A[0]));
        int temp = 0;
        for (int i = 1; i < A.length - 1; i++) {
            temp = Math.abs(total - (2 * A[i]));
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }
}