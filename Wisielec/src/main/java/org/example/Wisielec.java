package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Wisielec {

    static List <String> words = List.of("rower", "samochód", "łódź", "zwierze");
    public static void play() {
        char [] userword;
        String word;

        System.out.println("Start gry");

        Random random = new Random();

        word = words.get(random.nextInt(words.size()));
        userword = new char[word.length()];

        Arrays.fill(userword, '_');
        System.out.println(userword);

    }
}
