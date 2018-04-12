package food.animal;
import food.Food;
import regime.Carnivorous;

public class Hyena extends Animal{
	
	public Hyena(int age, double weight, double height) {
		super(age, weight, height, "hyena");
		this.regime = new Carnivorous();
	}
	

	public void eat(Food food) {
		super.getRegime().eat(food);
	}

}
