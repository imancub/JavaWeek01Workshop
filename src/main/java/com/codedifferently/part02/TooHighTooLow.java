package com.codedifferently.part02;

import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer mysteryNumber = 5;
        System.out.println("Guess a number between 1 and 10: ");
        Integer guessedNumber = input.nextInt();
        Integer counter = 0;
        do {
            if (guessedNumber < mysteryNumber) {
                System.out.println("Your guess is too low, try again.");
                counter++;
                guessedNumber = input.nextInt();
            }
            if (guessedNumber > mysteryNumber) {
                System.out.println("Your guess is too high, try again");
                counter++;
                guessedNumber = input.nextInt();
            }
        } while (guessedNumber != mysteryNumber);

            System.out.println("That's the correct guess, after " + counter + " tries");
    }

}
