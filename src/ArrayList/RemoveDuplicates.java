package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,4,7));
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}

}
