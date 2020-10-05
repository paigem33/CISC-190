// Write a complete program whose class name is Hello and that displays Hello, world on the screen.

public class Hello 
{
	public static void main(String[] args)
	{
		System.out.println("Hello, world");
	}
}

// Declare two integer variables named profitStartOfQuarter and cashFlowEndOfYear.

int profitStartOfQuarter;
int cashFlowEndOfYear;

// Declare a double variable named netWeight.

double netWeight;

// Declare a variable isACustomer suitable for representing a true or false value.

boolean isACustomer;

// Declare a character variable named c.

char c;

// Given two integer variables oldRecord and newRecord, write a statement that gives newRecord the same value that oldRecord has.

newRecord = oldRecord;

// Declare a variable hasPassedTest, and initialize it to true.

boolean hasPassedTest = true;

// Declare a variable temperature and initialize it to 98.6.

double temperature = 98.6;

// Write an expression that computes the sum of two variables verbalScore and mathScore (already declared and assigned values).

verbalScore + mathScore

// Given the variable pricePerCase, write an expression corresponding to the price of a dozen cases.

pricePerCase * 12

// Write an expression that computes the sum of two double variables total1 and total2, which have been already declared and assigned values.

total1 + total2

// You are given two double variables, already declared and assigned values, named totalWeight, containing the weight of a shipment, and weightOfBox, containing the weight of the box in which a product is shipped. Write an expression that calculates the net weight of the product.

totalWeight - weightOfBox

// You are given two variables, already declared and assigned values, one of type double, named totalWeight, containing the weight of a shipment, and the other of type int, named quantity, containing the number of items in the shipment. Write an expression that calculates the weight of one item.

totalWeight / quantity

// The dimensions (width and length) of room1 have been read into two variables: width1 and length1. The dimensions of room2 have been read into two other variables: width2 and length2. Write a single expression whose value is the total area of the two rooms.

(width1 * length1) + (width2 * length2)

// Given an integer variable bridgePlayers, write a statement that increases the value of that variable by 4.

bridgePlayers = bridgePlayers + 4;

// Given two integer variables distance and speed, write an expression that divides distance by speed using floating point arithmetic, i.e. a fractional result should be produced.

(double) distance / speed

// Calculate the average (as a double) of the values contained in the integer variables num1, num2, num3 and assign that average to the double variable avg.
// Assume the variables num1, num2, and num3 have been declared and assigned values, and the variable avg declared.

avg = ( (double) num1 + (double) num2 + (double) num3) / 3;

// Declare an integer constant, MONTHS_IN_YEAR, whose value is 12.

(double) distance / speed

// Declare a constant MONTHS_IN_DECADE, whose value is the value of the constant MONTHS_IN_YEAR (already declared) multiplied by 10.

final int MONTHS_IN_DECADE = MONTHS_IN_YEAR * 10;

// Write a String constant consisting of exactly 5 exclamation marks.

"!!!!!"

// Given an int variable datum that has already been declared, write a few statements that read an integer value from standard input into this variable.

Scanner myScanner = new Scanner(System.in);
datum = myScanner.nextInt();

// Given a String variable named line1 and given a Scanner reference variable stdin that has been assigned a reference to a Scanner object, read the next line from stdin and save it in line1. (Do not concern yourself with any possible exceptions here-- assume they are handled elsewhere.)

line1 = stdin.nextLine();

// word game

import java.util.Scanner; // Needed for the Scanner class

/**
 * This program demonstrates a solution to the Word Game programming challenge.
 */
public class WordGame {

    public static void main(String[] args) {
        //Declare all variables as Strings
        String name;

                String age;

                 String city;

                 String college;

                 String profession;

                 String animal;

                 String petName;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's name.
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        // Get the user's age.
        System.out.println("Enter your age: ");
        age = keyboard.nextLine();
        
        // Get the name of a city.
        System.out.println("Enter the name of a city: ");
        city = keyboard.nextLine();


         // Get the name of a college.
         System.out.println("Enter the name of a college: ");

          college = keyboard.nextLine();

        
        
          // Get a profession.
          System.out.println("Enter profession: ");
          profession = keyboard.nextLine();
        
          // Get a type of animal.
          System.out.println("Enter a type of animal: ");
          animal = keyboard.nextLine();
        
          // Get a pet name
          System.out.println("Enter a pet name: ");
          petName = keyboard.nextLine();

          /* Use System.out.println to display the "story." 
          Follow the spacing and punctuation from the   
          example output.
          */
        
       System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", "+ name +" went to college at "+ college +". "+ name +" graduated and went to work as a "+ profession +". Then, "+ name +" adopted a(n) "+ animal +"  named " + petName + " They both lived happily ever after!");

 
    }
}