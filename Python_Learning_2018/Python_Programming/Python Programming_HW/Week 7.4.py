# -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 20:44:47 2019

@author: lenovo
"""

#7.4
from math import sqrt
def isprime(x):
    if x == 1:
        return False
    for i in range(2,int(sqrt(x))+1):
            if x % i == 0:
                return False
    return True
for m in range(3,2001):
    if m%2 == 0:
        for i in range(2,m):
            j = m-i
            if isprime(j) and isprime(i):
                break
        print(m,'=',i,'+',j,sep = '')
        
            