# -*- coding: utf-8 -*-
"""
Created on Tue May 14 16:23:33 2019

@author: lenovo
"""
def dlookup(d, name):
    if name in d:
        x = d[name]
    else:
        return 0  # replace -1 with 0
    date = x.split('/')
    year = eval(date[0])
    month = eval(date[1])
    day = eval(date[2])
    p = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]     # 平年
    w = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]     # 闰年
    sum = 0
    for i in range(month-1):   # replace list() with range()
        if year % 4 == 0 and year % 100 != 0 or year % 400 == 0: # replace the second "and" with "or'
            sum += w[i]
        else:
            sum += p[i]
    return sum + day # add value of the day to sum
 
if __name__ == "__main__":
     d = {'John':'1998/7/21','Mary':'2000/3/2','Danny':'1996/11/7'}
     name = input()
     s = dlookup(d, name)
     if s == 0:
         print("not in")
     else:
         print(s)