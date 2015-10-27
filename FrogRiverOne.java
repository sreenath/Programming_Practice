/* 
 * Author: Sreenath T V
 * https://codility.com/demo/results/trainingZGCSKM-ZHU/
 */
 
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int [] arr = new int[X + 1];
        for (int i = 0; i <= X; i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < A.length; i++) {
            if (arr[A[i]] == -1) {
                arr[A[i]] = i;
            }
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == -1) {
                return -1;
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}