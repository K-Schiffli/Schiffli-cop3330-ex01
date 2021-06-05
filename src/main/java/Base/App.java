/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String name = getName();
        String greeting = concatGreeting(name);
        printGreeting(greeting);
    }
    public static String getName()
    {
        System.out.println( "Please enter your name:" );
        return in.nextLine();
    }

    public static String concatGreeting(String inputName)
    {
        return "Hello, " + inputName +", nice to meet you!";
    }

    public static void printGreeting(String greeting)
    {
        System.out.println( greeting );
    }
}
