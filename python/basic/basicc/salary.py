annual_salary=int(input("Annual Salary: "))
tax=0
if(annual_salary<=250000):
    tax=0
    print(tax)
elif(annual_salary>250000 and annual_salary<=500000):
    tax=annual_salary*5/100
    print(tax)
elif(annual_salary>500000 and annual_salary<=750000):
    tax=annual_salary*10/100
    print(tax)
elif(annual_salary>750000 and annual_salary<=1000000):
    tax=annual_salary*15/100
    print(tax)
elif(annual_salary>1000000 and annual_salary<=1250000):
    tax=annual_salary*20/100
    print(tax)
elif(annual_salary>1250000 and annual_salary<=1500000):
    tax=annual_salary*25/100
    print(tax)
else:
    tax=annual_salary*30/100
    print(tax)




