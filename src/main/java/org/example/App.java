/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Anisha Ranjan
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        String output = "Hello, " + name + ", nice to meet you!";

        System.out.print(output);



    }

}

