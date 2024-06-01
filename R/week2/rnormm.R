set.seed(2422)
random_numbers <- rnorm(100)
random_numbers
mean1 <- mean(random_numbers)
num <- random_numbers[random_numbers >= -1]
mean2 <- mean(num)
abs_diff <- abs(mean1 - mean2)
print(abs_diff)
