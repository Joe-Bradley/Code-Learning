# -*- coding: utf-8 -*-
"""
Created on Fri May  3 11:27:37 2019

@author: lenovo
"""
#Trans decimalism into hex
def a(x):
    aa = '0123456789ABCDEF'
    if x >= 16:
        a(x//16)
    print(aa[x%16],end = "")
if __name__ == "__main__":
    aa = int(input("Please enter a number:"))
    a(aa)
    