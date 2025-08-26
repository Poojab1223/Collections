package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayList {
	public static void rotate(ArrayList<Integer> list, int k) {
        int n = list.size();
        k = k % n; // handle if k > n

        // Step 1: Reverse whole list
        reverse(list, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(list, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(list, k, n - 1);
    }

    private static void reverse(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 4;

        rotate(list, k);

        System.out.println("Rotated List: " + list);
    }

}
