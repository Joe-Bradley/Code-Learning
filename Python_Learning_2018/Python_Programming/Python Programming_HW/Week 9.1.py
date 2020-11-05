# -*- coding: utf-8 -*-
"""
Created on Fri May  3 11:19:22 2019

@author: lenovo
"""
#9.1 recursion func
def a(x):
    if x == 1:
        return 10
    else:
        return a(x-1) + 2
if __name__ == "__main__":
    aa = int(input("Please enter a number:"))
    print(a(aa))