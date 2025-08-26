package SetInterface;

import java.util.HashSet;

public class PersonMainClass {
	public static void main(String[] args) {
		HashSet<Person> personset = new HashSet<>();
		personset.add(new Person("Alice", 30));
		personset.add(new Person("Bob",20));
		
		Person p = new Person();
		boolean result = p.checkPerson(new Person("Alice", 30), personset);
		System.out.println(result);
 	}

}
