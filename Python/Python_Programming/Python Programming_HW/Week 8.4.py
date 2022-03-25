# -*- coding: utf-8 -*-
"""
Created on Fri Apr 19 18:55:18 2019

@author: lenovo

是因为python函数使用return返回值，如果不用
return, 而用print输出值，这个函数默认还有一个返回值为Non
"""
#定义阶乘
def a(x):
    if x == 0:
        return 1
    else:
        return x*a(x-1)

#定义组合数
def b(x,y):
    return a(y)//(a(x)*a(y-x))
    
#定义杨辉三角    
def printytri(n):
    for i in range(n):
        for j in range(i+1):
            if j == i:
                print(b(j,i))
            else:
                print(b(j,i), end = ' ')
if __name__ == "__main__":
    n = int(input())
    printytri(n)
        
    
            