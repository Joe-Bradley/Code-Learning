# -*- coding: utf-8 -*-
"""
Created on Fri Apr 19 18:18:58 2019

@author: lenovo
s.isalnum()  所有字符都是数字或者字母
s.isalpha()  所有字符都是字母
s.isdigit()  所有字符都是数字
s.islower()  所有字符都是小写
s.isupper()  所有字符都是大写
s.istitle()  所有单词都是首字母大写，像标题
s.isspace()  所有字符都是空白字符、\t、\n、\r 
"""
from math import sqrt
def a(x):
    a = sqrt(x)
    b = x // int(a)
    if a == b:
        return True
    else:
        return False
def b(x):
    x = str(x)
    flag = True
    for i in range(len(x)//2 + 1):
        if x[i] != x[-i-1]:
            flag = False
            break
    if flag:
        return True
    else:
        return False
for x in range(1,1000000):
    if a(x) and b(x):
        print(x)
    
