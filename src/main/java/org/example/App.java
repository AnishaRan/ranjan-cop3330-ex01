package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();

        String outputString = generateOutputString(name);
        //String outputString = "Hello, " + name + ", nice to meet you!";
        if(outputString.equals("Hello, Brian, nice to meet you!")) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
        }


    }
    private static String generateOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
}

