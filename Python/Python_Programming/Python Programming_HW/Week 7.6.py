# -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 21:28:04 2019

@author: lenovo
"""

#7.6
"""
题目描述
如果一个n（n<=9）位数刚好包含了1至n中所有数字各一次则称它们是全数字（pandigital）的，例如四位数1324就是1至4全数字的。从键盘上输入一组（不止一个）整数，输出其中的全数字，若找不到则输出“not found”。形如：

def pandigital(nums): 
      ......
      return lst


输入格式:
多个数字串，中间用一个逗号隔开

输出格式：
满足条件的数字串，分行输出
输入
1243,322,321,1212,2354
输出
1243
321
提示
if __name__ == "__main__":

      lst = pandigital(eval(input()))

      调用函数根据结果输出
"""
 def pandigital(a):
    x = []
    for i in a:
        flag = True
        m = list(str(i))
        n = len(m)
        for j in range(1,n+1):
            p = str(j)
            if p not in m:
                flag = False
        if flag == True:
            x.append(i)
    if x == []:
        print("not found")
    else:
        for i in range(len(x)):
            print(x[i])

if __name__ == "__main__":
    a = eval(input())
    pandigital(a)

        