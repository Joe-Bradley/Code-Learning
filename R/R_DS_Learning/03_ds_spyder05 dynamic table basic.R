library("bitops")
library(RCurl)# 抓取数据
library(XML)# 解析网页
library(stringr)# 字符串处理
library(dplyr)# 调用%>%管道
library("RSelenium") #爬取动态网页
#Java -jar D:/Java/selenium-server-standalone-3.5.1.jar

remDr = remoteDriver('localhost',4444L,browserName='firefox')
remDr$open()
remDr$navigate("https://www.lagou.com/jobs/list_数据分析")
tpage <- remDr$getPageSource()
pageSource <- tpage[[1]]

list_web <- htmlParse(pageSource,encoding = "UTF-8")
title <-  list_web %>% getNodeSet("//h3")%>%sapply(xmlValue)
area <-  list_web%>% getNodeSet("//*[(@id = 's_position_list')]//em")%>%sapply(xmlValue)
