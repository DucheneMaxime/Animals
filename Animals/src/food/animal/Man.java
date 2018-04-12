package food.animal;

import food.Food;
import regime.Omnivorous;

public class Man extends Animal {

	public Man(int age, double weight, double height) {
		super(age, weight, height, "Man");
		this.regime = new Omnivorous();
	}

	public void eat(Food food) {
		super.getRegime().eat(food);
	}
}