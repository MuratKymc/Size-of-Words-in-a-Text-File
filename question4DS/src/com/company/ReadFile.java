package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadFile {

    public static void countWords(String fileName, HashMap<String, Integer> wordsOfLyrics, ArrayList<String> wordsOneTime) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String sentence = reader.readLine();

            while (sentence != null) {

                String[] words = sentence.toLowerCase().split(" ");

                sentence = reader.readLine();

                for (String word : words) {

                    if (wordsOfLyrics.containsKey(word)) {
                        wordsOfLyrics.put(word, wordsOfLyrics.get(word) + 1);

                    } else {
                        wordsOfLyrics.put(word, 1);
                        wordsOneTime.add(word);
                    }
                }
            }

            System.out.println("Word size : " + wordsOneTime.size());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
