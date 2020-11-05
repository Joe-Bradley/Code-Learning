library(bitops)
library(RCurl)
library(jsonlite)
library(RJSONIO)
library(rjson)
#Java -jar D:/Java/selenium-server-standalone-3.5.1.jar

tpage <- getURL("http://www.kuaidi100.com/query?type=jd&postid=VB40641457651")
rawdata <- fromJSON(tpage)
