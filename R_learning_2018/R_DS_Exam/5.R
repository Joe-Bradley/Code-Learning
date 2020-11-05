library(cluster)
a_input = as.data.frame(read.csv("agridata.csv"))
a = as.matrix(a_input[,-1])
wss <- numeric(8) 
for (k in 1:8)
  wss[k] <- sum(kmeans(a, centers=k, nstart=k)$withinss)
plot(1:8, wss, type="b", xlab="Number of Clusters", ylab="Within Sum of Squares")

km = kmeans(a,4, nstart=4)
km
a_input$cluster = factor(km$cluster)
a_input

