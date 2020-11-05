a1 <- read.csv("group1.csv")
a2 <- read.csv("group2.csv")
a3 <- read.csv("group3.csv")
a <- rbind(a1,a2)
a <- rbind(a,a3)
a <- a[-19,]

segmentofage <- function(age) {
  if (age<35){ 
    level <- "young"
  }
  else if (age>=35 && age<50){
    level <- "middle"
  }
  else{
    level <- "old"
  }
  level
}

a$age_seg <- lapply(a[,3],segmentofage)

a$nettime <- as.character(a$nettime)
time <- strsplit(a$nettime,":")
min <- sapply(time,"[",1)
sec <- sapply(time,"[",2)
a$time_s <- as.numeric(min) * 60 + as.numeric(sec)