#箱线图
sp <- ggplot(birthwt, aes(x=factor(race), y=bwt))
sp + geom_boxplot()

#如果存在多个多个离群点，可用outlier.size 和outlier.shape进行大小和形状设置
sp <- ggplot(birthwt, aes(x=factor(race), y=bwt))
sp + geom_boxplot(outlier.size=1.5, outlier.shape=21)

#为了看数据分布是否有偏，可以增加均值与中值进行比较，用stat_summary 把均值以菱形展示。
sp <- ggplot(birthwt, aes(x=factor(race), y=bwt))
sp + geom_boxplot() + stat_summary(fun.y="mean", geom="point", shape=23, size=3,fill="white")

#ggplot2中，颜色是一个图形属性，对于几何对象，colour参数控制的是线条、
#多边形轮廓的颜色，fill参数控制的是多边形填充色。
library(MASS)
ggplot(mtcars,aes(x=wt,y=mpg)) + geom_point(colour="red")
ggplot(birthwt,aes(x=bwt)) + geom_histogram(fill="red",colour="black")

#用变量控制颜色
#将变量映射到颜色上，即对几何对象，将 colour 或 fill 参数映射到数据中某个变量上。
#离散型
ggplot(cabbage_exp,aes(x=Date,y=Weight,fill=Cultivar)) +
geom_bar(colour="black",stat="identity")
#连续型
ggplot(mtcars,aes(x=wt,y=mpg,colour=cyl)) + geom_point()

#数值型变量映射颜色，可以因子化，使得作为离散值看待。
ggplot(mtcars,aes(x=wt,y=mpg,colour=factor(cyl))) + geom_point()

#对离散变量预定义的调色板
p <- ggplot(uspopage, aes(x=Year,y=Thousands,fill=AgeGroup)) + geom_area()
p + scale_colour_hue(l=45) #  略微加深

library(RColorBrewer)
display.brewer.all()
p + scale_fill_brewer(palette="Oranges")
p + scale_fill_grey(start=0.7,end=0)

#对离散变量使用自定义的调色板
p <- ggplot(uspopage, aes(x=Year,y=Thousands,fill=AgeGroup)) + geom_area()
cb_palette <-c("#999999","#E69F00","#56B4E9","#009E73","#F0E442","#0072B2","#D55E00","#CC79A7")
p + scale_fill_manual(values=cb_palette)
pal_1 <-c("white","black","grey80","red","blue","darkred","thistle3","seashell")
p + scale_fill_manual(values=pal_1)

#对连续型变量使用设定的调色板
p <- ggplot(heightweight, aes(x=ageYear,y=heightIn,colour=weightLb)) + geom_point(size=3)
p + scale_colour_gradient(low="black",high="white") #  两色渐变
p + scale_colour_gradient2(low="red",mid="white",high="blue") #  三色渐变
p + scale_colour_gradientn(colours=c("darkred","orange","yellow","white")) #  四色渐变











