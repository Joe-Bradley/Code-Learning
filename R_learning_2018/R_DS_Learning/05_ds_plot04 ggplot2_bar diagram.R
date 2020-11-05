#Stat identity 对数据不进行统计变化
sp <- ggplot(pg_mean, aes(x=group, y=weight)) 
sp + geom_bar(stat="identity", fill="lightblue",colour="black")

#width 调整条形图的宽
sp <- ggplot(cabbage_exp, aes(x=Date, y=Weight, fill=Cultivar))
sp + geom_bar(stat="identity", width=0.5)

#position=position_dodge()调整条形图相对位置
sp <- ggplot(cabbage_exp, aes(x=Date, y=Weight, fill=Cultivar))
sp + geom_bar(stat="identity", width=0.5, position=position_dodge(0.7))
sp + geom_bar(stat="identity", width=0.5, position=position_dodge(0.3))

#Geom_text()添加数据标签
sp <- ggplot(cabbage_exp, aes(x=interaction(Date, Cultivar), y=Weight))
sp + geom_bar(stat="identity") + geom_text(aes(label=Weight),vjust=1.5,colour="white")
sp + geom_bar(stat="identity") + geom_text(aes(label=Weight), vjust=-0.5)

#直方图默认最大为 30 组，可以使用 binwidth 来改变
sp <- ggplot(faithful, aes(x=waiting))
sp + geom_histogram(fill="white",colour="black")
sp + geom_histogram(binwidth=8,fill="white", colour="black")

#boundary设定图形起始位置
h <- ggplot(faithful, aes(x=waiting))
h + geom_histogram(binwidth=8, fill="white", colour="black", boundary=31)
h + geom_histogram(binwidth=8, fill="white", colour="black", boundary=35)

#分组直方图,分组直方图用到facet_grid(var ~ .)，该方法是以var变量进行分类，
#做多个图形，非一个图形中做多个直方图。如果变量为数字，应当因子化。
library(MASS) #取birthwt数据
sp <- gplot(birthwt, aes(x=bwt)) 
sp + geom_histogram(fill="white",colour="black") + facet_grid(smoke ~ .)

#密度曲线
sp <- ggplot(faithful, aes(x=waiting))
sp + geom_density()
sp + geom_density(fill="blue", alpha=.2) +xlim(35, 105) #以将包住的部分给填充颜色

#密度曲线与直方图共存
sp <- ggplot(faithful, aes(x=waiting, y=..density..))
sp + geom_histogram(fill="cornsilk", colour="grey60", size=.2) + geom_density() + xlim(35, 105)

#分组密度曲线
birthwt1 <- birthwt
birthwt1$smoke <- factor(birthwt1$smoke)
ggplot(birthwt1, aes(x=bwt, fill=smoke)) + geom_density(alpha=.3)