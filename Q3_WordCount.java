import java.util.HashMap;
import java.util.Map;

public class Q3_WordCount {
    
    public static int countWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");
        
        // Creating a HashMap to store words and their counts
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            // If word is already present in the map, increment its count
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap.size();
    }
    
    public static void main(String[] args) {
        String inputString = "Java is a programming language Java is widely used for developing applications";
        int wordCount = countWords(inputString);
        
        System.out.println("Number of words in the string: " + wordCount);
    }
}
