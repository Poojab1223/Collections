package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,8,9));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8,77,10,7,9,2,1));
		
		ArrayList<Integer> result = new ArrayList<>();
		list1.addAll(list2);
		for(Integer i: list1) {
			if(!result.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
	}

}
