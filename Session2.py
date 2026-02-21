


def dataTypes():

    age = 20
    price = 9.99
    grade = 'A'
    passed = True
    name = "John"

    print("Age:", age)
    print("Price:", price)
    print("Grade:", grade)
    print("Passed:", passed)
    print("Name:", name)

def operators():

    a = 10
    b = 3

    print("Addition:", a + b)
    print("Subtraction:", a - b)
    print("Multiplication:", a * b)
    print("Division:", a / b)
    print("Modulus:", a % b)


    print("a > b:", a > b)
    print("a == b:", a == b)

    print("a > 5 and b < 5:", a > 5 and b < 5)

def inputs(): 

    name = input("Enter your name: ")
    age = int(input("Enter your age: "))

    print(f"Hello {name}, you are {age} years old.")


def conditional():
    age = int(input("Enter your age: "))

    if age >= 18:
        print("You are an adult.")
    else:
        print("You are a minor.")

def iterations():

    for i in range(1, 6):
        print("Number:", i)

    i = 1
    while i <= 5:
        print("Number:", i)
        i += 1

def arrays():

    numbers = [10, 20, 30, 40, 50]
    print("First element:", numbers[0])

    for num in numbers:
        print("Element:", num)
