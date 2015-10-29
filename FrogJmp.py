''' 
  Author: Sreenath T V
	https://codility.com/demo/results/trainingK674FG-E9A/
'''

import math
def solution(X, Y, D):
    # write your code in Python 2.7
    diff = Y - X
    div = (diff * 1.0 / D)
    return int(math.ceil(div))
    