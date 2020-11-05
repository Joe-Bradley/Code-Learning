# -*- coding: utf-8 -*-
"""
Created on Fri May  3 12:12:56 2019

@author: lenovo
"""

# -*- coding: utf-8 -*-
"""
Created on Fri May  3 11:58:52 2019

@author: lenovo
"""

a1 = open("C:/Users/lenovo/Desktop/HW9_3_1.txt",'r+')
a2 = open("C:/Users/lenovo/Desktop/HW9_3_1.txt",'r+')

#version one 
s1 = a1.read()
s2 = a2.read()
if s1 == s2:
    print("They are the same flies")
else:
    print("They are not the same flies")

#version two
flag = True
line1 = a1.readline()
line2 = a2.readline()
while line1 and line2:
    if line1 != line2:
        flag = False
        break
    else:
        line1 = a1.readline()
        line2 = a2.readline()
if flag:
    print("They are the same flies")
else:
    print("They are not the same flies")
a1.close()
a2.close()
        
    
