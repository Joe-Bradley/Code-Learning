# 使用以下语句存储一个字符串:mark = 'My GPA is: 3.5.'，从字符串mark中提取出GPA的值(3.5)，结果为 浮点类型。
mark = 'my gpa is:3.5.'
mark = mark.split(':')[1]
mark = float(mark[:-1])
print(mark)
