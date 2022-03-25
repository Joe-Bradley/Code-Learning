a <- read.csv("workhours.csv")
t.test(a$hours,mu=52)