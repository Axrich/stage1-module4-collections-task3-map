package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {

            word = word.replaceAll("[,.]", "");

            if (wordRepetitionMap.containsKey(word) ) {
                wordRepetitionMap.put(word, wordRepetitionMap.get(word)+1);
            }
            else if (!word.isEmpty())
            {wordRepetitionMap.put(word,1);}
        }
        return wordRepetitionMap;
    }
}

