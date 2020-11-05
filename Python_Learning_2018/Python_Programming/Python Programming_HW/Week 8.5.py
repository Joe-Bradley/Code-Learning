# -*- coding: utf-8 -*-
"""
Created on Sat Apr 20 10:16:35 2019

@author: lenovo
"""
#生成矩阵
def g(n):
    a = []
    print("Please enter row vectors:")
    for i in range(n):
        aa = input().split()
        for i in range(len(aa)):
            aa[i] = int(aa[i])
        a.append(aa)
    return a
#排序        
def line_sort(x):
    print("The result matrix is:")
    for i in range(len(x)):
        aa = sum(x[i])
        x[i].append(aa)
    x = sorted(x,key = lambda d : d[-1])
    for i in range(len(x)):
        for j in range(len(x[i])-1):
            if j == len(x[i])-2:
                print(x[i][j])
            else:
                print(x[i][j],end = ' ')

if __name__ == "__main__":
    n = int(input("Please enter the number of rows:"))
    c = g(n)
    line_sort(c)
    