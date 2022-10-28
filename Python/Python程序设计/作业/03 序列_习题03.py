#给出一个字符串，不区分大小写，字符串中可能包含‘A’- ‘Z’,‘a’-‘z’,‘ ’(空格)等字符。输出字母a(包括大小写)出现的次数。测试数据:abc&ABC。
a = 'abc&ABC'
a = a.lower()
a = a.count("a")
print(a)
