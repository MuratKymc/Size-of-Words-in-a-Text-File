package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> words = new HashMap<>();
        ArrayList<String> sizeOfWords = new ArrayList<>();

        ReadFile.countWords("lyrics.txt",words,sizeOfWords);

    }
}
