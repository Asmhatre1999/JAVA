// Kids laptop program using scanner and ask user what operation to perform and take input numbers from user


import java.util.Scanner;

public class ScannerLaptopDemo {
    
    static int input;  // Declare a static variable to store the user input 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   // Create Scanner
        
        
        // Display  options to the user and take the input until user selects  quit

        do {
            System.out.println("Enter Option: \nAdd - 1\nSubtract - 2\nMultiply - 3\nEven / Odd Number - 4\nQuit - 5");

            input = sc.nextInt();           // taking user input

            switch (input) {

                case 1:   // Addition
                    
                    System.out.println("Enter two numbers to be added: \n");   // Ask for two numbers as input
                    double num1 = Double.parseDouble(sc.next());
                    double num2 = Double.parseDouble(sc.next());
                    System.out.println("The result is " + (num1 + num2));
                    break;

                case 2:   // Subtraction 
                    
                    System.out.println("Enter two numbers to be subtracted: \n");  // Ask for two numbers as input
                    num1 = Double.parseDouble(sc.next());
                    num2 = Double.parseDouble(sc.next());
                    System.out.println("The result is " + (num1 - num2));
                    break;

                case 3:   // Multiply
                    
                    System.out.println("Enter two numbers to be multiplied: \n");   // Ask for two numbers as input
                    num1 = Double.parseDouble(sc.next());
                    num2 = Double.parseDouble(sc.next());
                    System.out.println("The result is " + (num1 * num2));
                    break;

                case 4:  //Odd or Even
                    
                    System.out.println("Enter a number: \n");
                    double num = Double.parseDouble(sc.next());    // Ask for number as input
                    if (num % 2 == 0) {
                        System.out.println("The result is even.");
                    } else {
                        System.out.println("The result is odd.");
                    }
                    break;

                case 5:        // Quit the program
                    
                    System.out.println("You have quit! See you again!!");
                    break;

                default:      // Throw an exception with an error message foe invalid entry
                    
                    throw new IllegalArgumentException("Unexpected value: " + input);  
            }
        }  while (input != 5); // Continue until the user chooses to Quit
    }
}