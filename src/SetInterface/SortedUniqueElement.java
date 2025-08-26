package SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortedUniqueElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 4, 7, 8, 5));
		System.out.println(getSortedUnique(list));
		
	}

	private static TreeSet<Integer> getSortedUnique(List<Integer> list) {
		return new TreeSet<>(list);
	}

}
