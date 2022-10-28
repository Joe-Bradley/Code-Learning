#loop & range(101),range(1,101),range(1,101,1) 都表示1到100的值
a = 0
for i in range(1,100):
	a = a+i
print(i)

#循环里面可以用列表代替range
num = [1,2,3,4,5]
a = int(input('number=:'))
for number in num:
	a = a * number
print(a)

#python 彩蛋
import this

#假的人工智能
while True:
	print(input().strip('吗？')+'！')

#左闭右开
a = [1,'a',88]
print(a[2])

#字符串，元组，range() 不可变
#列表	可变
y=1900
print(y%400==0 or (y%4==0 and y%100!=0))

#取数字
a=123
b=a//100+(a%100)//10*10+a%10*100
c=1234
d=c//1000+c%100//10*10+c%10
print(b)
