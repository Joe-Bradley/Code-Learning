library(xml2)
library(rvest)
library(downloader)
library(stringr)
library(dplyr)
pages <- read_html('https://www.zhihu.com/question/37839997')
links <- pages %>% html_nodes("img") %>% html_attr("src")
protocol = "https"
links <- grep(protocol,links,value=TRUE)

for(i in 1:length(links)){
  download(links[i],paste("C:/Users/lenovo/Desktop/Data Science/data_download/3_2file/3_2 ",i,".jpg",sep=""),mode="wb")
}
