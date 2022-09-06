#ggplot2
#scatter diagram, line chart, bar chart, histogram, box plot, pie
library(ggplot2)

ggplot(mtcars,aes(x=wt,y=mpg)) + geom_point()

ggplot(pressure,aes(x=temperature, y=pressure)) + geom_line() + geom_point()

ggplot(BOD,aes(x=Time,y=demand)) + geom_bar(stat='identity')

ggplot(mtcars,aes(x=mpg)) + geom_histogram()

ggplot(ToothGrowth,aes(x=supp, y=len)) + geom_boxplot()

dt = data.frame(A = c(2, 7, 4, 10, 1), B = c('B','A','C','D','E'))
gplot(dt, aes(x = "", y = A, fill = B)) + geom_bar(stat = "identity") +
  coord_polar(theta = "y") ## 把柱状图折叠成饼图（极坐标）





