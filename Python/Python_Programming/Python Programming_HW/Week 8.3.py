# -*- coding: utf-8 -*-
"""
Created on Fri Apr 19 18:45:25 2019

@author: lenovo
"""

for a1 in range(1,24):
    for a2 in range(1,24):
        for a3 in range(1,24):
            for a4 in range(1,24):
                if a1 + a2 + a3 + a4 == 23:
                    if a1 >= 1 and a1 <= 9:
                        if a2 >= 1 and a2 <= 8:
                            if a3 >= 1 and a3 <= 7:
                                if a4 >= 1 and a4 <= 6:
                                    print("甲:{}本 乙:{}本 丙:{}本 丁:{}本".format(a1,a2,a3,a4))
                    