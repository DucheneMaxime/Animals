package food;

public class Food {
	private String name;
	private String color;
	
	public Food(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	public Food() {
		this("Nothing", "none");
	}
	
	public String toString() {
		return this.color+" "+this.name;
	}

}
