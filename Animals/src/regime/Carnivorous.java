package regime;
import food.Food;

public class Carnivorous extends abstractRegime{
	
	public Carnivorous() {
		super("carnivorous");
	}

	public String eat() {
		return this.food.toString();
	}

	public void eat(Food food) {
		
	}
}
