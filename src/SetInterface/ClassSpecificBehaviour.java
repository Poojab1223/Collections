package SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ClassSpecificBehaviour {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 5, 1, 2));
		System.out.println(getHashSetFormat(list));
		System.out.println(getLinkedHashsetFormat(list));
		System.out.println(getTreeSetFormat(list));
	}

	private static TreeSet<Integer> getTreeSetFormat(List<Integer> list) {
		return new TreeSet<>(list);	
	}

	private static LinkedHashSet<Integer> getLinkedHashsetFormat(List<Integer> list) {
		return new LinkedHashSet<>(list) ;
	}

	private static TreeSet<Integer> getHashSetFormat(List<Integer> list) {
	 return	new TreeSet<>(list);	
	}

}
