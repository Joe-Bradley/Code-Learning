a <- read.csv("area_data.csv")
acor <- cor(a[-1])

library(corrplot)
corrplot(acor)

library(psych)
corr.test(a[-1],adjust="none",use="complete")