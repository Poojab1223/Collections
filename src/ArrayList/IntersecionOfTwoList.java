package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersecionOfTwoList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,8,9));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8,77,10,7,9,2,1));
		for(int i = 0; i < list1.size(); i++ ) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j))){
					System.out.print(list1.get(i)+" ");
				}
						
			}
		}
	}

}
