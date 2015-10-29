''' 
  Author: Sreenath T V
  https://codility.com/demo/results/trainingKD6B8D-DZ7/
'''

def solution(A):
    # write your code in Python 2.7
    arr = [0] * len(A)
    for element in A:
        if element > 0 and element <= len(A):
            arr[element - 1] = 1
    for index, element in enumerate(arr):
        if element == 0:
            return index + 1
    return len(A)+1