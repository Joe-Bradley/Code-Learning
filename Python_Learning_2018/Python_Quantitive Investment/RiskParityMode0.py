import pandas as pd
import numpy as np
import math
import matplotlib as plt

data = pd.ExcelFile("C:/Users\lenovo\Desktop\需要用到的数据.xlsx")
data = data.parse('Sheet1')
a = data['中债信用债总指数']
data['return']=(a.shift(-1)-a)/a
data['exReturn']=data['return']-0.04/252
sharperatio=math.sqrt(252)*data['exReturn'].mean()/data['exReturn'].std()
print('xiapulvwei： ', sharperatio)
a.plot()
plt.show()
def MaxDrawdown(return_list):
    '''最大回撤率'''
    i = np.argmax((np.maximum.accumulate(return_list) - return_list) / np.maximum.accumulate(return_list))  # 结束位置
    if i == 0:
        return 0
    j = np.argmax(return_list[:i])  # 开始位置
    return (return_list[j] - return_list[i]) / (return_list[j])
return_list=data['中债信用债总指数']
print (MaxDrawdown(data['中债信用债总指数']))