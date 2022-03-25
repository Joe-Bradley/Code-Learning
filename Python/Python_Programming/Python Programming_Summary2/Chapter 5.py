 # -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 12:15:20 2019

@author: lenovo
"""
#chapter 5
a, b = 1, 2
a, b = b, a
a1 = "{0} is taller than {1}.".format("xiaoma", "xiaowang")
a2 = "Age:{0:<5d}, Height:{1:5.2f}".format(1,2)

#5.1 calculate 1-100
s = 0 
for i in range(101):
    s = s + i
print(s)

#5.2 compute the GCD and LCM
x = 100
y = 67
z = x*y
if x < y:
    x, y = y, x
while x%y != 0:
    r = x%y
    x = y
    y = r
print(y,z//y)

#5.3 compute pi
import math 
s = 0
k = 1
sign = 1
x = 1
while math.fabs(x)>1e-8:
    s = s + x
    k = k + 2
    sign = sign * -1
    x = sign / k
s = s * 4
print(s)

#5.4 
a = ['1', '2', '3']
b = ['q', 'w', 'e']
for i, j in zip(a,b):
    print("{}-{}".format(i,j))

#5.5 
a = {'q':'1', 'p':'2', 'r':'3'}
for i,j in a.items():
    print("{}-{}".format(i,j))

#5.6
a = []
a1 = '1'
a.append(a1)

#5.7
a = ['1', '2', '3']
b = ['q', 'w', 'e']
c = []
for i in a:
    for j in b:
        c.append((i,j))
print(c)

#5.8 isprime
from math import sqrt
count = 0
for i in range(2,101):
    flag = True
    for j in range(2,int(sqrt(i))+1):
        if i%j == 0: 
            flag = False
            break
    if flag:
        count = count + 1
        if count % 5 == 0:
            print(i)
        else:
            print(i, ' ',end = '')

#5.9
a = [x for x in range(10)]
b = [x**2 for x in range(10)]
c = [x**2 for x in range(10) if x**2 <50]
d = [(i,j) for i in range(10) for j in range(10)]

#5.10
a = 'asdjaoskdj jcia ,.;,.;,.;,.;,.;,.;,sadjasas,l;sa,d'
a_dict = {}
a_rm = [',', '.', ';',' ']
for i in a_rm:
    a = a.replace(i,'')
    a_list = a.split(' ')
    a_list = list(a_list[0])
for j in range(len(a_list)):
    if a_list[j] in a_dict:
        a_dict[a_list[j]] = a_dict[a_list[j]] + 1
    else:
        a_dict[a_list[j]] = 1
a_dict = sorted(a_dict.items(), key = lambda x:(x[0],x[1]))
for s in range(len(a_dict)):
    print(a_dict[s][0], a_dict[s][1])

#5.11 bubble sort
#5.12 selection sort
#5.13 insertion sort
    

        
    