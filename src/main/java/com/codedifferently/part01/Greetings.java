package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        if (name.equalsIgnoreCase("Hakim") || name.equalsIgnoreCase("Rasheeda")){
            System.out.println("Welcome to Java " + name);
        } else {
            System.out.println("You do not belong here");
        }
    }
}
