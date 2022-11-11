package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat meowy = new Cat("Meowy");
		
		meowy.meow();
		
		meowy.printName();
		
		for (int i = 0; i < 10; i++)
		{
			meowy.kill();
		}
	}
}
