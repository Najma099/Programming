set.seed(3244)
random_numbers <- rnorm(100)
rounded_numbers <- round(random_numbers)
abs_diff <- abs(rounded_numbers - random_numbers)
meann <- mean(abs_diff)
print(meann)

