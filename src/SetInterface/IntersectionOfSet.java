package SetInterface;

import java.util.*;

public class IntersectionOfSet {
	 // Generic method: works for any Set type
    public static  Set<Integer> intersectAll(List<Set<Integer>> sets) {
       

        // Start with a copy of the first set
        Set<Integer> intersection = new HashSet<>(sets.get(0));

        // Intersect with remaining sets
        for (int i = 1; i < sets.size(); i++) {
            intersection.retainAll(sets.get(i));
        }

        return intersection;
    }

    public static void main(String[] args) {
        // Example input
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> listOfSets = Arrays.asList(set1, set2, set3);

        System.out.println("Intersection (HashSet): " + intersectAll(listOfSets));

        // Try with LinkedHashSet (preserves insertion order)
        Set<Integer> linked1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> linked2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> linked3 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> linkedListOfSets = Arrays.asList(linked1, linked2, linked3);
        System.out.println("Intersection (LinkedHashSet): " + intersectAll(linkedListOfSets));

        // Try with TreeSet (sorted order)
        Set<Integer> tree1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> tree2 = new TreeSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> tree3 = new TreeSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> treeListOfSets = Arrays.asList(tree1, tree2, tree3);
        System.out.println("Intersection (TreeSet): " + intersectAll(treeListOfSets));
    }

}
