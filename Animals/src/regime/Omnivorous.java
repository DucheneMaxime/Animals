package regime;
import food.Food;

public class Omnivorous extends abstractRegime {
	
	public Omnivorous() {
		super("omnivorous");
	}

	public void eat(Food food) {
		System.out.println("I eat both meat and grass");
	}

	//On print ce que mange un omnivore
	public String eat() {
		return "I eat everything";
	}

}
