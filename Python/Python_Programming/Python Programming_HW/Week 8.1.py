# -*- coding: utf-8 -*-
"""
Created on Fri Apr 19 12:32:18 2019

@author: lenovo
"""

#a1 = ['Xiaoming', 'Ahua', 'Dazhuang', 'Damao', 'Xiaomao']
#a2 = ['88888', '5555555', '11111', '1234321', '1212121']
#a_dict = dict(zip(a1,a2))
#n = int(input())

def gdict():
    a1 = []
    a2 = []
    n = int(input())
    for i in range(n):
        line = input().split()
        a1.append(line[0])
        a2.append(line[1])
    return dict(zip(a1,a2))

def find_QQ():
    a_dict = gdict()
    x = input("Please enter the name:")
    for i in range(3):
        if x in a_dict.keys():
            print("The QQnumber of {} is: {}".format(x, a_dict[x]))
            break
        else:
            if i < 2:
                x = input("Please enter the name again:")
            if i == 2:
                print("Bye!")

if __name__ == '__main__':
    find_QQ()
