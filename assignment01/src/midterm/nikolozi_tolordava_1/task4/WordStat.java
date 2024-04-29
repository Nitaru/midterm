package midterm.nikolozi_tolordava_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        // Use the fantasyFormatData list as needed
    }

    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Set of all different words
        Set<String> wordSet = new HashSet<>(fantasyFormatData);

        // Print set of all different words
        System.out.println("Set of all different words:");
        System.out.println(wordSet);

        // Create map with word length as key and count as value
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print map with word length and count
        System.out.println("\nMap with word length and count:");
        System.out.println(wordLengthMap);

        // Write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("task4.txt", true))) {
            writer.println("\nSet of all different words:");
            writer.println(wordSet);
            writer.println("\nMap with word length and count:");
            writer.println(wordLengthMap);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
