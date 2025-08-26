package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) continue; 

            boolean isDuplicate = false;

            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                	arrayList.set(j, null); 
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
	}

}
