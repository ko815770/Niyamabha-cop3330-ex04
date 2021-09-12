package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        String noun, verb, adjective, adverb;
        System.out.println("Enter a noun");
        Scanner input = new Scanner(System.in);
        noun = input.nextLine();
        System.out.println("Enter a verb");
        verb = input.nextLine();
        System.out.println("Enter an adjective");
        adjective = input.nextLine();
        System.out.println("Enter an adverb");
        adverb = input.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?" + " That's hilarious!");
    }
}
