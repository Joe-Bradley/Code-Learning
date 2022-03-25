# -*- coding: utf-8 -*-
"""
Created on Sat Apr 13 19:54:47 2019

@author: lenovo
"""
"""
题目描述
有一个咖啡列表， 列表中每一个元素都是由咖啡名称（由连续的英文字符构成）、 
价格和一些其他非字母字符组成，编写一个函数 clean_list()处理此咖啡列表， 
处理后列表中只含咖啡名称， 并将此列表返回。 主模块中输入一个咖啡列表（由oj自动输入）， 
调用 clean_list()函数获得处理后的咖啡列表， 并给咖啡名称进行编号（从1开始编号），
输入想选择的咖啡编号，输出咖啡名称。 
输入
['32Cappuccino/', '#_Americano30', '/34Latte', '#Mocha35'] 
2 
输出
Americano
提示
主模块中输入咖啡列表的语句可用coffee_list = eval(input())
"""
"""
过滤字符串中的英文与符号，保留汉字
import re
st = "hello,world!!%[545]你好234世界。。。"
ste = re.sub("[A-Za-z0-9\!\%\[\]\,\。]", "", st)
print(ste)

#从字符串中提取数字
totalCount = '100abc'
totalCount = re.sub("\D", "", totalCount) 
print(totalCount)

#从字符串中提取字母字符串
import re
st = "hello,world!!%[545]你好234世界。。。"
result = ''.join(re.findall(r'[A-Za-z]', st)) 
print(result)
--------------------- 
作者：luoganttcc 
来源：CSDN 
原文：https://blog.csdn.net/luoganttcc/article/details/80946194 
版权声明：本文为博主原创文章，转载请附上博文链接！
"""
def clean_list(x):
    a = []
    for i in x:
        a1 = []
        m = list(i)
        for j in m:
            if j.isalpha() == True:
                a1.append(j)
        a_str = ''.join(a1)
        a.append(a_str)
    c = int(input())
    print(a[c-1])
x = eval(input())
clean_list(x)