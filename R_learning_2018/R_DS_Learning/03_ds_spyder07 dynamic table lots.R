library(stringr)
library(xml2)
library(rvest)
library(RSelenium) 
library(rjson)
#Java -jar D:/Java/selenium-server-standalone-3.5.1.jar

remDr = remoteDriver('localhost',4444L,browserName='firefox')
remDr$open()
remDr$navigate("http://data.eastmoney.com/hsgt/index.html")
tpage <- remDr$getPageSource()
pageSource <- tpage[[1]]
web <- read_html(pageSource)

#aquire the number of the pages
pgcttxt <- web %>% html_nodes('#PageCont > a:nth-child(8)') %>% html_text()
pgct <- as.numeric(pgcttxt)

for(m in 1:pgct){
  
  #creat a empty list with null element
  data_list = list(NULL)       
  for (i in 2:12){
    data_list[i] <- NULL
  }
  
  #extract the elements
  tbrows <- web %>% html_nodes('#tb_hgtls > tbody') %>% html_nodes('tr')
  
  #提取每一个单元格，将同列的构成一个向量，保存在一个列表中。
  for(i in 1:length(tbrows)){
    tds <- tbrows[i] %>% html_nodes('td')
    for(j in 1:11){
      data_list[[j]] <- c(data_list[[j]],tds[j] %>% html_text())
    }
  }
  
  capital_data = data.frame(
    market_day= data_list[[1]],
    day_capital_in=data_list[[2]],
    day_balance=data_list[[3]],
    history_capital_in=data_list[[4]],
    day_net_purchase=data_list[[5]],
    purchase_turnover=data_list[[6]],
    sale_turnover=data_list[[7]],
    led_rising_share=data_list[[8]],
    up_down_range=data_list[[9]],
    SSE_composite_index=data_list[[10]],
    SSESC_range=data_list[[11]],
    stringsAsFactors = FALSE
  )
  
  #write.csv
  write.csv(capital_data, file = paste("C:/Users/lenovo/Desktop/Data Science/data_download/3_7file/3_7 page",m,".csv",sep=""))
  
  #pause the time 
  Sys.sleep(2)
  
  #click next page
  nextpgbtn = remDr$findElement(using='xpath',value='//*[@id="PageCont"]/a[8]')
  nextpgbtn$clickElement()
}

remDr$close()
  
  





