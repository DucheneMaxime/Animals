package animal.regime;
import animal.Animal;
import food.Food;

public abstract class Carnivorous extends Animal{
	
	public Carnivorous(int age, double weight, double height) {
		super(age, weight, height);
	}

	public void eat(Food food) {
		System.out.println("I eat meat : "+food.toString());
	}
}
