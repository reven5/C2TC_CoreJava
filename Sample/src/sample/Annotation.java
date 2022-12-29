package sample;

class Animal{
	void eat() {
		System.out.println("Eat");
	}
}
class Dog extends Animal{
	void Eat() {
		System.out.println("Eating Food");
	}
}
public class Annotation {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();

	}

}
