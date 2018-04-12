package food.animal;

import food.Food;
import regime.Omnivorous;

public class Man extends Animal {

	//L'homme est un Animal avec un regime
	public Man(int age, double weight, double height) {
		super(age, weight, height, "man");
		this.regime = new Omnivorous();
	}

	public void eat(Food food) {
		super.getRegime().eat(food);
	}
}
