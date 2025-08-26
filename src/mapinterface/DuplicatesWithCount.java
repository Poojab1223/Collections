package MapInterface;

import java.util.*;

public class DuplicatesWithCount {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 4, 7, 8, 5, 4};

		// Create a HashMap to store counts
		HashMap<Integer, Integer> countMap = new HashMap<>();

		// Count occurrences
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		// Print duplicates
		System.out.println("Duplicate elements with counts:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}
}


