setwd("C:/Users/lenovo/Desktop/Data Science/data_codes")
library(readxl)
empdata <- data.frame(
  emp_id = c (1:5), 
  emp_name = c("Rick","Dan","Michelle","Ryan","Gary"),
  salary = c(623.3,515.2,611.0,729.0,843.25), 
  start_date = as.Date(c("2012-01-01", "2013-09-23", "2014-11-15", "2014-05-11",
                         "2015-03-27")),
  stringsAsFactors = FALSE
)

#import data
rt0 <- read.table("2_1.txt",head=TRUE)
rt1 <- read.csv("2_2.csv")
data <- read_excel("123.xlsx")

#output data
write.table(empdata, file = "C:/Users/lenovo/Desktop/Data Science/data_download/1_1.txt", row.names = F, quote = F)
write.csv(empdata, file = "C:/Users/lenovo/Desktop/Data Science/data_download/1_2.csv")
