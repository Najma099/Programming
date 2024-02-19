N=100
door=[0]*100
count_open_door=0
count_close_door=0
for i in range(N):
    for j in range(0,100,i+1):
        if door[j]==0:
            door[j]=1
        else:
            door[j]=0