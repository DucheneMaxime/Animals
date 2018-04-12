package food.animal;
import food.Food;
import regime.Carnivorous;

public class Hyena extends Animal{

	//La hyène est un Animal avec un regime
	public Hyena(int age, double weight, double height) {
		super(age, weight, height, "hyena");
		this.regime = new Carnivorous();
	}
	

	public void eat(Food food) {
		super.getRegime().eat(food);
	}

}
