package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequecyOfEachWord {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Convert to lowercase and split by non-word characters
        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
