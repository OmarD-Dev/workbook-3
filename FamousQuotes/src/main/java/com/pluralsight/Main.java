package com.pluralsight;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Select a number between 1-10");
            int value = scanner.nextInt() - 1;

            String[] quotes = {
                    "I'm not superstitious, but I am a little stitious.",
                    "Ravioli ravioli, give me the formuoli.",
                    "That's an oval. It has to be a circle !",
                    "When you change your thoughts, remember to also change your world.",
                    "Success is not final; failure is not fatal: It is the courage to continue that counts.",
                    "Don’t let yesterday take up too much of today",
                    "To know how much there is to know is the beginning of learning to live",
                    "He who conquers himself is the mightiest warrior.",
                    "I'm not gonna die, partner",
                    "I Feel Like My Life Is Just A Series Of Unrelated Wacky Adventures."
            };

            try {
                System.out.println(quotes[value]);
                String anotherQuote =scanner.nextLine();
                if (anotherQuote.equalsIgnoreCase("yes")){

                }else {
                    done = true;
                }
            } catch (Exception e) {
                System.out.println("Bad stuff happened!!!");
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
    public static int getInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        int scannedInt = 0;
        boolean finished = false;

        while (!done){
            scannedInt = scanner.nextInt();

        }

    }
}

