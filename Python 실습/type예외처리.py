price = input("Enter the price : ")

try:
    price = float(price)
    print("Price = ", price)
except ValueError as err:
    print(err)