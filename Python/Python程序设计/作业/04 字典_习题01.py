#对于几个公司的财经数据，如何构造公司代码和股票价格的字典? 
pList = [('AXP', 'American Express Company', '78.51'), ('BA', 'The Boeing Company', '184.76'),('CAT', 'Caterpillar Inc.', '96.39'), ('CSCO', 'Cisco Systems,Inc.', '33.71'), ('CVX', 'Chevron Corporation', '106.09')]
a = []
b = []
for i in range(0, len(pList)-1):
	aa = pList[i][0]
	bb = pList[i][2]
	a.append(aa)
	b.append(bb)
p = dict(zip(a,b))

