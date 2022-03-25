a <- 2
b = 2

#Vector
cv <- c("China", "Korea", "Japan", "UK", "USA", "France", "India", "Russia") 
nv <- c(1, 3, 6, 7, 3, 8, 6, 4)
lv <- c(T, F, T, F, T, F, F, T)
c(2,5,6,9) 
rep(2,times=4) 
seq(from=3, to=21, by=3 )

#matrix
x <- 1:12
dim(x) <- c(3,4)
matrix.x <- matrix(1:12,nrow=3,byrow=T)

#factor
data1 <- c("East","West","East","North","North","East","West","West","West","East","North")
factor_data <- factor(data1)

#data frame
emp.data <- data.frame(
  emp_id = c (1:5), 
  emp_name = c("Rick","Dan","Michelle","Ryan","Gary"),
  salary = c(623.3,515.2,611.0,729.0,843.25), 
  
  start_date = as.Date(c("2012-01-01", "2013-09-23", "2014-11-15", "2014-05-11",
                         "2015-03-27")),
  stringsAsFactors = FALSE
)

#list
list_data <- list("Red", "Green", c(21,32,11), TRUE, 51.23, 119.1)




