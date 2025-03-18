/*
 Write a program to create a custom exception class InvalidAgeException.
• The exception should be thrown if the user's age is less than 18.
• Test the exception by taking the user's age as input.
 */

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class question4 {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age! You must be 18 or older.");
        } else {
            System.out.println("Valid Age. You are allowed.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        try
        {
            checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();

    }
}