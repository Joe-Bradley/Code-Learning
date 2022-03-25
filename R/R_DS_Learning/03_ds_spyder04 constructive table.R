library(rvest)

url <- "https://www.ssa.gov/oact/babynames/numberUSbirths.html"
pages <- read_html(url)
origtbls <- pages %>% html_nodes("table")
tdata <- origtbls[[2]] %>% html_table()
write.csv(tdata, file = "C:\\Users\\lenovo\\Desktop\\Data Science\\data_download\\3_4file\\3_4 1.csv")
