package com.guesstheword;

import java.util.Scanner;

/**
 * @author grisha_angelov
 */
public class GuessGame {
    public static void main(String[] args) {
        GuessTheWordEngine guessTheWordEngine = new GuessTheWordEngine("programmer");
        Scanner inputReader = new Scanner(System.in);
        while (guessTheWordEngine.getCurrentWordStatus().contains("-")){
            System.out.print("Enter Letter: ");
            String input = inputReader.nextLine();
            System.out.println("Result: " + guessTheWordEngine.guessLetter(input));
        }
        System.out.println("You Won!");
    }
}
