#读取文件&清理文件
library(readr)
data <- read_csv("data.csv")
data <- data[,c(-1,-2,-9)]

#人气TOP10
library(ggplot2)
data1 <- data[order(-data$p_pc),]
p_pc <- data1$p_pc[seq(1,10)]
name <- factor(data1$name[seq(1,10)],levels=data1$name[seq(1,10)])
data1 <- data.frame(name,p_pc)
ggplot(data1,aes(y=p_pc,x=name)) + 
  geom_bar(stat="identity",fill="red", colour="black",width = 0.75) + 
  geom_text(aes(label=p_pc),vjust=-0.5,color='red') +
  labs(x = "name", y = "p_pc", title = "人气TOP10") +
  ylim(0,41) +
  theme(axis.text.x = element_text(size = 10,angle = 45,hjust = 1) )

#豆瓣评分TOP10
library(ggplot2)
data2 <- data[order(-data$rate),]
rate <- data2$rate[seq(1,10)]
name <- factor(data2$name[seq(1,10)],levels=data2$name[seq(1,10)])
data2 <- data.frame(name,rate)
ggplot(data2,aes(y=rate,x=name)) + 
  geom_bar(stat="identity",fill="red", colour="black",width = 0.75) + 
  geom_text(aes(label=rate),vjust=-0.5,color='red') +
  labs(x = "name", y = "rate", title = "豆瓣评分TOP10") +
  ylim(0,10) +
  theme(axis.text.x = element_text(size = 10,angle = 45,hjust = 1) )

#票房TOP10
library(ggplot2)
data3 <- data[order(-data$amount),]
amount <- data3$amount[seq(1,10)]
name <- factor(data3$name[seq(1,10)],levels=data3$name[seq(1,10)])
data3 <- data.frame(name,amount)
ggplot(data3,aes(y=amount,x=name)) + 
  geom_bar(stat="identity",fill="red", colour="black",width = 0.75) + 
  geom_text(aes(label=amount),vjust=-0.5,color='red',size = 3) +
  labs(x = "name", y = "amount", title = "票房TOP10") +
  ylim(0,400000) +
  theme(axis.text.x = element_text(size = 10,angle = 45,hjust = 1) )

#性价比TOP10
data4 <- data.frame(data$name)
colnames(data4) <- 'name'
data4$performance_1 <- round(data$rate/max(data$rate) * 50,1)
data4$performance_2 <- round(data$avg_price/min(data$avg_price) * 30,1)
data4$performance_3 <- round((mean(data$duration)-abs(data$duration-mean(data$duration)))/mean(data$duration) *20,1)
data4$total <- data4$performance_1+data4$performance_2+data4$performance_3
data4 <- data4[order(-data4$total),]
data4 <- data4[seq(1,9),]
data4$name <- factor(data4$name,levels = data4$name)
data4$name <- paste(as.numeric(data4$name),data4$name,sep = ' ')
name <- c(rep(as.vector(data4$name),times = 3))
Frequency <- c(as.vector(data4$performance_1),as.vector(data4$performance_2),as.vector(data4$performance_3))
Category<-c(rep(c("口碑", "价格", "时长"), each = 9))
data4 <- data.frame(name,Frequency,Category)

library(ggplot2)
ggplot(data4, aes(x=name,y=Frequency,fill=Category,label = Frequency)) +
  geom_bar(stat = "identity",colour="black",width = 0.75) +
  geom_text(size = 3, position = position_stack(vjust = 0.5))+
  theme(axis.text.x = element_text(size = 10,angle = 45,hjust = 1))+
  labs(x = "name", y = "performance", title = "性价比TOP10")

#累计票房统计
MovieMarket <- read.csv("MovieMarket.csv")
time <- seq(1:30)
data5_1 <- MovieMarket[which(MovieMarket$name=="影"),]$total[seq(1:30)]
data5_2 <- MovieMarket[which(MovieMarket$name=="毒液：致命守护者"),]$total[seq(1:30)]
data5_3 <- MovieMarket[which(MovieMarket$name=="无名之辈"),]$total[seq(1:30)]
data5_4 <- MovieMarket[which(MovieMarket$name=="找到你"),]$total[seq(1:30)]
data5_5 <- MovieMarket[which(MovieMarket$name=="嗝嗝老师"),]$total[seq(1:30)]
data5_6 <- MovieMarket[which(MovieMarket$name=="无双"),]$total[seq(1:30)]
data5_7 <- MovieMarket[which(MovieMarket$name=="海王"),]$total[seq(1:30)]
data5 <- data.frame(time,data5_1,data5_2,data5_3,data5_4,data5_5,data5_6,data5_7)
time <- c(rep(as.vector(data5$time),times = 7))
value <- c(as.vector(data5$data5_1),as.vector(data5$data5_2),as.vector(data5$data5_3),as.vector(data5$data5_4),as.vector(data5$data5_5),as.vector(data5$data5_6),as.vector(data5$data5_7))
Category<-c(rep(c("影", "毒液：致命守护者", "无名之辈","找到你","嗝嗝老师","无双","海王"), each = 30))
data5 <- data.frame(time,value,Category)

library(ggplot2)
ggplot() +
  geom_line(aes(y = value, x = time,colour = Category),data = data5,stat="identity", size=1.25) +
  labs(x = "time", y = "box", title = "累计票房（万元）")

#累计票房相关性分析
data6_1 <- MovieMarket[which(MovieMarket$name=="影"),][,c(-1,-2,-3,-8,-9,-10,-11)]

#相关系数
data6_1_cor <- cor(data6_1)

#绘制相关系数矩阵
library(corrplot)
corrplot(data6_1_cor)

#相关系数矩阵显著性检验
library(psych)
corr.test(data6_1,adjust="none",use="complete")

#多元线性回归
lm.reg<-lm(total~day_amount+list_day+avg_price, data=data6_1)
summary(lm.reg)
lm.step <- step(lm.reg)
summary(lm.step)
lm.reg<-lm(total~day_amount+list_day, data=data6_1)

#多元线性预测
exa<-data.frame(day_amount=50, list_day=35)
lm.pred<-predict(lm.reg, exa, interval="prediction", level=0.95)
lm.pred

#多元线性诊断
y.res<-residuals(lm.reg) # 计算残差
print(y.res)
y.rst<-rstandard(lm.reg) # 计算标准化残差
print(y.rst)
y.fit<-predict(lm.reg) # 计算预测值
op<-par(mfrow=c(1, 2)) # 将两张散残差点图一并输出
plot(y.res~y.fit)
plot(y.rst~y.fit)
par(op)
