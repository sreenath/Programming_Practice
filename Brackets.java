''' 
  Author: Sreenath T V
  https://codility.com/demo/results/trainingSNY2B4-QFV/
'''

import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Deque<String> stack = new ArrayDeque<String>();
        if (S.length() == 0) {
            return 1;
        }
        
        String [] temp = new String[S.length()];
        temp = S.split("");
        for (int i = 0; i < temp.length; i++) {
            if (stack.isEmpty()) {
                stack.push(temp[i]);
                continue;
            } 
            if (temp[i].equals("}") && stack.peek().equals("{")) {
                stack.pop();
            } else if (temp[i].equals("]") && stack.peek().equals("[")) {
                stack.pop();
            } else if (temp[i].equals(")") && stack.peek().equals("(")) {
                stack.pop();
            } else {
                stack.push(temp[i]);
            }
        }
        
        if (stack.isEmpty()) {
            return 1;
        } 
        return 0;
    }
}