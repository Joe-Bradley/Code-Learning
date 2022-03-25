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

#借款人地址的分布
ggplot(data = loandata,aes(BorrowerState)) +
geom_bar(color=I('black'),fill = I('#FFCC22')) +
theme(axis.text.x = element_text(angle = 90))

#借款人收入分布
m <- c("Not displayed","Not employed","$0", "$1-24,999", "$25,000-49,999", "$50,000-74,999", "75,000-99,999","$100,000+")
loandata$IncomeRange<-ordered(loandata$IncomeRange,levels = m)
ggplot(data = loandata,aes(IncomeRange)) + 
geom_bar(color = I('black'),fill = I('#FF77FF'))

#借款人的职业
ggplot(data=loandata,aes(Occupation)) +
geom_bar(color=I('black'),fill=I('#099DD9'))+ 
theme(axis.text.x = element_text(angle = 90, vjust = 0.5, hjust=1))

#借款人债务收入比
ggplot(data = loandata,aes(DebtToIncomeRatio)) +
geom_histogram(color=I('black'),fill=I('#FFDDAA')) + xlim(0,1)

# 对信用卡使用程度进行衡量
loandata$BankCardUse[loandata$BankcardUtilization<quantile(loandata$BankcardUtilization,probs = 0.25,"na.rm" = TRUE)] <- "Mild Use"
loandata$BankCardUse[loandata$BankcardUtilization>=quantile(loandata$BankcardUtilization,probs = 0.25,'na.rm'=TRUE)&(loandata$BankcardUtilization < quantile(loandata$BankcardUtilization,probs =0.5,'na.rm'=TRUE))] <- "Medium Use"
loandata$BankCardUse[loandata$BankcardUtilization>=quantile(loandata$BankcardUtilization,probs = 0.5 ,'na.rm'=TRUE)&(loandata$BankcardUtilization<1)] <- "HeavyUse"
loandata$BankCardUse[loandata$BankcardUtilization>=1] <- "Super Use"
loandata$BankCardUse <- factor(loandata$BankCardUse,levels=c("MildUse","Medium Use","Heavy Use","Super Use"))
ggplot(aes(BankCardUse),data = subset(loandata,!is.na(BankcardUtilization))) +
geom_bar(color = I('black'),fill = I('#FFBB66'))

#客户信用等级
 #日期字符转换
loandata$LoanOriginationDate <- as.Date(loandata$LoanOriginationDate)
loandata$ListingCreationDate <- as.Date(loandata$ListingCreationDate)
loandata$DateCreditPulled <- as.Date(loandata$DateCreditPulled)
 # 对客户的消费信用评级 , 数据中有高低范围 , 将这两个数值取平均值做计算
loandata$CreditScore <- (loandata$CreditScoreRangeLower+loandata$CreditScoreRangeUpper)/2

 #将两个衡量信用等级的数据转换
 #这里的数据来自 2009 年 7 月 1 日之前
loandata$CreditGrade <-
ordered(loandata$CreditGrade,levels = c("NC","HR","E","D","C","B","A","AA"))
 #2009 年 7 月 1 日之后
loandata$ProsperRating..Alpha.<-
ordered(loandata$ProsperRating..Alpha.,levels = c("HR","E","D","C","B","A","AA"))
 #因为 2009 年 7 月 1 日是一个数据截点，因此将数据分成两段处理
loandata$Phase[loandata$LoanOriginationDate > "2009-07-01"] <- "After 2009"
loandata$Phase[loandata$LoanOriginationDate < "2009-07-01"] <- "Before 2009"
 #对之前未在 prosper 的客户建立库 ( 数据解释 :0 或 NA 是未使用过 prosper 的客户 , 反之是使用过的 )
loandata$Customer_clarify[loandata$TotalProsperLoans > 0] <- "Previous Borrower"
loandata$Customer_clarify[loandata$TotalProsperLoans == 0] <- "New Borrower"
loandata <- replace_na(loandata,replace = list(Customer_clarify = "New Borrower"))
loandata$Customer_clarify <- factor(loandata$Customer_clarify)

q1 <- ggplot(data=loandata, aes(CreditScore)) +
geom_bar(color=I('black'),fill=I('#00AA55'))+ 
xlim(400,800) +
ggtitle('consumer creditrating')

q2 <- ggplot(data = subset(loandata,LoanOriginationDate < "2009-07-01"), aes(CreditGrade)) + 
geom_bar(color=I('black'),fill=I('orange')) +
scale_x_discrete(limits = c("HR","E","D","C","B","A","AA")) + 
ggtitle('CreditScore before 2009')

q3 <- ggplot(data = subset(loandata,LoanOriginationDate > "2009-07-01"),aes(ProsperRating..Alpha.)) + 
geom_bar(color=I('black'),fill=I('#099DD9')) +
scale_x_discrete(limits = c("HR","E","D","C","B","A","AA")) + 
ggtitle('CreditScore after2009')
grid.arrange(q1,q2,q3)

#借款人过去7年的违约次数
ggplot(aes(x = DelinquenciesLast7Years),data = loandata) + geom_density(aes(fill = I('#EEFFBB'))) + 
scale_x_continuous(limits = c(-1,quantile(loandata$DelinquenciesLast7Years,probs = 0.95,na.rm = TRUE)))
summary(loandata$DelinquenciesLast7Years)

