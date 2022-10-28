#2.1 编写程序，输出一个9位的长整数，将其分解为三个三位的基本整数并输出，其中个、十、百位为一个整数，千、万、十万位为一个整数，百万、千万、亿位为一个整数。例如123456789分解成123、456、789。三个整数分行输出。
a = eval(input("请输入一个九位数的数字："))
b = a//1000000
c = a//1000%1000
d = a%1000
print(b)
print(c)
print(d)

#2.2 编写程序，从键盘输入一个4位正整数，输出该数的反序数。反序数即原数各位上的数字颠倒次序形成的另一个整数，如1234的反序数是4321，2468的反序数是8642。需整型输出。
a = eval(input("请输入一个四位数的数字："))
b = a//1000 + a//100%10*10 +  a//10%10*100 + a%10*1000
print(b)

#2.3 编写程序，从键盘输入分钟数（例如1000000），输出这些分钟代表多少年零多少天零多少小时零多少分钟。为了简化问题，假设一年有365天。输出格式为：xxyears xxdays xxhours xxmins
a = eval(input("请输入一个分钟数："))
b = a//(365*60*24)
c = a%(365*60*24)//(60*24)
d = a%(365*60*24)%(60*24)//60
e = a%(365*60*24)%(60*24)%60
print(b,"years"," ",c,"days"," ",d,"hours"," ",e,"mins",sep = "")

#2.4 编写程序，输入水的质量以及水的初始温度和最终温度，计算并输出将水从初始温度加热到最终温度所需的能量。 计算能量的公式为： Q=M(最终温度-初始温度)4184 其中M是以千克为单位的水的质量，温度以摄氏度为单位，能量以焦耳为单位。
x = input().split()
a = float(x[0])
b = float(x[1])
c = float(x[2])
d = a*(c-b)*4184
print(d)

#3.1 给出一个字符串，字符串中可能包含'A'-'Z','a'-'z',' '(空格)等字符。输出字母a（包括大小写）出现的次数。
a = input()
n = a.count('a')
print(n)

#3.2 编写程序，将给定的字符串序列，按照字符ASCII码顺序从小到大排序后输出。
a = input()
a = list(a)
a = sorted(a)
a = "".join(a)
print(a)

#3.3 小张举办生日宴会，请帮助小张编写一段程序，由外部输入所有出席宴会的好友的姓名包括小王、小李、小赵、小钱等，并将姓名存到一个列表中。宴会结束后，如果想知道小王是第几个到达宴会的客人，请输出该数字。
a = input().split(',')
for i in range(0,len(a)):
	if a[i] == "xiaozhang":
		print(i+1)
		break

#3.4 列表中存放了n个整数，分别表示n个评委的评分，请编写程序，去掉其中的最高分和最低分，求剩下n-2个分数的平均值(保留两位小数)。
s = list(eval(input()))
s.sort()
s.pop(0)
s.pop(-1)
avg = sum(s)/len(s)
print("%.2f" % avg)

#3.5 列表中存放了某次考试学生的考试成绩，请编写程序分别求出不及格学生和甲等（大于85）学生的平均成绩。（数据中肯定存在各一名成绩为85和60的学生，结果分行输出且保留两位小数）
s = list(eval(input()))
a = 0
b = 0
m = 0
n = 0
for i in range(0,len(s)):
	if s[i] < 60:
		a = a + s[i]
		m = m +1
	if s[i] > 85:
		b = b + s[i]
		n = n+1
avg1 = a/m
avg2 = b/n
print("%.2f" % avg1)
print("%.2f" % avg2)

#3.6 请写出可生成以下4个数列的range()函数，以列表形式分行输出 输入 输出 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] [2, 4, 6, 8, 10, 12, 14, 16, 18] [0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50] [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
a = list(range(1,11))
b = list(range(2,19,2))
c = list(range(0,51,5))
d = list(range(1,11))
d.reverse()
print(a,"\n",b,"\n",c,"\n",d,sep = "")

#4.1 题目描述 自行建立一个月份与天数的字典monthdays，月为‘Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Thi',对应的天数为31，28，31，30，31，30，31，31，30，31，40。 按顺序完成以下问题： 
#（1）创建一个新的字典x = {'Nov':30,'Dec':31}，并将其包含的键值对追加到字典monthdays里。 
#（2）删除键为’Thi’的键值对。
#（3）按照ASCII码顺序，输出字典monthdays的键序列。
#（4）按大小排序显示字典monthdays的值序列。（从小到大） 
#（5）按照字典的键排序，显示字典monthdays的键值对序列。 
#（6）获取键‘Mar'对应的值。 
#（7）获取键’Abc'对应的值，没有则显示'No Found!'。 
#（8）修改键‘Feb'的值为29，并输出该值。
a = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Thi']
b = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 40]
aa = dict(zip(a,b))
x = {'Nov':30, 'Dec':31}
aa.update(x)
aa.pop('Thi')
b = list(aa.keys())
b.sort()
c = list(aa.values())
c.sort()
d =sorted(aa.items(), key = lambda d:d[0])
e = aa['Mar']
f = aa.get('Abc')
aa['Feb'] = 29
print(b)
print(c)
print(d)
print(e)
print(f)
print(aa['Feb'])

#4.2 题目描述 自行创建字典储存国家与首都对，如下（可增加不可删减）： 国家名 首都 China Beijing America Washington Japan Tokyo Canada Ottawa Thailand Bangkok Norway Oslo Germany Berlin France Paris 编写程序输入一个国家名后，显示该国家的首都，首都首字母需大写。 输入 China 输出 Beijing
a = ['China', 'America', 'Japan', 'Canada', 'Thailand', 'Norway', 'Germany', 'France']
b = ['Beijing', 'Washington', 'Tokyo', 'Ottawa', 'Bangkok', 'Oslo', 'Berlin', 'Paris']
aa = dict(zip(a,b))
m = str(input())
c = aa[m]
print(c)

#4.3 题目描述 设有集合A和B: A={'red','blue','yellow','green','white','black'} B={'green','purple','yellow','pink'} 求这两个集合的并集、差集（两种情况都要输出，先A-B）、交集和对称差分，并按ASCII码顺序，分行输出。 输入输出 ['black', 'blue', 'green', 'pink', 'purple', 'red', 'white', 'yellow'] ['black', 'blue', 'red', 'white'] ['pink', 'purple'] ['green', 'yellow'] ['black', 'blue', 'pink', 'purple', 'red', 'white']
A = {'red', 'blue', 'yellow', 'green', 'white', 'black'}
B = {'green', 'purple', 'yellow', 'pink'}
A1 = sorted(list(A|B))
A2 = sorted(list(A - B))
A3 = sorted(list(B - A))
A4 = sorted(list(A & B))
A5 = sorted(list(A ^ B))
print(A1, '\n', A2, '\n', A3, '\n', A4, '\n', A5, sep = '')

#4.4 题目描述 歌唱比赛进行海选活动，歌手分为两组，按序号进行投票，第一组歌手的编号为1、2、3、4、5，第二组歌手的编号为6、7、8、9、10，投票编号为4、7、9、1、2、2、6、2、2、1、6、9、7、4、5、5、7、9、5、5、4（前3组数据请自行构建），请对投票数据进行分析，完成以下问题(全部以字符形式输出，并且先进行输入)： (1)求获得了选票的全部歌手的序号，按字典序输出； (2)求第一组获得选票的歌手的序号，按字典序输出； (3)求第二组没有获得选票的歌手，按字典序输出； (4)对任意给定的歌手编号，判断其是否获得投票，获得投票则输出'Y'，没有获得则输出'N'。输入 2 输出 ['1', '2', '4', '5', '6', '7', '9'] ['1', '2', '4', '5'] ['10','8'] Y
m = str(input())
a = ['1','2','3','4','5']
b = ['6','7','8','9','10']
c = ['4','7','9','1','2','2','6','2','2','1','6','9','7','4','5','5','7','9','5','5','4']
aa, bb, dd = [], [], []
for i in range(0,5):
	if a[i] in c:
		aa.append(a[i])
	if b[i] in c:
		bb.append(b[i])
	if b[i] not in c:
		dd.append(b[i])
dd.reverse() 
print(aa + bb)
print(aa)
print(dd)
if m in c:
	print("Y")
else:
	print("N")

#4.5 题目描述BMI是世界公认的⼀一种评定肥胖程度的分级方法，世界卫生组织(WHO)也以BMI来对肥胖或超重进⾏定义。它的定义如下: 体质指数(BMI)=体重(kg)÷身⾼(m)^2 当BMI大于等于18.5小于等于23.9时属正常。请输⼊入你或同伴的体重和身高计算BMI值，并输出胖瘦判断的结果。大于23.9输出fat，小于等于23.9大于等于18.5输出normal，小于18.5输出slim输入 70 1.75 输出 normal
a = input().split()
b = float(a[0])
c = float(a[1])
d = b / pow(c,2)
if d >= 18.5 and d <=23.9:
	print("normal")
elif d < 18.5:
	print("slim")
else:
	print("fat")

#4.6 题目描述 编写⼀个程序输入美元转换为人民币的汇率，表示转换方式的数字（0表示将美元转换为人民币；1表示将人民币转换为美元；其他数字则直接输出“Incorrect Input”），以及需要转换的金钱数值，最后将用户输入的美元数或⼈民币数分别转换为⼈民币或美元 (保留一位小数) 输出形式如下： 100.0is681.0yuan681.0yuanis 100.0
a = input().split()
b = float(a[0])
c = int(a[1])
d = float(a[2])
if c == 0:
	e = round(b * d,1)
	d = round(d,1)
	print('$', d, ' ', 'is', ' ', e, ' ', 'yuan',sep = '')
elif c == 1:
	e = round(d / b,1)
	d = round(d,1)
	print(d, ' ', 'yuan is $', e, sep = '')
else:
	print("Incorrect Input")

#4.7 题目描述 输入一个测验成绩，根据下面的标准，输出他的评分成绩（A-F）。 A: 90–100 B: 80–89 C: 70–79 D: 60–69 F: <60输入 从标准输入流读入一个整数 输出 输出一个字符表示该成绩所属于的等级
a = int(input())
if a >=90 and a <=100:
	print("A")
elif a >=80 and a <= 89:
	print("B")
elif a >=70 and a <= 79:
	print("C")
elif a >=60 and a <= 69:
	print("D")
elif a < 60:
	print("F")

#4.8 题目描述 创建一个字典，键保存用户名'dazhuang'，密码为'233'，用户名和密码对不限于此，但必须包括上述键值对。设计一个登录检查程序，只有用户名和密码都正确的用户才能登录，登录成功则显示'Yes!’,登录失败则显示‘Wrong!' 输入 dazhuang,233 输出 Yes!
r = input().split(",")
d = str(r[0])
e = int(r[1])
a = ['aaa', 'bbb', 'ccc', 'ddd', 'eee', 'dazhuang']
b = [1, 2, 3, 4, 5, 233]
aa = dict(zip(a,b))
if d in a:  
	if aa[d] == e:
		print('Yes!')
	else:
		print('Wrong!')
else:
	print('Wrong!') 

#5.1 题目描述 利用公式C= 5/9×(F-32) 将华氏温度转换成摄氏温度，并产生一张华氏0～300度与对应的摄氏温度之间的对照表（每隔30度输出一次） 输入 无 输出 0 -300华氏度与其对应的摄氏度,一行输出一组华氏度与摄氏度, 华氏度在前,摄氏度在后, 每隔30度输出一次,小数点后保留6位.
for i in range(0,301,30):
	j = 5/9 * (i-32)
	print(i,"%.6f" % j)

#5.2 题目描述 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 输入 输入为一行字符 输出 输出统计各种种类字符的个数，第一行输出英文字母的个数，第二行输出空格的个数，第三行输出数字字符的个数，第四行输出其他字符的个数
a = input()
a1,a2,a3,a4 = 0,0,0,0
for i in range(0,len(a)):
	if a[i].isalpha() == True:
		a1 = a1 + 1
	elif a[i] == ' ':
		a2 = a2 + 1
	elif a[i].isnumeric() == True:
		a3 = a3 + 1
	else:
		a4 = a4 +1
print(a1, '\n', a2, '\n', a3, '\n', a4, sep = '')

#5.3 题目描述 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。 输入 输入是一行，有多个整数，每个整数之间用空格隔开。 输出 输出元素交换过的列表。
a = list(input().split())
b,c = 0,0
for i in range(0,len(a)):
	a[i] = int(a[i])
for i in range(0,len(a)):
	if a[i] == max(a):
		b = a[i]
		a[i] = a[0]
		a[0] = b
	if a[i] == min(a):
		c = a[i]
		a[i] = a[-1]
		a[-1] = c
print(a)

#5.4 题目描述 求s=a+aa+aaa+aaaa+aa...a的值，其中a（键盘输入）是一个数字，例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加也由键盘输入控制。 输入 输入（由系统自动完成不需要人工输入）为一行，有两个整数由一个空格隔开，前一个数字代表题目中的a，另一个数字代表有几个数相加。 输出 输出题目中S的值 a, n = [int(x) for x in input().split()]
a = input().split()
a1 = int(a[0])
a2 = int(a[1])
a3,a4 = 0,0
for i in range(0,a2):
	a3 = a3 + a1 * pow(10,i)
	a4 = a4 + a3
print(a4)

#5.5 题目描述 利用Python中的random模块生成1000个0到100之间的随机整数，并统计每个元素的出现次数。为了保持测试数据的一致性，代码中利用random模块生成1000个数据时需要像如下形式： import random random.seed(0) x=[random.randint(0,100) for i in range(1000)] 请在编写代码时按照上面的方式生成数据 输入 无 输出 输出每种元素的统计个数，每行一个按照元素从小到大的顺序从上到下输出，中间用一个空格隔开。输出格式（非内容）如下： 0 3 1 5 ... 表示元素0出现3次，1出现5次等等。
import random 
random.seed(0) 
x=[random.randint(0,100) for i in range(1000)] 
x.sort()
for i in range(0,101):
	if i in x:
		n = 0
		for j in range(0,1000):
			if i == x[j]:
				n = n + 1
		print(i,n)
	else:
		print(i,0)

#5.6 题目描述 要求输出国际象棋棋盘。国际象棋（chess）棋盘为正方形，有64个黑白（深色与浅色）相同的格子组成；如下图：输入 无 输出 输出国际象棋棋盘，白色方格用空格代替，黑色方格用字符 * 代替。
for i in range(0,8):
	for j in range(0,8):
		if (i + j) % 2 == 0:
			print(' ',sep='',end='')
		else:
			print('*',sep='',end='')
	print('\n',sep = '',end = '')

#5.7 题目描述按递增顺序依次列出所有分母为40，分子小于40的最简分数。 输入 输出分数之间用逗号分开(含最末逗号) 
for i in range(1,40):
	for j in range(2,40):
		if 40 % j == 0 and i % j == 0:
			a = 0
		else:
			print(i,'/','40',',',sep = '', end = '')
			break

#6.1 题目描述素数有很多神奇的性质，所以很美。我们知道一个日期将年、月、日按顺序连接在一起可以组成一个八位数，例如2011年3月6日可以写成20110306。我的某个MM的生日组成的数是一个素数。偶尔我叫她素MM，没人知道是啥意思，她自己也不知道。O(∩_∩)O哈哈~我心里可是真的美美的(⊙o⊙)哦！ 嗯，什么？你的生日也是素数？你也想做“素MM”或者“素GG”？那好吧，不过我可是很小气的哦！只有你出生在1988年或者1989年我才让你做“素MM”或“素GG”。要不然，你把这两年里日期组成的数是素数的找出来也可以. 输入无 输出1988年与1989年，这两年里的日期所组成的素数。每个素数占一行（用换行符输出，最后一行不需要退格处理）。
from math import sqrt
def isprime(x):
    if x == 1:
        return False
    k = int(sqrt(x))
    for j in range(2,k+1):
        if x%j == 0:
            return False
    return True
for i in range(1988,1990):
    for j in range(1,13):
        for m in range(1,32):
            ii = str(i)
            if j < 10:
                jj = '0' + str(j)
            if j >= 10:
                jj = str(j)
            if m < 10:
                mm = '0' + str(m)
            if m >= 10:
                mm = str(m)
            if j in (1,3,5,7,8,10,12):
                aa = int(ii + jj + mm )
                if isprime(aa):
                    print(aa)
            elif j in (4,6,9,11):
                if m > 30:
                    break
                aa = int(ii + jj + mm )
                if isprime(aa):
                    print(aa)
            elif j == 2:
                if m > 29:
                    break
                aa = int(ii + jj + mm )
                if isprime(aa):
                    print(aa)

#6.2 题目描述 输出所有的"水仙花数"。所谓"水仙花数"是指这样的一个三位数：其各位数字的立方和等于该数本身。例如：371是一个"水仙花数"，371=33+73+13. 输入 无 输出 输出所有的水仙花数，每行一个（注意输出格式！）
def isdaffodil(x):
    if x < 99 or x > 999:
        return False
    x1 = x // 100
    x2 = x //10 % 10
    x3 = x % 10
    if x ==  pow(x1,3) + pow(x2,3) + pow(x3,3):
        return True
    return False
a = 100 
for i in range(100,1000):
    if isdaffodil(i):
        print(i)

#6.3 题目描述 相传韩信将军才智过人，从不直接清点自己军队的人数，只要让士兵先后以三人一排，五人一排，七人一排的变换队形，而他每次只掠一眼队伍的排尾就知道总人数了。输入包含多组数据，每组数据包含三个非负整数a，b，c，表示每种队形排尾的人数（a<3,b<5,c<7），输出总人数的最小值（或者报告无解）。已知总人数不小于10，不超过100。 输入 输入包含多组数据，每组一行三个整数a，b，c 输出 输出每行对应的总人数的最小值，若无解则输出“No answer”
def hanxin(a):
    flag = True
    for i in range(10,101):
        if i % 3 == a[0]:
            if i % 5 == a[1]:
                if i % 7 == a[2]:
                    flag = False
                    break
    if flag:
        return "No answer"
    else:
        return i

while True:
    s = input()
    if s == '':
       break
    a = [int(x) for x in s.split()]
    print(hanxin(a))

#6.4 题目描述 采用递推法计算sinx幂级数展开式的近似值，当通项绝对值小于10-8时停止累加，保留1位小数。 sinx=x/1-x3/3!+x5/5!-x7/7!…输入 在程序中用x = float(input())表示输入，x由系统自动输入（无需人工输入）
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n*factorial(n-1)
x = float(input())
s = 0
j = 0
i = 1
while abs(pow(x,i)/ factorial(i) * pow(-1,j)) > 1e-8 :
    s = s + pow(x,i)/ factorial(i) * pow(-1,j)
    i = i + 2
    j = j + 1
print("%.1f" % s)

#6.5 题目描述 输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。 输入 首先输入一个整数代表有多少组，每组占一行，每行有若干个整数用空格彼此隔开 输出 对于每个每行的测试实例，输出排序后的结果，两个数之间用一个空格隔开（注意每行最后一个数的结尾也有空格）。每个测试实例占一行
n=int(input())
for i in range(n):
    s = input()
    a = [int(x) for x in s.split()]
    a = sorted(a, key=abs, reverse = True)   
    for j in range(len(a)):
        if j < len(a)-1:
            print(a[j],' ',sep = '',end = '')
        if j == len(a)-1:
            print(a[j],' ',sep = '')
#6.6 题目描述 求矩阵的两对角线上的元素之和 输入 矩阵的行数N 和一个N*N的整数矩阵a[N]N 输出 所输矩阵的两对角线上的元素之和
import numpy as np
n = int(input())
aa = []
s2,s1,j = 0,0,n-1
for i in range(n):
    s = input()
    a = [int(x) for x in s.split()]
    aa.append(a)
m1 = np.matrix(aa)
if n % 2 == 0:
    for i in range(n):
        s1 = s1 + m1[i,i]
        s2 = s2 + m1[i,j]
        j = j - 1
    print(s1+s2)
if n % 2 == 1:
    for i in range(n):
        s1 = s1 + m1[i,i]
        s2 = s2 + m1[i,j]
        j = j - 1
    print(s1+s2-m1[n//2,n//2])

#6.7 题目描述 从键盘输入一个英文句子，除单词和空白字符（包括空格和换行符等）外句子中只包含“,“、”.”、“ ' ”、“ " ”和“!”几个标点符号，统计句子中包括的每个单词（将句中大写全部转换成小写）的词频并将结果保存在字典中，先按词频从小到到输出，再按键进行排序。 输入 This is a sentence a. 输出 is 1 sentence 1 this 1 a 2
str0=input()
dict1={}
str0=str0.lower()
aremove=[',','.','\'','\"','!']
for dele in aremove:
    str0=str0.replace(dele,'')
    str1=str0.split(' ')
for i in range(0,len(str1)):
    b=1
    if str1[i] in dict1:
        dict1[str1[i]]=dict1[str1[i]]+1
    else:
        dict1[str1[i]]=b
dict1=sorted(dict1.items(),key=lambda x:(x[1],x[0]))
for i in range(len(dict1)):
    print(dict1[i][0]," ",dict1[i][1],sep = "")

#7.1 题目描述字符串有一个 isidentifier ()方法，功能是用来判断给定的字符串是否为合法的标识符，请自行实现此方法的相似功能， 定义一个函数 CheckId()， 函数从__main__模块中接收参数 s， 判断 s 是否为合法标识符， 输出判断结果的信息：
#（1）合法： 输出'Valid identifier.';
#（2）首字母不合法： 输出'Error. First char must be alphas or _.';
#（3）首字母合法其他字符不合法： 输出'Error. Other chars must be alphas number or _.'。
#输入一个字符串。输出判断结果信息。
def CheckId(x):
    if x[0] != '_' and x[0].isalpha() == 0:
        print("Error. First char must be alphas or _.")
    else:
        flag = True
        for i in range(1,len(x)):
            if x[i].isalpha() == 0 and x[i] != '_' and x[i].isdigit() == 0:
                 flag = False
        if flag == True:
            print("Valid identifier.")
        else:
            print('Error. Other chars must be alphas number or _.')
if __name__ == "__main__":
    CheckId(input())

#7.3 题目描述:有一个咖啡列表， 列表中每一个元素都是由咖啡名称（由连续的英文字符构成）、 价格和一些其他非字母字符组成，编写一个函数 clean_list()处理此咖啡列表， 处理后列表中只含咖啡名称， 并将此列表返回。 主模块中输入一个咖啡列表（由oj自动输入）， 调用 clean_list()函数获得处理后的咖啡列表， 并给咖啡名称进行编号（从1开始编号），输入想选择的咖啡编号，输出咖啡名称。 输入['32Cappuccino/', '#_Americano30', '/34Latte', '#Mocha35'] 2 输出Americano提示主模块中输入咖啡列表的语句可用coffee_list = eval(input())

#过滤字符串中的英文与符号，保留汉字
"""import re
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

#7.4 题目描述:验证哥德巴赫猜想之一：2000以内（包含2000）的正偶数（大于等于4）都能够分解为两个质数之和。如成立，将每个偶数表达成形如：4=2+2的形式，输出第一组即可。不成立则输出不成立的值，并输出N.
from math import sqrt
def isprime(x):
    if x == 1:
        return False
    for i in range(2,int(sqrt(x))+1):
            if x % i == 0:
                return False
    return True
for m in range(3,2001):
    if m%2 == 0:
        for i in range(2,m):
            j = m-i
            if isprime(j) and isprime(i):
                break
        print(m,'=',i,'+',j,sep = '')

#7.5 题目描述:对于两个不同的整数A和B，如果整数A的全部因子（包括1，不包括A本身）之和等于B；且整数B的全部因子（包括1，不包括B本身）之和等于A，则将A和B称为特殊数。自定义函数fac(x)计算x包括1但不包括本身的所有因子和并返回。从键盘输入整数n，调用fac()函数寻找n以内的特殊数并输出。注意每个特殊数对只输出一次，小的在前大的在后，例如220-284。输入500输出220-284
def fac(x):
    s=0
    for i in range(1,x):
        if x%i == 0:
            s = s + i
    return s
gg = int(input())
m = []
for i in range(2,gg + 1):
    j = fac(i)
    if i == fac(j) and i!=j :
        if i not in m  and j not in m:
            if i > j:
                i,j = j,i
            print("{}-{}".format(i,j))
        m.append(i)
        m.append(j)
#7.6 题目描述
如果一个n（n<=9）位数刚好包含了1至n中所有数字各一次则称它们是全数字（pandigital）的，例如四位数1324就是1至4全数字的。从键盘上输入一组（不止一个）整数，输出其中的全数字，若找不到则输出“not found”。
def pandigital(a):
    x = []
    for i in a:
        flag = True
        m = list(str(i))
        n = len(m)
        for j in range(1,n+1):
            p = str(j)
            if p not in m:
                flag = False
        if flag == True:
            x.append(i)
    if x == []:
        print("not found")
    else:
        for i in range(len(x)):
            print(x[i])

if __name__ == "__main__":
    a = eval(input())
    pandigital(a)

#8.1
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

#8.2
#s.isalnum()  所有字符都是数字或者字母
#s.isalpha()  所有字符都是字母
#s.isdigit()  所有字符都是数字
#s.islower()  所有字符都是小写
#s.isupper()  所有字符都是大写
#s.istitle()  所有单词都是首字母大写，像标题
#s.isspace()  所有字符都是空白字符、\t、\n、\r 
from math import sqrt
def a(x):
    a = sqrt(x)
    b = x // int(a)
    if a == b:
        return True
    else:
        return False
def b(x):
    x = str(x)
    flag = True
    for i in range(len(x)//2 + 1):
        if x[i] != x[-i-1]:
            flag = False
            break
    if flag:
        return True
    else:
        return False
for x in range(1,1000000):
    if a(x) and b(x):
        print(x)

#8.3
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

#8.4 输出杨辉三角
#定义阶乘
def a(x):
    if x == 0:
        return 1
    else:
        return x*a(x-1)

#定义组合数
def b(x,y):
    return a(y)//(a(x)*a(y-x))
    
#定义杨辉三角    
def printytri(n):
    for i in range(n):
        for j in range(i+1):
            if j == i:
                print(b(j,i))
            else:
                print(b(j,i), end = ' ')
if __name__ == "__main__":
    n = int(input())
    printytri(n)

#8.5 按照矩阵行和排序 
#生成矩阵
def g(n):
    a = []
    print("Please enter row vectors:")
    for i in range(n):
        aa = input().split()
        for i in range(len(aa)):
            aa[i] = int(aa[i])
        a.append(aa)
    return a
#排序        
def line_sort(x):
    print("The result matrix is:")
    for i in range(len(x)):
        aa = sum(x[i])
        x[i].append(aa)
    x = sorted(x,key = lambda d : d[-1])
    for i in range(len(x)):
        for j in range(len(x[i])-1):
            if j == len(x[i])-2:
                print(x[i][j])
            else:
                print(x[i][j],end = ' ')

if __name__ == "__main__":
    n = int(input("Please enter the number of rows:"))
    c = g(n)
    line_sort(c)
