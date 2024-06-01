set.seed(2342)
random <- rnorm(100)
indices <- which(random > -1.234 & random < 0.7643)
print(indices)

sum_indices <- sum(indices)
print(sum_indices)

