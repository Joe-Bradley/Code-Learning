# -*- coding: utf-8 -*-
"""
Created on Fri Oct 26 22:29:28 2018

@author: lenovo
"""

import pandas as pd
import numpy as np
from math import sqrt
import scipy.optimize as spo

dt=pd.read_excel("C:/Users\lenovo\Desktop\price_data.xls")
dt=dt.drop(0)
dt.drop(['指标名称'],axis=1,inplace=True)

# 去掉原表中的空值
pd.isna(dt)
dt=dt.dropna(axis=0)

# 计算算术收益率
dt=dt.apply(lambda x:x.astype(float))
returns=(dt-dt.shift(1))/dt.shift(1)

# 求出协方差矩阵
pd.isna(returns)
returns=returns.dropna(axis=0)
X=returns.T
Y=np.cov(X)

def TRC(i,w):
    Z1=np.dot(Y,w)
    Z2=np.dot(w.T,Y)
    Z3=np.dot(Z2,w)
    return w[i-1]*Z1[i-1]/sqrt(Z3)

def u(w=np.array(11)):
    q=0
    for i in range(0,11):
        for j in range(0,11):
            q=q+(TRC(i,w)-TRC(j,w))*(TRC(i,w)-TRC(j,w))
    return q
cons = ({'type':'eq','fun':lambda w:1-sum(w)})
bnds = ((0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1),(0,1))
result = spo.minimize(u,[0.05,0,0.05,0.1,0.1,0.1,0.1,0.1,0.05,0.15,0,0],method = 'SLSQP',bounds=bnds,constraints=cons)
print(result)

