package animal;
import food.Food;

public abstract class Animal {
	private int age;
	private double weight;
	private double height;
	
	public Animal() {
		this(0, 0.0, 0.0);
	}
	
	public Animal(int age, double weight, double height) {
		this.age=age;
		this.weight=weight;
		this.height=height;
	}

	public abstract void eat(Food food);
	
	void move() {
		System.out.println("I'm moving");
	}
}
