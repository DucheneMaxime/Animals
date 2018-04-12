package regime;
import food.Food;

public class Carnivorous extends abstractRegime{
	
	public Carnivorous() {
		super();
	}

	public void eat(Food food) {
		System.out.println("I eat meat : "+food.toString());
	}
}
