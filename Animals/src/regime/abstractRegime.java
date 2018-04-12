package regime;

import food.Food;
import food.Meat;
import food.Vegetables;
import food.animal.Animal;
import food.animal.Rabbit;

public abstract class abstractRegime extends Animal {
	public Food food;

	public abstractRegime(String regime) {
		super();
		switch(regime) {
		case("herbivorous"):
			this.food = new Vegetables();
		break;
		case("carnivorous"):
			this.food = new Meat();
		break;
		case("omnivorous"):
			this.food = new Rabbit();
		}
	}

	public abstract String eat();
}
