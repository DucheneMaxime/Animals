package food.animal;
import food.Food;
import regime.Herbivorous;

public class Rabbit extends Animal {
	
	public Rabbit() {
		super(0, 0.0, 0.0, "rabbit");
	}
	
	public Rabbit(int age, double weight, double height) {
		super(age, weight, height, "rabbit");
		this.regime = new Herbivorous();
	}

	public void eat(Food food) {
		super.getRegime().eat(food);
	}

}
