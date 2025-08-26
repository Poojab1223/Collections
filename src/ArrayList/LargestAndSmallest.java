package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,100,8,9,-3));
		Integer smallest = list.get(0);
		Integer largest = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) > largest) {
				largest = list.get(i);
			}
			else if(list.get(i) < smallest) {
				smallest = list.get(i);
			}
		}
		System.out.println("largest = "+largest);
		System.out.println("smallest = "+ smallest);
	}

}
