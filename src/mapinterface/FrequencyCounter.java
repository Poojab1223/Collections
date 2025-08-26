package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < sentence.length(); i++) {
			if(map.containsKey(sentence.charAt(i))) {
				map.put(sentence.charAt(i), map.getOrDefault(sentence.charAt(i), 0)+1);
			}
			else
				map.put(sentence.charAt(i), 1);
		}
		System.out.println(map);
	}

}
