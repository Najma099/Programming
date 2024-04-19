def calculate_factorial(n):
    factorial=1
    if(n==1 or n==0):
       return factorial
    else:
      for i in range(1,n+1):
       factorial=factorial*i
    return factorial
n=int (input("Enter the number: "))
result=calculate_factorial(n)
print("Factorial of",n,"is",result)