package Q1;
//1. Count occurrences of each word in a line/file
import java.util.HashMap;
import java.util.Map;

public class Count {

    public static void main(String[] args) {
        String line = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare  Hare Rama Hare Rama Rama Rama Hare Hare";
        Map<String, Integer> wordCountMap = countWords(line);
        
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String line) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = line.split(" ");
        
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}
