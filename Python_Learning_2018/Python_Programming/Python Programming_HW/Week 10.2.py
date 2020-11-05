# -*- coding: utf-8 -*-
"""
Created on Tue May 14 16:49:33 2019

@author: lenovo
"""
a = """How many roads must a man walk down
Before they call him a man
How many seas must a white dove sail
Before she sleeps in the sand
How many times must the cannon balls fly
Before they're forever banned
The answer my friend is blowing in the wind
The answer is blowing in the wind
"""
b = "Blowin'in the wind\n"
c = "Bob Dylan\n"
d = "1962 by Warner Bros. Inc.\n"

aa = open("C:/Users/lenovo/Desktop/Blowing in the wind.txt", "w")
aa.write(a)
aa.close()

aa = open("C:/Users/lenovo/Desktop/Blowing in the wind.txt", "r")
lines = aa.readlines()
lines.append(b)
lines.append(c)
lines.append(d)
aa.close()

bb = open("C:/Users/lenovo/Desktop/Blowing in the wind.txt", "w")
bb.write(lines[-3])
bb.write(lines[-2])
for i in range(len(lines)-3):
    bb.write(lines[i])
bb.write(lines[-1])
bb.close()

    