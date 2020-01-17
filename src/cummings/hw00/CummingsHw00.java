/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cummings.hw00;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author forrest.cummings
 */
public class CummingsHw00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        // TODO code application logic here
        String[] menu = new String[3];
        menu[0] = "shrimp";
        menu[1] = "tacos";
        menu[2] = "sushi";

        String mealChosen = menu[rand.nextInt(3)];
        System.out.println("The secret meal must be chosen");
        guessMeal(mealChosen, null);

    }

    public static void guessMeal(String correctMeal, String duplicateDetect) {
        Scanner scan = new Scanner(System.in);

        String mealGuessed = scan.nextLine();

        
        if (Objects.equals(mealGuessed, correctMeal)) {
            System.out.println("Correct! Enjoy your " + correctMeal);
        } else {
            System.out.println("Nope!");
            if (Objects.equals(mealGuessed, duplicateDetect)) {
                System.out.print(" You guessed that already! You lose.");
            } else {
                duplicateDetect = mealGuessed;

                guessMeal(correctMeal,duplicateDetect);
            }
        }
    }
}
