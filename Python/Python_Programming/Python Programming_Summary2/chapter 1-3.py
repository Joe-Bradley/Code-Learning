################## 
a = [1,2,3,4,5,6] 
b = "hello word"
c = (1,2,3,4)
d = range(1,100)
##################
a[1]
a[-1]
a[:3] #not include one on the right side 
a[:-1] #from 0 to the last second one 
a[0:3:2] #step length
a[::-1] #reverse !!!!
a[5:1:-2]
a*3 #duplicate
a + a[0:2] #joint
"love".join(["a","b"]) #another joint

#fuctions !!!!!
e = len(a)
e = sum(a)
e = max(a)
e = min(a)
e = sorted(a) #by ACSLL,output list
e = list(reversed(a))
e = list(enumerate(a)) #coding

#str !!!!直接生成新的东西!!!!
e = b.split() #b = b.split(":")[1], defaut == ""
e = b.title() #change to the uniform of b
e = b.lower() #change to the lower form of b
e = b.replace("hello","hi") #replace hello with hi
e = b.count("l") #calculate the number of l
e = b.index('l')
e = b.find('l')
e = b.center(20) #20字符长，b居中

#list !!!!直接在旧列表上面改!!!!
a.sort()  #!!!str & tuple use: sorted(a)!!!,sort(key = len,reverse = True)
a.reverse() #!!!str & tuple: reversed(a)!!!
a.pop() #delete the index'th(default == -1) and return with it 
a.remove(2)
a.append(1)
a.extend([1])
a.extend("asda") 
a.copy()

#determin 
1 in a #T
"1" in a #F
int("1") in a #T

#Trans
a1 = str(a)
b1 = tuple(b)
c1 = list(c)

#ways
import numpy as np
import pandas as pd
a01 = array([1,2,3,4])
a02 = array([[1,2],[3,4]])
a03 = arange(0,10,1)
a04 = arange(0,10,0.1)
a05 = linspace(0,10,11)
a06 = logspace(0,10,10, base = e)
a07,a08 = mgrid[0:5,0:5]
a09 = random.rand(5,5)
a10 = random.randn(5,5)
a11 = diag([1,2,3],k=1)
a12 = zeros((3,3))
a13 = ones((3,3))
a14 = a09[1,:]
a15 = a09[1,2]
print(a15)

