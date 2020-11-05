# -*- coding: utf-8 -*-
"""
Created on Tue May 14 17:37:27 2019

@author: lenovo
"""

class BMI(object):
    def __init__(self, w, h):
        self.w = w
        self.h = h
    def printBMI(self):
        a = self.w/self.h**2
        print("BIM = %.1f"%a)
        
if __name__ == "__main__":
    aa = BMI(1,2)
    aa.printBMI()