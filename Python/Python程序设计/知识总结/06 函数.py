# -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 14:28:57 2019

@author: lenovo

#6.1 function of gcd
def gcd(x,y):
    if x < y:
        x, y = y, x
    while x%y != 0:
        r = x%y
        x = y 
        y = r
    return y
#6.2 function of isprime 
from math import sqrt
def isprime(x):
    if x == 1:
        return False
    for i in range(2,int(sqrt(x))+1):
            if x % i == 0:
                return False
    return True

#6.3 average score
def search(score):
    maxScore = 0
    minScore = 100
    for i,j in score.items():
        avg = (score[i][0] + score[i][1] +score[i][2])//3
        if avg > maxScore:
            maxScore = avg
            maxName = j
        if avg < minScore:
            minScore = avg
            minName = j
    return maxName, minName

#6.4 lambda
a = sorted(M.items(), key = lambda d:d[0])
"""
#6.5
        
        