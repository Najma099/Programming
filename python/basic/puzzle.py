def toggle_doors(num_doors, num_iterations):
    doors = [False] * num_doors  

    for i in range(1, num_iterations + 1):
        if i == 1:
            doors = [True] * num_doors
        elif i == 2:
            doors = [not doors[j] if (j + 1) % 2 == 0 else doors[j] for j in range(num_doors)]
        else:
            doors = [not doors[j] if (j + 1) % i == 0 else doors[j] for j in range(num_doors)]

    return doors

def print_open_doors(doors):
    open_doors_indices = [i + 1 for i, door in enumerate(doors) if door]
    print("Open doors:", open_doors_indices)

num_doors = 100
num_iterations = 100

final_doors = toggle_doors(num_doors, num_iterations)
print_open_doors(final_doors)



