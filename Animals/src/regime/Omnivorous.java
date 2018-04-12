package regime;
import food.Food;

public class Omnivorous extends abstractRegime {
	
	public Omnivorous() {
		super();
	}

	public void eat(Food food) {
		System.out.println("I eat both meat and grass");
	}

}
