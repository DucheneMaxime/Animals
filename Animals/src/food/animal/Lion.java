package food.animal;
import food.Food;
import regime.Carnivorous;

public class Lion extends Animal {
	
	public Lion(int age, double weight, double height) {
		super(age, weight, height, "lion");
		this.regime = new Carnivorous();
	}
	

	public void eat(Food food) {
		super.getRegime().eat(food);
	}

}
