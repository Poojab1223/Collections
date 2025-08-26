package SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MaintainInsertion {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
		System.out.println(removeDuplicates(list));
	}

	private static LinkedHashSet<String> removeDuplicates(ArrayList<String> list) {
		return new LinkedHashSet<>(list);
		
	}
}
