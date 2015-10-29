''' 
  Author: Sreenath T V
    https://codility.com/demo/results/training7JF9SS-7GM/
'''

def solution(A):
    # write your code in Python 2.7
    arr = [0] * len(A)
    for element in A:
        if element > len(A):
            return 0
        arr[element - 1] = 1
    
    for element in arr:
        if element==0:
            return 0
    return 1