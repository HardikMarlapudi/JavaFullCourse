
public class Human {
	
	String name;
	int age;
	int year;
	double weight;
	
	Human(String name, int age, int year) {
		
		this.name = name;
		this.age = age;
		this.year = year;
		this.weight = weight;

	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
}
