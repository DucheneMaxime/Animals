package regime;

import animal.Animal;
import food.Food;

public abstract class abstractRegime extends Animal {
	private String regime;

	public abstractRegime() {
		super();
		this.regime=regime;
	}

	public abstract void eat(Food food);
	
	public String eat() {
		return "I eat several things";
	}
}
