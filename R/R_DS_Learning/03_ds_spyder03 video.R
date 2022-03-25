library(tidyverse)
library(rvest)
library(stringr)

#read html
pages <- read_html("http://www.miaopai.com/u/paike_8o7ugjvf5c")

#
links <- pages %>% html_nodes("div.MIAOPAI_player") %>% html_attr("data-scid")
links <- paste0("http://gslb.miaopai.com/stream/", links, ".mp4")
ct = length(links)
names<-c()
names=paste0(rep("C:/Users/lenovo/Desktop/Data Science/data_download/3_3file/3_3 ",ct),1:ct,".mp4")
for(i in 1:ct){
         download.file(links[i],names[i],mode="wb")
}
                      
