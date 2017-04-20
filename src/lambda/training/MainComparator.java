package lambda.training;

import java.util.Arrays;
import java.util.function.Function;

public class MainComparator {

	public static void main(String... args) {

		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge(); 
		Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
//		Function<Person, Integer> f1 = p -> p.getAge();
//		Function<Person, String> f2 = p -> p.getFirstName();
//		Function<Person, String> f3 = p -> p.getLastName();
		
//		Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
//		Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);
//		Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);
//		
//		Comparator<Person> cmp = cmpPersonAge.thenComparing(cmpFirstName).thenComparing(cmpLastName);
		
		Comparator<Person> cmpFinal = Comparator.comparing(Person::getAge)
				.thenComparing(Person::getFirstName)
				.thenComparing(Person::getLastName);		
		
//		Person p1 = new Person(1, "one name", "one surname");
//		Person p2 = new Person(2, "two name", "two surname");
//		Person p3 = new Person(3, "three name", "three surname");
//		
//		Object[] personArr = new Object[]{p1, p2, p3};
//		Arrays.sort(personArr, cmpFinal);
	}

}
