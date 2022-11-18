package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	
	
	public Duck(String favoriteFood, int numberOfFriends)
	{
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	
	
	
	void Quack()
	{
		System.out.println("Quack!");
	}
	
	
	
	void Waddle()
	{
		System.out.println("Waddle Waddle");
	}
}
