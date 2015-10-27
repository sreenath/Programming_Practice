/* 
 * Author: Sreenath T V
 * https://codility.com/demo/results/training99NTKJ-K3R/
 */
 
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0; 
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 0) {
                A[i] = count;
            } else {
                count += 1;
                A[i] = -1;
            }
        }
        long result = 0;
        for(int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                result += A[i];
            }
        }
        
        if (result > 1000000000) {
            return -1;
        }
        
        return (int)result;
    }
}