# -*- coding: utf-8 -*-
"""
Created on Thu May  2 10:32:17 2019

@author: lenovo
"""
#7.1 read & readline % readlines
#read: str; readline: str; readlines: list
#read(x) exactly x bytes
#readline(x) at most 1 line and x bytes; if line is null whatever x it returns null
#readlines(x) at least 1 line and x bytes

a1 = open("C:/Users/lenovo/Desktop/7_1.txt")
a1_1 = a1.read(1)
a1_2 = a1.read()
a1.close()

a1 = open("C:/Users/lenovo/Desktop/7_1.txt")
a1_3 = a1.readline(1)
a1_4 = a1.readline()
a1_5 = a1.readlines(1)
a1_6 = a1.readlines()
a1.close()

#7.2 eg_find_birth 
a2 = open("C:/Users/lenovo/Desktop/7_2.txt")
pi = a2.read()
if "0100" in pi:
    print("66666")
else:
    print("55555")
a1.close()

#7.3 write and writelines
#'w': clear before write sth, you cannot read
#'a': write sth after the end
#'r+': read and write
#you must write str into the txt file

a3 = open("C:/Users/lenovo/Desktop/7_3.txt","w")
a3.write("1\n")
a3.write("2\n")
a3.write("3\n")
a3.writelines(["11\n","22\n","33\n"])
a3.close()

a3 = open("C:/Users/lenovo/Desktop/7_3.txt","a")
a3.writelines(["111\n","222\n","333\n"])
a3.close()


#7.4 eg_add_serial_numbers
a4 = open("C:/Users/lenovo/Desktop/7_4.txt")
lines = a4.readlines()
a4.close()
for i in range(len(lines)):
    lines[i] = str(i+1) + ' ' + lines[i]
a4 = open("C:/Users/lenovo/Desktop/7_4.txt",'w')
a4.writelines(lines)
a4.close()

#7.5 seek and tell()
#a5.seek(x,y), default y=0, from y = [0,1,2], moveforward x bytes
#a5.tell(), return current location(int)
a5 = open("C:/Users/lenovo/Desktop/7_5.txt",'w')
a5.writelines(["123\n","456\n","789\n"])
a5.close()

a5 = open("C:/Users/lenovo/Desktop/7_5.txt","rb")
a5.seek(1,0)
a5.seek(2,1)
a5.seek(-15,2)
a5.tell()

#7.6 eg_add_serial_numbers
a6 = open("C:/Users/lenovo/Desktop/7_6.txt",'r+')
lines = a6.readlines()
for i in range(len(lines)):
    lines[i] = str(i+1) + ' ' + lines[i]
a6.seek(0)
a6.writelines(lines)
a6.close()








