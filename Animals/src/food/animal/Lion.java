package food.animal;
import food.Food;
import regime.Carnivorous;

public class Lion extends Animal {

	//Le Lion est un Animal avec un regime
	public Lion(int age, double weight, double height) {
		super(age, weight, height, "lion");
		this.regime = new Carnivorous();
	}
	

	public void eat(Food food) {
		super.getRegime().eat(food);
	}

}
