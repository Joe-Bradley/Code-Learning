#导入数据
loandata <-read.csv('C:\\Users\\lenovo\\Desktop\\prosperLoanData.csv',stringsAsFactors =FALSE,na.strings =c(""))

#QQ 图经验判断
weight <- c(75.0,64.0,47.4,66.9,62.2,62.2,58.7,63.5,66.6,64.0,57.0,69.0,56.9,50.0,72.0)
qqnorm(weight)
qqline(weight)

#正态性 W 检验方法
#Shapiro-Wilk(夏皮罗-威尔克)W统计量
#函数shapiro.test()提供W统计量和相应的p值，当p值小于某个显
#著性水平（例如0.05），则认为样本不是来自正态分布的总体，否则承认样本来自正态分布的总体。
weight <-c(75.0,64.0,47.4,66.9,62.2,62.2,58.7,63.5,66.6,64.0,57.0,69.0,56.9,50.0,72.0)
shapiro.test(weight)