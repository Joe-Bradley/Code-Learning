#ggplot2 advance for scatter diagram
ggplot(mtcars,aes(x=wt,y=mpg)) + geom_point(shape=0)
ggplot(mtcars,aes(x=wt,y=mpg)) + geom_point(size=5)

library(gcookbook)
heihtweight[, c("sex", "ageYear", "heightIn")]
ggplot(heightweight, aes(x=ageYear, y=heightIn, color=sex)) +geom_point()
ggplot(heightweight, aes(x=ageYear, y=heightIn, shape=sex,color=sex)) +geom_point()
ggplot(heightweight, aes(x=ageYear, y=heightIn, colour=weightLb))+ geom_point()
ggplot(heightweight, aes(x=ageYear, y=heightIn, size=weightLb)) + geom_point()
ggplot(heightweight, aes(x=weightLb, y=heightIn, fill=ageYear)) + geom_point(shape=21, size=2.5) + scale_fill_gradient(low="black", high="red")
ggplot(heightweight, aes(x=ageYear, y=heightIn,size=weightLb, colour=sex)) + geom_point(alpha=.5) + scale_size_area() + scale_colour_brewer(palette="Set1")

sp <- ggplot(diamonds, aes(x=carat, y=price))
sp + stat_bin2d(bins=50) + scale_fill_gradient(low="lightblue", high="red",limits=c(0, 6000))
sp + stat_bin2d() + scale_fill_gradient(low="lightblue", high="red", breaks=c(0, 250, 500, 1000, 2000, 4000, 6000), limits=c(0, 6000))

#add disturbance
sp1 <- ggplot(ChickWeight, aes(x=Time, y=weight))
sp1 + geom_point()
sp1 + geom_point(position="jitter")

#add annotate
sp <- ggplot(subset(countries, Year==2009 & healthexp>2000),aes(x=healthexp, y=infmortality)) +geom_point()
sp + annotate("text", x=4350, y=5.4, label="Canada") + annotate("text", x=7400, y=6.8, label="USA")

#add lots annotates
#Geom_text(aes(lable=))  批量添加标签
sp <- ggplot(subset(countries, Year==2009 & healthexp>2000),aes(x=healthexp, y=infmortality)) +geom_point()
sp + geom_text(aes(label=Name), size=4)

#coord_fixed()XY 轴比例相同
sp <- ggplot(marathon, aes(x=Half,y=Full)) + geom_point()
sp + coord_fixed()

#Xlab和 ylab添加标题
hwp <- ggplot(heightweight, aes(x=ageYear, y=heightIn, colour=sex)) + geom_point()
hwp + xlab("Age in years") + ylab("Height in inches")

#scale_y_continuous修改刻度的label
hwp <- ggplot(heightweight, aes(x=ageYear, y=heightIn, colour=sex)) + geom_point()
hwp + scale_y_continuous(breaks=c(50, 56, 60, 66,72),labels=c("Tiny","Really\nshort","Short","Medium","Tallish"))

#修改title的字体
hwp <- ggplot(heightweight, aes(x=ageYear, y=heightIn)) + geom_point()
hwp + theme(axis.title.x=element_text(face="italic", colour="darkred", size=14))

#坐标轴改颜色 
p <- ggplot(heightweight, aes(x=ageYear,y =heightIn)) + geom_point()
p + theme(axis.line = element_line(colour="red"))

#背景颜色去掉
p <- ggplot(heightweight, aes(x=ageYear, y=heightIn)) + geom_point()
p + theme_bw() + theme(panel.border = element_blank(), axis.line =element_line(colour="black"))

#调整 XY 坐标轴粗细
p <- ggplot(heightweight, aes(x=ageYear, y=heightIn)) + geom_point()
p + theme_bw() + theme(panel.border = element_blank(), axis.line =element_line(colour="black", size=4, lineend="square"))

