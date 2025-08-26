package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,4,7));
		int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        System.out.println(list);
	}
}
