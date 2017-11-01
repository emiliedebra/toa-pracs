import numpy as np

x = [0.5, 1.0, 1.5, 0.001, 20, 1.1, 0.01]

prod_seq_lists = [[x[0], x[1]]]  # Start assuming the first 2 elements have max product and save them in a list
product_result = []  # Contains the product of each list


for e in x[2:]:  # Start for loop from 3rd element
    if x[0] == 0 or x[1] == 0 or e == 0:  # Raise error if there's a 0
        raise IndexError('Found 0')

    temp_b = np.prod(prod_seq_lists[-1])  # Calculate the product of the last list in max_prod_seq
    temp_a = temp_b * e  # Multiply the new_element

    if temp_a >= temp_b:  # If last_list*new_element >= last_list
        prod_seq_lists[-1].append(e)  # Append the new_element in your last_list

        if e == x[-1]:
            product_result.append(temp_a)  # Save the product of the last list

    else:
        product_result.append(temp_b)  # Save the product of each list
        prod_seq_lists.append([e])  # Else, append append the new element in a new_list


print("Your array: ", prod_seq_lists)
print("The list with max product of consecutive elements: ", prod_seq_lists[np.argmax(product_result)])  # Get index of the maximum product and print that list
print("The max product of consecutive elements: ", max(product_result))
