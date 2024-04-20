import java.util.HashMap;
import java.util.Map;

public class MostOccurringWordsFinder {
    public static void main(String[] args) {
        String largeString = "This is a large string with some words. This string contains repeated words like is, a, and some.";

        Map<String, Integer> wordFrequencyMap = findMostOccurringWords(largeString);

        System.out.println("Most occurring words:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> findMostOccurringWords(String text) {
        // Remove punctuation marks and split the text into words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Iterate through the words and keep track of word frequencies
        for (String word : words) {
            // Increment frequency for existing word or insert new word with frequency 1
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : wordFrequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Create a new HashMap to store the most occurring words
        Map<String, Integer> mostOccurringWordsMap = new HashMap<>();

        // Find words with maximum frequency
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostOccurringWordsMap.put(entry.getKey(), entry.getValue());
            }
        }

        return mostOccurringWordsMap;
    }
}
