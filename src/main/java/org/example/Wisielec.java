package org.example;

import java.sql.Array;
import java.util.*;


public class Wisielec {

   static List<String> words = List.of("rower", "samochód", "łódź", "samolot");


    static char[] userword;
    static String word;
   
    public static void play() {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        word = words.get(random.nextInt(words.size()));
        userword = new char[word.length()];

        Arrays.fill(userword, '_');
        System.out.println(userword);

        while (!gameEnded()) {
            System.out.println(userword);
            System.out.println();
            System.out.println("Podaj kolejną literę: ");

            char letter = scanner.nextLine().charAt(0);

            checkLetter(letter);
        }

        scanner.close();

    }

    private static void checkLetter(char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                userword[i] = letter;
            }
        }
    }


    private static boolean gameEnded() {
        return false;

    }


}
