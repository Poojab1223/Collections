package MapInterface;

import java.util.*;

public class MapIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Count frequency of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check arr2 elements against map
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1); // decrease count to avoid duplicates
            }
        }

        System.out.println("Intersection: " + intersection);
    }

}
