#导入数据
loandata <-read.csv('C:\\Users\\lenovo\\Desktop\\prosperLoanData.csv',stringsAsFactors =FALSE,na.strings =c(""))

#查看数据类型
str(loandata)

#所需 R 语言包导入：
library(ggplot2)
library(GGally)
library(scales)
library(memisc)
library(gridExtra)
library(tidyr)
library(mice)
library(dplyr)

#资金价格分布
ggplot(data=loandata,aes(BorrowerRate)) + 
geom_histogram(color = I('black'), fill = I('#99BBFF'))+ 
scale_x_continuous(breaks = seq(0,0.4,0.1))

#资金期限分布
loandata$Term <- factor(loandata$Term)
ggplot(aes(Term),data = loandata) + 
geom_bar(color=I('black'),fill = I('#56B4E9'))

#资金价格与期限的关系
ggplot(aes(x = Term,y = BorrowerRate),data = loandata) +
geom_boxplot() + 
stat_summary(fun.y = mean,geom = 'point',shape = 4)

#资金价格和客户月收入
ggplot(aes(StatedMonthlyIncome,BorrowerRate),data = subset(loandata,!is.na(StatedMonthlyIncome))) +
stat_density2d(aes(alpha = ..density..), geom = 'tile', contour = FALSE) +
scale_x_continuous(limits = c(0,30000))

#资金价格与消费信用评分的关系
ggplot(aes(CreditScore,BorrowerRate),data = loandata) +
geom_point() + 
facet_wrap(~Phase,ncol = 1) +
scale_x_continuous(limits=c(400,900)) + 
scale_y_continuous(limits=c(0.0,0.4)) +
geom_line(stat="summary", fun.y=mean) +
geom_line(stat="summary", fun.y=median,linetype=2,color="red")

#资金价格与信用评级的关系(以2009年7月1日为时间节点)
 #2009 年 7 月 1 日前 :
ggplot(aes(CreditGrade,BorrowerRate),data =subset(loandata,LoanOriginationDate <"2009-07-01")) +
scale_x_discrete(limits = c("HR","E","D","C","B","A","AA")) +
geom_boxplot() +
stat_summary(fun.y = mean,geom = 'point',shape = 4) +
stat_summary(funy = mean,geom = 'smooth',aes(group = 1))

 #2009 年 7 月一日后 :
ggplot(aes(ProsperRating..Alpha.,BorrowerRate),data = subset(loandata,LoanOriginationDate >= "2009-07-01")) +
scale_x_discrete(limits = c("HR","E","D","C","B","A","AA")) +
geom_boxplot() +
stat_summary(fun.y = mean,geom = 'point',shape = 4) +
stat_summary(fun.y = mean,geom = 'smooth',aes(group = 1))
