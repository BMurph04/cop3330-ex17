/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //input, while loop ensures input is numeric
        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        while(input.hasNextDouble()) {

            //input
            double gender = input.nextDouble();

            System.out.println("How many ounces of alcohol did you have?");
            double ounces = input.nextDouble();

            System.out.println("What is your weight, in pounds?");
            double weight = input.nextDouble();

            System.out.println("How many hours has it been since your last drink?");
            double hoursSince = input.nextDouble();

            //defines alcohol distribution ratio based on gender
            double ratio;
            if (gender == 1) {
                ratio = 0.73;
            } else if (gender == 2) {
                ratio = 0.66;
            } else {
                System.out.println("Error in calculation. Please check your inputs.");
                return;
            }
            //BAC calculation
            double bloodAlcoholCalc = (ounces * 5.14 / weight * ratio) - (0.015 * hoursSince);

            //output
            System.out.printf("Your BAC is %.6f.\n", bloodAlcoholCalc);
            if(bloodAlcoholCalc < 0.08){
                System.out.println("It is legal for you to drive.");
            }
            else{
                System.out.println("It is not legal for you to drive.");
            }
            return;
        }
        System.out.println("You have entered a non-numeric input. Please only enter numeric inputs.");
    }
}
