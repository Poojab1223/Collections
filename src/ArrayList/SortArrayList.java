package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,10,8,9));
		sort(list);
		System.out.println(list);
	}

	private static void sort(ArrayList<Integer> list) {
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = i+1; j< list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					int temp = list.get(i);
		            list.set(i, list.get(j));
		            list.set(j, temp);
				}
			}
		}
		
	}

}
