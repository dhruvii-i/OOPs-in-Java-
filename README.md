# OOPs in Java

# Assignment-1:
## 1. Implement a menu-driven Java program (like fib or factorial) to implement these input methods in java (command line args,
Scanner, BufferedReader, DataInputStream, Console).

BufferedReader is a package in java.io used to efficiently read a text from character input stream. It uses buffer to read data in chunks by minimizing the number of operations and hence improving the performance.

DataOutputStream is a package used when a binary data file is to be written that contains primitive data types.

DataInputStreamer is used to read or interpret the binary data file.




## 2. Implement a simple menu driven calculator in java to implement add, sub, multiplication, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class. (Mean calculation: program reads numbers from the keyboard, summing them in the process until the user enters the string "end". It then stops input & displays the avg. of numbers)

# Assignment-2:

## Part 1: Write
a Java program that declares two arrays named 'even' and 'odd'.
Accept numbers from the user and move them to respective arrays depending
on whether they are even or odd.

This Java program defines a class NearestNeighbors that contains a method findNearestNeighborsIndex which takes an array of integers as input and returns the index of the first number of the nearest neighbors in the array, along with printing the distance between those neighbors. The main method of the class prompts the user to enter the number of elements in the array and the elements themselves. Then, it calls the findNearestNeighborsIndex method and prints the index of the nearest neighbors.

## Part 2: Implement a Java method  that
finds two neighboring numbers in an array with the smallest distance to
each. The function should return the index of the 1st number.

This Java program demonstrates the conversion between an array and an ArrayList. It first converts an array of integers to an ArrayList using Arrays.asList(array) method. Then, it prints out the ArrayList. Next, it creates an ArrayList of strings and adds some elements to it. It converts this ArrayList back to an array using toArray() method and prints out the elements of the array.

Part 3: Write a Java program to convert an array into ArrayList and
vice versa.

This Java program declares two arrays named 'even' and 'odd'. It prompts the user to enter the number of elements, then accepts numbers from the user and moves them to respective arrays depending on whether they are even or odd. Finally, it prints out the contents of the 'even' and 'odd' arrays.


# Assignmet-3:

# Student Management System

The Student Management System is a Java application designed to manage student records efficiently. It provides functionalities for adding, displaying, searching, updating, and deleting student records.

## Features

- **Add Student:** Allows users to add a new student to the system by providing their PRN (Permanent Registration Number), name, date of birth, and marks.
- **Display Students:** Displays all the student records currently stored in the system.
- **Search Student by PRN:** Enables users to search for a student by their PRN.
- **Search Student by Name:** Enables users to search for a student by their name.
- **Update Student:** Allows users to update the details of a student, such as their name, date of birth, and marks.
- **Delete Student:** Allows users to delete a student record from the system.

## How to Use

1. **Run the Program:** Execute the `Main` class to start the Student Management System.
2. **Navigate the Menu:** Follow the on-screen menu prompts to perform various operations.
3. **Input Data:** Provide the required information, such as PRN, name, date of birth, and marks, when adding or updating student records.


# Assignmet-6 Part1:

# Stack Implemetation in Java

This Java application implements two types of stacks: Fixed Size Stack and Growable Stack. The implementation follows the interface IntStack, which defines the basic operations such as push, pop, peek, and isEmpty.

## InStack Interface

The IntStack interface defines the contract for implementing a stack data structure. It includes the following methods:

- **push(int item):** Pushes an item onto the stack.
- **pop():** Removes and returns the item at the top of the stack.
- **peek():** Returns the item at the top of the stack without removing it.
- **isEmpty():** Checks if the stack is empty.

## FixedIntStack Class:

The FixedIntStack class implements the IntStack interface to create a fixed-size stack. It has a predetermined capacity, and once the stack is full, it does not resize. If an attempt is made to push an item onto a full stack, it results in a stack overflow error.

## GrowableIntStack Class:

The GrowableIntStack class implements the IntStack interface to create a growable stack. It starts with a default capacity and doubles its size whenever the stack is full. This allows for dynamic resizing of the stack to accommodate more elements as needed.

## Main Class:

The Main class contains the main method, which demonstrates the usage of both FixedIntStack and GrowableIntStack. It creates instances of these classes and performs various operations such as pushing, popping, and peeking elements from the stacks.

# Assignment-5:
Part 1: Implement the generic Shapes class as an abstract class so that we can extend concrete classes like circle, triangle, rectangle class from it. The details of shape and other classes is given in diagram. Write a concrete subclass Rectangle, Circle and Square. In another class, write a main method to define a Rectangle and a Triangle


Part 2: Program to implement multilevel inheritance. Create class Account with cust_name and account_number as instance variables and write getdata and putData() methods which will take customer name and account number and will display the same using putData method. Create another class savingAcc that extends class Account with min_balance and sav_bal as instance variables and getdata() and putData() method to take instance variables as well as call base class methods in respective getData and putData methods. Create another class accdetail with deposits and withdrawal as instance variables, getdata() and putData() method to take instance variables as well as call base class methods in respective getData and putData methods.Create separate class accountInfo which will create object of accdetail and its respective methods to get and display information.

## Assignment 5: Part 1 - Shape Calculator

## Overview:

This repository contains a Java program that implements a simple shape calculator. The program defines three classes: Circle, Triangle, and Rectangle, each representing a different geometric shape. Additionally, there is an interface called Shape which outlines the methods required for shape calculation: calculateArea() and calculatePerimeter().

## Files Included:

### Circle.java:
Defines the Circle class, which calculates the area and perimeter of a circle based on its radius.
### Triangle.java:
Defines the Triangle class, which calculates the area and perimeter of a triangle based on its three sides.
### Rectangle.java:
Defines the Rectangle class, which calculates the area and perimeter of a rectangle based on its two sides.
### Shape.java:
Defines the Shape interface, which outlines the methods for calculating area and perimeter.
### Assignment5_Part1.java:
Contains the main method where instances of Circle, Triangle, and Rectangle are created and their properties are displayed.




## Usage:

To use the program, follow these steps:

1. Compile all Java files using a Java compiler.
2. Run the Assignment5_Part1 class.
3. The program will display the area and perimeter of a circle, triangle, and rectangle.

## Functionality:

### Circle: 
Calculates the area using the formula π * radius^2 and the perimeter using the formula 2 * π * radius.
### Triangle: 
Calculates the area using Heron's formula and the perimeter by summing up the lengths of its three sides.
### Rectangle: 
Calculates the area by multiplying the lengths of its two sides and the perimeter by summing up twice the lengths of its two sides.

## Assignment 5: Part 2 - Payroll Management System

## Overview:

This repository contains a Java program that simulates a payroll management system. The program defines two classes: NormalEmployee and BonusEmployee, each representing a different type of employee. Additionally, there is a PaySlip class that generates pay slips for employees based on their details and earnings.

## Files Included:

### Employee.java: 
Defines the abstract class Employee, which contains attributes and methods common to all types of employees.
### NormalEmployee.java: 
Defines the NormalEmployee class, which calculates the monthly salary of a normal employee based on their gross wage, total working days, and deductions.
### BonusEmployee.java:
Defines the BonusEmployee class, which extends the Employee class and calculates the monthly salary of an employee with a bonus component.
### PaySlip.java: 
Contains the main method where instances of NormalEmployee and BonusEmployee are created, and their pay slips are generated.
### README.md:
This file.

## Usage:

To use the program, follow these steps:

1. Compile all Java files using a Java compiler.
2. Run the PaySlip class.
3. The program will display the pay slip for each employee.

## Functionality:

### NormalEmployee: 
Calculates the monthly salary of a normal employee based on their gross wage, total working days, loss of pay days, and various deductions such as EPF, health insurance, professional tax, and loan recovery.
### BonusEmployee:
Extends the NormalEmployee class and adds a bonus component to the monthly salary calculation.

# Assignment4:  Deck of Cards Java Program

This Java program simulates a deck of cards and provides various functionalities such as displaying the deck, shuffling the deck, drawing a card, comparing two cards, checking if two cards are the same, finding a card by rank and suit, dealing a hand of cards, and quitting the program.

## How to Run

1. Ensure you have Java installed on your system.
2. Compile the `assignment_4.java` file:

3. Run the compiled Java program:
4. Follow the on-screen instructions to interact with the program.

## Menu Options

1. **Display the deck of cards:** Displays all the cards currently in the deck.
2. **Shuffle the deck of cards:** Shuffles the cards in the deck.
3. **Draw a card from the deck:** Draws a card from the top of the deck.
4. **Empty the deck:** Removes all cards from the deck.
5. **Print a card from the deck:** Prints the card at a specified position in the deck.
6. **Compare two cards:** Draws two random cards and compares their ranks.
7. **Check if two cards are the same:** Draws two random cards and checks if they are the same.
8. **Find card by rank and suit:** Finds a card in the deck based on user-provided rank and suit.
9. **Deal a hand of cards:** Deals cards evenly among a specified number of players.
10. **Quit:** Exits the program.



## Classes:
### assignment_4.java:
This class contains the main method and acts as the entry point of the program. It interacts with the user and calls methods from the Deck class to perform various operations on the deck of cards.

### Deck: 
This class represents a deck of cards. It contains methods to create a deck, display the deck, shuffle the deck, draw a card, empty the deck, compare two cards, check if two cards are the same, find a card by rank and suit, deal a hand of cards, and sort the deck.

### Card: 
This class represents a single playing card. It stores information about the rank and suit of the card and provides methods to retrieve this information.

## Methods:
### Deck.createDeck():
Creates a new deck of cards with all possible combinations of ranks and suits.

### Deck.displayDeck(Vector<Card> deck): 
Displays all the cards in the deck.

### Deck.shuffleDeck(Vector<Card> deck): 
Shuffles the cards in the deck.

### Deck.drawCard(): 
Draws a card from the top of the deck.

### Deck.emptyDeck(): 
Removes all cards from the deck.

### Deck.compareCard():
Draws two random cards and compares their ranks.

### Deck.sameCard():
Draws two random cards and checks if they are the same.

### Deck.findCard():
Finds a card in the deck based on the provided rank and suit.

### Deck.dealCard(Vector<Card> deck):
Deals cards evenly among a specified number of players.

### Card(int rank, String suit): 
Constructor for the Card class. Initializes the rank and suit of the card.

### Card.getRank():
Retrieves the rank of the card.

### Card.getSuit():
Retrieves the suit of the card.

### Card.toString(): 
Converts the card object to a string representation.

# Assignment 7: 

## Part 1 - Rational Number Calculator

This Java program performs various operations on rational numbers, including addition, subtraction, multiplication, division, comparison, conversion to float, and finding the absolute value.

### File Structure

- `Rational.java`: Defines the `Rational` class, which represents rational numbers and provides methods for performing operations on them.
- `rationalNumber.java`: Contains the `main` method and the menu-driven interface for interacting with the `Rational` class.

### Rational Class

The `Rational` class provides the following methods:

- `addition()`: Performs addition of two rational numbers.
- `subtraction()`: Performs subtraction of two rational numbers.
- `multiplication()`: Performs multiplication of two rational numbers.
- `division()`: Performs division of two rational numbers.
- `compare()`: Compares two rational numbers.
- `convert()`: Converts a rational number to a floating-point number.
- `absolute()`: Finds the absolute value of a rational number.
- `reduceFraction()`: Reduces a fraction to its simplest form.
- `gcd()`: Computes the greatest common divisor (GCD) of two numbers.

### Usage

To run the program, compile the `rationalNumber.java` file using the Java compiler and execute the `rationalNumber` class.


## Part 2 - Factorial Calculator
This repository contains a Java program that calculates the factorial of a number entered by the user. It demonstrates exception handling using a custom exception class.

### File Structure
- `FactorialException.java`: Defines a custom exception class `FactorialException` that is thrown when the input number is not between 0 and 15.
- `Demo.java`: Contains the main class `Demo`, which allows the user to input a number and calculates its factorial, handling exceptions accordingly.
### Usage
To run the program, compile both Java files using `javac` command and execute the `Demo` class.

Follow the on-screen prompts to input a number. Enter `exit` to quit the program.

## Part 3 - NOMATCHEXCP

This repository contains a Java program that demonstrates the use of a custom exception class (`NOMATCHEXCP`) to handle cases where user input does not match a predefined value.

### Overview

The program consists of two Java files:
- `NOMATCHEXCP.java`: Defines the custom exception class `NOMATCHEXCP`, which is thrown when the user input does not match the expected value ('India').
- `Test.java`: Contains the main class `Test`, which prompts the user to enter a string and throws the custom exception if the input does not match 'India'.

### Usage

To run the program:
1. Compile both Java files using `javac` command:
2. Execute the `Test` class:
3. Follow the on-screen prompts to enter a string. If the input does not match 'India', the custom exception will be thrown with the appropriate error message.

### Custom Exception

The `NOMATCHEXCP` class extends the `Exception` class and provides a constructor to include the line number and the erroneous input string in the error message.

### File Structure

- `NOMATCHEXCP.java`: Defines the `NOMATCHEXCP` class.
- `Test.java`: Contains the main class `Test`.


