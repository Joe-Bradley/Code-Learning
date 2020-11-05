# -*- coding: utf-8 -*-
"""
Created on Fri May  3 12:13:38 2019

@author: lenovo
"""
a_list = []
b_list = []
a = open("file1.txt")
a_word = a.read(1)
b_word = a.read(1)
a_list.append(a_word)
count = 1
while b_word:
    a_list.append(b_word)
    if a_word == b_word:
        a_list.pop(-1)
        count = count + 1 
        a_word = b_word
        b_word = a.read(1)
    else:
        b_list.append(count)
        count = 1
        a_word = b_word
        b_word = a.read(1)
b_list.append(count)
s = ''
for i in range(len(a_list)):
    s = s + a_list[i] + str(b_list[i])
print(s)
a.close()
    
        
    
    


        
            