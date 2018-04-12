package food.animal;
import food.Food;
import regime.abstractRegime;

public abstract class Animal extends Food {
	private int age;
	private double weight;
	private double height;
	protected abstractRegime regime;
	private String name;
	
	public Animal() {
		this(0, 0.0, 0.0, "");
	}
	
	public Animal(int age, double weight, double height, String name) {
		this.age=age;
		this.weight=weight;
		this.height=height;
		this.name=name;
	}

	public abstract void eat(Food food);
	
	public void move() {
		System.out.println("I'm moving");
	}

	public abstractRegime getRegime() {
		return this.regime;
	}
	
	public String toString() {
		String res = "I am a ";
		res+=this.name;
		res+=", and ";
		res+=getRegime().eat();
		res+=". I weight "+this.weight+"kg and my size is "+this.height+"m.";
		return res;
	}
}
