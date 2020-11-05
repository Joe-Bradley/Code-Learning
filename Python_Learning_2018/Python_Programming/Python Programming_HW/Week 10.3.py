# -*- coding: utf-8 -*-
"""
Created on Tue May 14 17:16:56 2019

@author: lenovo
"""

a = """id score
1003 87
1006 75
1008 91
1010 97
1011 88
"""

aa = open("C:/Users/lenovo/Desktop/score.txt", "w")
aa.write(a)
aa.close()

aa = open("C:/Users/lenovo/Desktop/score.txt", "r")
lines = aa.readlines()
aa.close()

aa = open("C:/Users/lenovo/Desktop/score.txt", "w")
b = []
c = []
for i in range(1, len(lines)):
    b.append(lines[i].split()[1])
    c.append(lines[i].split()[0])
d = dict(zip(b,c))
maxb = max(b)
minb = min(b)
maxid = d[maxb]
minid = d[minb]
print("最高分为：{}分，该学生学号为：{}".format(maxb,maxid))
print("最低分为：{}分，该学生学号为：{}".format(minb,minid))


    