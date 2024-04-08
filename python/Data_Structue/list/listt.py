my_list=[1,2,3,4]
print(my_list)
print(type(my_list))


list=["mango",2,4,8.555,True]
print(list)

#adding element
list.append(1)
print(list)

#print element of list
print(list[0])
print(list[1])

#duplicate elements
list1=[1,2,3,4,3,2,1]
print(list1)
print(len(list1))

#initialing empty list
list2=[]
list2.append(5)
del list2[0];
print(list2)

#joining two list
list3=[2,3,4,5,78,0]
list4=[4,5,6,2,4,4,5]
list5=list3+list4
print(list5)