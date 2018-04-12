package regime;
import food.Food;

public class Herbivorous extends abstractRegime {
	
	public Herbivorous() {
		super();
	}
	
	public void eat(Food food) {
		System.out.println("I eat vegetables : "+food.toString());
	}
}
