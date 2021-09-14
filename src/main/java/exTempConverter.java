/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exTempConverter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice: ");
        char chr = sc.next().charAt(0); //To input only a single character

        if(chr == 'C' || chr == 'F' || chr == 'c' || chr == 'f') //Validity check for choice input
        {
            if(chr == 'C' || chr == 'c') //Fahrenheit to Celsius conversion
            {
                System.out.println("Please enter the temperature in Fahrenheit:");
                double f = sc.nextDouble();
                double toC = ((f-32)*5)/9;
                System.out.printf("The temperature in Celsius is %.2f.", toC);
            }
            else if(chr == 'F' || chr == 'f') //Celsius to Fahrenheit conversion
            {
                System.out.println("Please enter the temperature in Celsius");
                double c = sc.nextDouble();
                double toF = ((c*9)/5)+32;
                System.out.printf("The temperature in Fahrenheit is %.2f.", toF);
            }
        }
        else
        {
            System.out.println("Invalid choice.");
        }
    }
}
