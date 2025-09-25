package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//1. Create two variables to represent the salary for Bob and Gary, name them
//bobSalary and garySalary. Create a new variable named
//highestSalary. Determine whose salary is greater using Math.max() and
//store the answer in highestSalary.  Set the initial salary variables to any
//value you want. Print the answer (i.e "The highest salary is …")

        double bobSalary = 3_000.0;
        double garySalary= 10_000.0;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is "+ highestSalary);


 //2. Find and display the smallest of two variables named carPrice and
        //truckPrice.  Set the variables to any value you want.
        double carPrice = 3000;
        double truckPrice = 1000;

        double smallestValue = Math.min(carPrice, truckPrice);
        System.out.println("The smallest values is "+ smallestValue);

//Find and display the area of a circle whose radius is 7.25

        double RadiusOfCircle = 7.25;
        double Area = 3.14 * (Math.pow(RadiusOfCircle, 2));

        System.out.println("The area of circle is "+ Area);

 //Find and display the square root a variable after it is set to 5.0
        double VarNum = 5;

        System.out.println("The square root of 5 is "+ Math.sqrt(VarNum));

// Find and display the distance between the points (5, 10) and (85, 50)

        double distance;

        distance = Math.sqrt(Math.pow(85-5, 2)+ Math.pow(50-10, 2));
        System.out.println("Distance is "+ distance);

//Find and display a random number between 0 and 1
        System.out.println("The random number between 0 and 1 is: "+Math.random());


    }
}
