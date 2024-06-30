import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class wordCounter {

    public static void countWordOccurrences(String text) {
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        StringTokenizer tokenizer = new StringTokenizer(text, " ,.;:!?\"'()\n\t");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "This is a sample text. This text has some repeated words. This is just a sample text.";
        
        countWordOccurrences(text);
    }
}