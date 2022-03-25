##################
n = ['a', 'b', 'c']
m = [1, 2, 3]
aa = {'a':1, 'b':2, 'c':3}
bb = dict([('a',1),('b',2),('c',3)])
cc = dict([['a',1],['b',2],['c',3]])
dd = dict((('a',1),('b',2),('c',3)))
ee = dict(a = 1, b = 2, c = 3)
ff = {}.fromkeys(('a', 'b', 'c'), 0)
gg = dict(zip(n,m))
##################

aa['a'] #search
aa['a'] = 9999 #Alter the element
aa['d'] = 4 #create new element
del aa['a'] #delete the element
aa.keys() #view the keys
aa.values() #view the values
aa.items() #view the items
aa.get('a') #get the keyword's value, if not print None
aa.pop('a') #delete the element
aa.clear() #delete the whole dict
aa.update(bb) #update the dict 取并集
aa.setdefault('a', 8000)

##################
aaa = {'a', 'c', 'b', 'd'}
a = ['a', 'b', 'c','d']
bbb = set(a)
ccc = set("hello")
ddd = frozenset("hello")
##################

'a' in aaa
'a' not in aaa
bbb == ccc
bbb != ccc
bbb < ccc #subset
bbb <= ccc 
bbb & ccc #交集
bbb | ccc #并集
bbb - ccc #差集
bbb ^ ccc #对称差
