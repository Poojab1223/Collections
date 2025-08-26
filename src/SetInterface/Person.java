package SetInterface;

import java.util.HashSet;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}  
	
	public boolean checkPerson(Person person,HashSet<Person> set) {
		for (Person existing : set) {
            if (Objects.equals(existing.getName(), person.getName())
                && existing.getAge() == person.getAge()) {
                return true;
            }
        }
        return false;
	}
}
