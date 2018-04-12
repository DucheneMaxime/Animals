package animal.regime;
import animal.Animal;
import food.Food;

public abstract class Herbivorous extends Animal {
	
	public Herbivorous(int age, double weight, double height) {
		super(age, weight, height);
	}
	
	public void eat(Food food) {
		System.out.println("I eat vegetables : "+food.toString());
	}
}
