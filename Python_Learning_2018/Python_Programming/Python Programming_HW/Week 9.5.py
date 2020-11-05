# -*- coding: utf-8 -*-
"""
Created on Fri May  3 12:53:19 2019

@author: lenovo
"""

a = open("subtitles.srt",encoding = "UTF-8")
b = open("subtitles_word.txt","w")
aa = a.readlines()
bb = [aa[i] for i in range(2,len(aa),4)]
for i in range(len(bb)):
    b.writelines(bb[i])
a.close()
b.close()
    