/* 
 * Author: Sreenath T V
 * https://codility.com/programmers/task/perm_missing_elem
 */

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            sum += A[i];
        }
        long total = (len + 1) * (len + 2) / 2;
        Long temp = new Long(total - sum);
        return temp.intValue();
    }
}