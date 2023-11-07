package org.example;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

		logger.info("Start of Execution");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Enter two numbers:");

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
				logger.info("Start of Add operation");
                result = num1 + num2;
                break;
            case 2:
				logger.info("Start of Subtract operation");
                result = num1 - num2;
                break;
            case 3:
				logger.info("Start of Multiply operation");
                result = num1 * num2;
                break;
            case 4:
				logger.info("Start of Division operation");
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
					logger.error("Invalid input");
                    System.out.println("Error: Division by zero.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Invalid choice");
				logger.warn("Invalid input");
                System.exit(1);
        }

		logger.info("Result: " + result);
        System.out.println("Result: " + result);
    }
}