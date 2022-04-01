input <- file('stdin', 'r')
PI <- 3.14159
a <- as.integer(readLines(input, n=1))
num <- (4/3)*PI*a*a*a
write(sprintf("VOLUME = %.3f",num),'')
