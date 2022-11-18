package _07_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck duck = new Duck("donuts",5);
		Cat cat = new Cat("chicken", 2);
		
		duck.Quack();
		duck.Waddle();
		
		cat.Meow();
		cat.Pur();
	}
}
