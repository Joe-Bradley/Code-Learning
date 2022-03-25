##############################相关分析##########################

##相关系数
iriscor <- cor(iris[-5])

##绘制相关系数矩阵
library(corrplot)
corrplot(iriscor)

#相关系数矩阵显著性检验
library(psych)
corr.test(iris[-5],adjust="none",use="complete")

##############################参数检验##########################
#单一样本 T 检验
##单样本 T 检验是检验一个样本平均数与一个已知的总体平均数的差异是否显著。
##样本总体服从正态分布。
##总体标准差未知且样本容量小于30。
t.test(w$weight,mu=65.6)

#两独立样本 T 检验
##两独立样本 T 检验是了解两个样本之间是否有显著差异存在。
##两个样本分别来自两个相互独立的正态总体。
x<-c(20.5, 19.8, 19.7, 20.4, 20.1, 20.0, 19.0, 19.9)
y<-c(20.7, 19.8, 19.5, 20.8, 20.4, 19.6, 20.2)
t.test(x, y, var.equal=TRUE)

#两配对样本 T 检验
##同一研究对象分别给予两种不同处理的效果比较，推断两种效果有无差别
##同一研究对象处理前后的效果比较，推断某种处理是否有效
t.test(x=w$weightbefore,y=w$weightafter,paired=TRUE)

#############################回归分析##########################

#一元线性回归(07-144)
x <- c(274,180,375,205,86,265,98,330,195,53,430,372,236,157,370)
y <- c(162,120,223,131,67,169,81,192,116,55,252,234,144,103,212)
A <- data.frame(x,y)
plot(A$x,A$y)
a <- lm(y~x+1)
summary(a)

confint(a, level=0.95)
op<-par(mfrow=c(2, 2))
plot(a)
par(op)

point<-data.frame(x=415)
lm.pred<-predict(a, point,interval="prediction",
                 level=0.95)
##Normal QQ-plot图中数据点分布趋于一条直线,说明残差是服从正态分布的
##拟合值^y对残差的图形, 数据点都基本均匀地分布在直线 y=0 的两侧,无明显趋势
##当x=415时,y的预测值为242.5781,预测区间为[227.1985,257.9577]

#多元线性回归
y<-c(162, 120, 223, 131, 67, 169, 81, 192, 116, 55, 252, 232, 144, 103, 212)
x1<-c(274, 180, 375, 205, 86, 265, 98, 330, 195, 53, 430, 372, 236, 157, 370)
x2<-c(2450, 3250, 3802, 2838, 2347, 3782, 3008, 2450, 2137, 2560, 4020, 4427,
      2660, 2088, 2605)
sales<-data.frame(y, x1, x2)
lm.reg<-lm(y~x1+x2, data=sales)
summary(lm.reg)
lm.step <- step(lm.reg)
summary(lm.step)

#############################聚类问题#############################
#找出一个较为优化的聚类个数K
library(cluster)
disease_input = as.data.frame(read.csv("cluster.csv"))
dis_data = as.matrix(disease_input[,c("incidence","deathrate","fatalityrate")])
wss <- numeric(10) 
for (k in 1:10) 
  wss[k] <- sum(kmeans(dis_data, centers=k, nstart=k)$withinss)
plot(1:10, wss, type="b", xlab="Number of Clusters", ylab="Within Sum of Squares")

#使用K等于4进行K均值聚类分析
km = kmeans(dis_data,4, nstart=4)
km
disease_input$cluster = factor(km$cluster)
disease_input

#散点图
library(ggplot2)
ggplot(data=disease_input, aes(x=incidence, y=fatalityrate, color=cluster )) + 
  geom_point() + geom_text(aes(label=disease), size=3,nudge_y=3)

############################回归问题##############################
#逻辑回归
data(iris)
n <- nrow(iris)
ntrain <- round(n*0.6)
set.seed(333)
tindex <- sample(n,ntrain) #随机抽样
train_iris <- iris[tindex,]
test_iris <- iris[-tindex,]
newcol <- data.frame(isVersicolor=(train_iris$Species=="versicolor"))
train_iris <- cbind(train_iris,newcol)
head(train_iris)

glm1 <- glm(isVersicolor ~ Sepal.Width,data=train_iris,family=binomial)
summary(glm1)

#############################关联规则挖掘#########################

