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

