a1 = read.csv("C:\\Users\\lenovo\\Desktop\\input1.csv",head = TRUE)
a2 = read.csv("C:\\Users\\lenovo\\Desktop\\input2.csv",head = TRUE)
a2 <- a2[-1,]
a <- rbind(a1,a2)

a <- a[,-1]
aa <- a[1,]
a <- a[-1,]
aaa = as.vector(unlist(aa))
names(a) = aaa
a <- unique(a)
row.names(a) <- a$id

as.data.frame(lapply(a$salary,as.numeric))
a$start_date <- as.Date(a$start_date)


a$comment <- 0
for(i in 1:dim(a)[1])
  a$comment[i] <- paste(a$name[i], ' entered ', a$dept[i], ' on ', a$start_date[i],sep = '')

a$flag <- F
ssd <- is.na(a)
for(i in 1:dim(ssd)[1])
  for(j in 1:dim(ssd)[2])
      if(ssd[i,j] == TRUE)
        a$flag[i] <- TRUE
