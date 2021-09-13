package org.example;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan1.nextInt();

        try {
            if (age<0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        String msg =  (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(msg);
    }
}
