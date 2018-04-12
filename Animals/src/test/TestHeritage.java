package test;
import animal.Lion;
import animal.Rabbit;

public class TestHeritage {

	public static void main(String[] args) {
		Lion l = new Lion(12, 80.5, 1.20);
		System.out.println(l.toString());
		Rabbit r = new Rabbit(2, 5.5, 0.2);
		System.out.println(r.toString());
	}

}
