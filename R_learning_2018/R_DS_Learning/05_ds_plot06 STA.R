#相关系数
library(corrplot)
mcor <- cor(mtcars)
corrplot(mcor)

#用颜色方块表示相关系数，黑色文本标签，上边文本标签 45 度右倾。
corrplot(mcor,method="shade",shade.col=NA,tl.col="black",tl.srt=45)

#定制调色板，添加相关系数显示，对矩阵排序使得相近的变量在图中更近。
col <- colorRampPalette(c("#BB4444","#EE9988","#FFFFFF","#77AADD","#4477AA"))
corrplot(mcor,method="shade",shade.col=NA,tl.col="black",tl.srt=45,col=col(200),addCoef.col="black",order="AOE")

#绘制网络图
#定义并绘制一个有向图
#定义并绘制一个无向图
library(igraph)
gd <- graph(c(1,2, 2,3, 2,4, 1,4, 5,5,3,6))
plot(gd)

gu <- graph(c(1,2, 2,3, 2,4, 1,4, 5,5, 3,6),directed=FALSE)
plot(gu,vertex.label=NA)

#从数据框中的数据生成图对象，再进行绘制
library(gcookbook)
g <- graph.data.frame(madmen2, directed=TRUE)
plot(g,layout=layout.fruchterman.reingold,vertext.size=5,edge.arrow.size=0.3)

#可以使用 geom_tile() 或 geom_raster() 绘制热图
library(ggplot2)
pres_rating <- data.frame(rating = as.numeric(presidents),year = as.numeric(floor(time(presidents))),quarter = as.numeric(cycle(presidents)))
p <- ggplot(pres_rating, aes(x=year,y=quarter, fill=rating))
p + geom_tile()
p + geom_raster()

#定制热图
p + geom_tile() +
scale_x_continuous(breaks = seq(1940,1976, by=4)) +
scale_y_reverse() +
scale_fill_gradient2(midpoint=50,mid="grey70",limits=c(0,100))

#可以使用rgl包的plot3d()函数绘制三维散点图，其参数可以是：
#一个数据框，前三列分别表示 x,y,z 的坐标；
#三个向量，分别表示 x,y,z 的坐标。
library(rgl)# 安装时间相当长
plot3d(mtcars$wt,mtcars$disp,mtcars$mpg)
plot3d(mtcars$wt,mtcars$disp,mtcars$mpg,type="s",size=0.75,lit=FALSE)

#从 maps 包获取地图数据
library(maps)
library(ggplot2)
states_map <- map_data("state")
ggplot(states_map, aes(x=long,y=lat,group=group)) + geom_polygon(fill="white",colour="black")
ggplot(states_map, aes(x=long,y=lat,group=group)) + geom_path() + coord_map("mercator")

#获取不同区域地图的方法：
states_map <- map_data("state")
world_map <- map_data("world")
euro_map <- map_data("world",region=c("UK","France","Netherlands","Belgium"))
japan_map <- map_data("world",region="japan")

#列出所有区域名字：
sort(unique(world_map$region))

#地图上不同区域根据变量值填充不同颜色
#将变量值和地图数据合并，将相应变量值映射到 fill 上。 
#示例：
library(plyr)
crimes <- data.frame(state=tolower(rownames(USArrests)),USArrests)
states_map <- map_data("state")
crime_map <- merge(states_map,crimes, by.x="region",by.y="state")
crime_map <- arrange(crime_map,group,order)
ggplot(crime_map, aes(x=long,y=lat,group=group,fill=Assault)) +
geom_polygon(colour="black") +coord_map("polyconic")

#定制颜色标度
ggplot(crime_map, aes(x=long,y=lat,group=group,fill=Assault)) +
geom_polygon(colour="black") +
scale_fill_gradient2(low="#559999",mid="grey90",high="#BB650B",midpoint=median(crimes$Assault)) +
coord_map("polyconic")

#使用离散化的颜色标度
qa <- quantile(crimes$Assault,c(0,0.2,0.4,0.6,0.8,1.0))
crimes$Assault_q <- cut(crimes$Assault,qa,labels=c("0-20%","20-40%","40-60%","60-80%","80-100%"),include.lowest=TRUE)
states_map <- map_data("state")
crime_map <- merge(states_map,crimes, by.x="region",by.y="state")
crime_map <- arrange(crime_map,group,order)
pal <- colorRampPalette(c("#559999","grey90","#BB650B"))(5)
ggplot(crime_map, aes(x=long,y=lat,group=group,fill=Assault_q)) +
geom_polygon(colour="black") +
scale_fill_manual(values=pal) +
coord_map("polyconic") +
labs(fill="Assault Rate\nPercentile")

#输出图形为 PDF 格式
pdf("d:/myplot.pdf",width=4,height=4)
print(ggplot(mtcars,aes(x=wt,y=mpg))+geom_point())
#  或者 plot(mtcars$wt,mtcars$mpg)
dev.off()

#输出图形为 PDF 格式
ggplot(mtcars,aes(x=wt,y=mpg))+geom_point()
ggsave("d:/mtcars.pdf",width=8,height=8,units="cm")

#输出图形为点阵图形格式
ppi <- 300
png("d:/myplot_%d.png",width=4*ppi,height=4*ppi,res=ppi)
plot(mtcars$wt,mtcars$mpg)
print(ggplot(mtcars,aes(x=wt,y=mpg))+geom_point())
dev.off()

#输出图形为点阵图形格式
ggplot(mtcars,aes(x=wt,y=mpg))+geom_point()
ggsave("d:/mtcars.png",width=8,height=8,units="cm",dpi=300)
