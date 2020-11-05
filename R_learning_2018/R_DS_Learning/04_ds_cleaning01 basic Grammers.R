x <- c(1,2,3)
y <- x*2 + 1
z <- y - x
ages <- c(Li = 33, Zhang = 29, Liu = 18)

names(x) <- c('name1', 'name2', 'name3')
x["name1"]
x[c(1,3)]
x[-(1:2)]
x[-3]
x[x<10]
x[2] <- 123
x[c(1,3)] = c(144,169)
x[c(1,3)] = 0
x[] = 0
x[4] <- 125
x1 = x[1:3]
x2 = x[2]
x3 = x[c(1,3)]
ages[c("Li", "Liu")]

x <- c(1, 4, 6.25)
mode(x)
mode(x>1)
length(x)

a = 1:24
dim(a) = c(6,4)
z1 <- array(x, dim = c(2,2), dimnames = list(c("row1","row2"),c("col1", "col2")))
z2 <- matrix(data = NA, nrow = 1, ncol = 1, byrow = FALSE, dimnames = NULL)
a[1,1]
a[1,]
a[,1]
a[,c(1,3)]

a1 <- array(1:6, dim = c(2,3))
a2 <- array(1:9, dim = c(3,3))
rbind(a1, a2)
cbind(t(a1), a2)

a3 <- array(1:6, dim = c(2,3))
apply(a3, 1, sum)
apply(a3, 2, sum)

a4 <- list(1, 2, x, "hello", c(1:9))
x[1]
x[[1]]
x[c(1,5)]
names(x) <- c("v1", "v2", "v3", "v4", "v5")
x$v1
x["v1"]
x[1] <- 111
x[6] <- 10
x[6] <- NULL
y1 <- c(a4,list(22,222))

xx <- list(c(1:3),c(4:6))
y9 <- lapply(xx,mean)

list1 <- list(1:5)
list2 <- list(10:14)
v1 <- unlist(list1)
v2 <- unlist(list2)
result <- v1 + v2
print(result)

name <- c("王宏", "马兰", "刘涛", "张峰") 
sex <- c("男", "女", "男", "男") 
score <- c(90, 85, 82, 93) 
df1<-data.frame(name, sex, score, stringsAsFactors =FALSE)

lst<-list(name=c("王宏","马兰","刘涛","张峰"), sex=c("男", "女", "男", "男"), score=c(90, 85, 82, 93))
df2<-as.data.frame(lst, stringsAsFactors =FALSE)

arr1 <- array(1:12,c(4,3))
df <- as.data.frame(arr1)
arr2<- array(1:12, c(4,3), dimnames=list(c("R1", "R2", "R3", "R4"), c("C1","C2","C3")))
df2 <- as.data.frame(arr2)

df1['score']
df1[,'score']
df1[3]
df1[,3]
df1[c(1,3)]
df1[,c(1,3)]
df1[c(1,3),]
df1[c(1,3),c(2,3)]
df1 $ name
df1[['name']]
df1[1][1]
df1[['name']][1]
df1 $ name[1]
df1 $ name[1] <- '汪精卫'
df1[1,2] <- '女'
df1[[1]][2] <- '马兰兰'
df1 <- df1[-2,]
df1 <- df1[,-3]
df1 <- df1[-c(1,3),]
df1 <- df1[,-c(1,4)]

ID<-c(1,2,3,4)
name<-c("A","B","C","D")
score<-c(60,70,80,90)
student1<-data.frame(ID,name)
student2<-data.frame(ID,score)
total_student1<-merge(student1,student2,by="ID")

ID<-c(1,2,3,4)
name<-c("A","B","C","D")
score<-c(60,70,80,90)
sex<-c("M","F","M","M")
student1<-data.frame(ID,name)
student2<-data.frame(score,sex)
total_student2<-cbind(student1,student2)

ID<-c(1,2,3,4)
name<-c("A","B","C","D")
student1<-data.frame(ID,name)
ID<-c(5,6,7,8)
name<-c("E","F","G","H")
student2<-data.frame(ID,name)
total_student3<-rbind(student1,student2)

x <- c(3:5, 11:8, 8 + 0:5)
unique(x)
unique(x, fromLast=TRUE)
a <- matrix(c(1,2,3,1,2,4,1,3,5,1,2,3), nrow=4,byrow=T)
unique(a)

test <- data.frame(
  x1 = c(1,2,3,4,5,1,3,5),
  x2 = c("a","b","c","d","e","a","b","e"),
  x3 = c("a","b","c","d","e","a","c","e"))
test[!duplicated(test),] 
test[!duplicated(test[,c(2,3)]),]
test[!duplicated(test[,c(1,3)]),] 
test[!duplicated(test[,1]),]  
test[!duplicated(test[,3]),]  


