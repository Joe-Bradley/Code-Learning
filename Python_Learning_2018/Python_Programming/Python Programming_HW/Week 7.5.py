# -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 20:56:16 2019

@author: lenovo
"""

"""
7.5题目描述
寻找n以内的特殊数对。
代码格式如下：
def fac(n):
    ...
    return  xxx

n = int(input())

题目内容：
对于两个不同的整数A和B，如果整数A的全部因子（包括1，不包括A本身）之和等于B；
且整数B的全部因子（包括1，不包括B本身）之和等于A，则将A和B称为特殊数。
自定义函数fac(x)计算x包括1但不包括本身的所有因子和并返回。
从键盘输入整数n，调用fac()函数寻找n以内的特殊数并输出。
注意每个特殊数对只输出一次，小的在前大的在后，例如220-284。
输入
500
输出
220-284
"""
def fac(x):
    s=0
    for i in range(1,x):
        if x%i == 0:
            s = s + i
    return s
gg = int(input())
m = []
for i in range(2,gg + 1):
    j = fac(i)
    if i == fac(j) and i!=j :
        if i not in m  and j not in m:
            if i > j:
                i,j = j,i
            print("{}-{}".format(i,j))
        m.append(i)
        m.append(j)
       

            