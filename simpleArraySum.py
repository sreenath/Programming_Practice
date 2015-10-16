''' 
  Author: Sreenath T V
  https://www.hackerrank.com/challenges/simple-array-sum
'''

import sys
N = input()
inp = input()
arr = inp.split(" ")
sum = 0
for element in arr:
	sum += int(element)
print(sum)