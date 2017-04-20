package lambda.training;

public class Person {

	private int age;
	private String firstName;
	private String lastName;
	
	public Person(){
		
	}
	
	public Person(final int age, final String firstName, final String lastName){
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person{" + "age=" + age + ", firstname=" + firstName + ", lastname=" +lastName + "}";
	}

}
