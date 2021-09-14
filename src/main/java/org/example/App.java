/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is you weight: " );
        double weight = sc.nextDouble();

        System.out.println( "What is you height: " );
        double height = sc.nextDouble();

        double bmi = (weight / (height * height)) *703;

        if(bmi < 18.5){
            System.out.println( "You are underweight. You should see your doctor");
        }
        else if(bmi > 25){
            System.out.println( "You are overweight. You should see your doctor");
        }
        else{
            System.out.println( "You are within the ideal weight range.");
        }
    }
}
