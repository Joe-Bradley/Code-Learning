#####################################################################
##############################复习题#################################
#####################################################################
#读取CSV文件
stuscore <- read.csv("student.csv")

#由于量纲不一致，计算各门成绩的标准化分数，存入相应的新列
options(digits=2)
afterscale <- scale(stuscore[,3:5])
colnames(afterscale) <- c("stdmath","stdsci","stdeng")
stuscore <- cbind(stuscore,afterscale)

#根据标准分，计算所有学生的考试均分，存入新列avgstdscore中；
avgstdscore <- apply(afterscale,1,mean)
stuscore <- cbind(stuscore,avgstdscore)

#根据标准化均分，将学生成绩评定为等级A~E，规则是成绩的前20%为A,
afterquantile <- quantile(avgstdscore,c(0.8,0.6,0.4,0.2))
stuscore$grade[stuscore$avgstdscore>=afterquantile[1]] <- "A"

stuscore$grade[stuscore$avgstdscore>=afterquantile[2]
               &stuscore$avgstdscore<afterquantile[1]] <- "B"

stuscore$grade[stuscore$avgstdscore>=afterquantile[3] &
                 stuscore$avgstdscore<afterquantile[2]] <- "C"

stuscore$grade[stuscore$avgstdscore>=afterquantile[4] &
                 stuscore$avgstdscore<afterquantile[3]] <- "D"

stuscore$grade[stuscore$avgstdscore<afterquantile[4]] <- "E"

#以空格为分隔符，将学生姓名拆分为姓氏和名字两列
stuscore$StuName <- as.character(stuscore$StuName)
name <- strsplit(stuscore$StuName," ")
FirstName <- sapply(name,"[",1)
LastName <- sapply(name,"[",2)
stuscore <- cbind(stuscore,FirstName,LastName)

#按照先姓后名的顺序将数据框升序排序。
stuscore <- stuscore[order(LastName,FirstName),]

#################################################################
##############################作业题#############################
#################################################################

#读入数据
a1 <- read.csv("input1.csv")
a2 <- read.csv("input2.csv")

#删除不必要的第一列
a1 <- a1[,-1]
a2 <- a2[,-1]

#设置正确的数据框列名（“id”,“name”,“salary”,“start_date”,“dept”等）
a1 <- a1[-1,]
a2 <- a2[-1,]
a <- rbind(a1,a2)

colnames(a) <- c("id","name","salary","start_date","dept")

#将salary列设置为数值型
a$salary <- as.numeric(a$salary)

#将start_date列设置为日期型
a$start_date <- as.Date(a$start_date)

#增加一列comment，由“name”， “start_date”和“dept”三列信息构成，说明某人于某日进入某部分，例如“Rick entered IT on 2012-01-01”。
a$comment <- paste(a$name,"entered",a$dept,"at",as.character(a$start_date),sep=" ")

#增加一个逻辑型的新列flag，说明本行是否有缺失数据，如果有为真，否则为假。
a$flag <- is.na(a$start_date)

#删除重复行
index <- duplicated(a$id)
a <- a[!index,]

#函数
get_data <- function(filename)
{
  data
}

###############################################################
###########################知识点##############################
###############################################################

#求行和 & 求列和
a1 <- array(1:6, dim = c(2,3))
apply(a1, 1, sum)
apply(a1, 2, sum)
apply(a1, 1, mean)

#读取JSON 文件
a <- fromJSON("1.json")

#文本、数值、因子类型转换
a$a1 <- as.character(a$a1)
a$a1 <- as.numeric(a$a1)
a$a1 <- factor(scores$sex, levels=c("M", "F"), ordered = TRUE)

a$a1 <- as.data.frame(a$a1)
a$a1 <- as.logic(a$a1)
a$a1 <- as.complex(a$a1)

#向量、矩阵、数组和数据框等数据结构的生成

##向量
a1 <- c("China", "Korea", "Japan", "UK", "USA", "France", "India", "Russia") 

##矩阵
x <- 1:12
dim(x) <- c(3,4)
matrix.x <- matrix(1:12,nrow=3,byrow=T)

##数组
a1 <- 1:12

##数据框
emp.data <- data.frame(
  emp_id = c (1:5), 
  emp_name = c("Rick","Dan","Michelle","Ryan","Gary"),
  salary = c(623.3,515.2,611.0,729.0,843.25), 
  
  start_date = as.Date(c("2012-01-01", "2013-09-23", "2014-11-15", "2014-05-11",
                         "2015-03-27")),
  stringsAsFactors = FALSE
)

##函数
levelofhp <- function(hp) {
  if (hp<100){ 
    level <- "low"
  }
  else if (hp>=100 && hp<300){
    level <- "normal"
  }
  else{
    level <- "high"
  }
  level
}

mtdata <- mtcars[,c(1,4,6)]
afterscale <- scale(mtdata)
colnames(afterscale) <- c("stdmpg","stdhp","stdwt")
mtdata <- cbind(mtdata,afterscale)
mtdata$level <- lapply(mtdata[,2],levelofhp)
