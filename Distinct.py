''' 
  Author: Sreenath T V
  https://codility.com/demo/results/trainingSNPYTP-B4Q/
'''

def solution(A):
    # write your code in Python 2.7
    if len(A) == 0:
        return 0
    A.sort()
    count = 1
    lastValue = A[0]
    for index, element in enumerate(A):
        if (index == 0) or (element == lastValue):
            pass
        else:
            lastValue = element
            count += 1
    return count