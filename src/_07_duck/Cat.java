package _07_duck;

public class Cat {
	int numberOfFriends;
	String favoriteFood;
	
	
	
	public Cat(String favoriteFood, int numberOfFriends)
	{
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	
	
	
	void Meow()
	{
		System.out.println("Meow");
	}
	
	
	
	void Pur()
	{
		System.out.println("Purrrrrr");
	}
}
