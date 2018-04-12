package test;
import food.animal.Hyena;
import food.animal.Lion;
import food.animal.Man;
import food.animal.Rabbit;

public class TestHeritage {

	public static void main(String[] args) {
		Lion l = new Lion(12, 80.5, 1.20);
		System.out.println(l.toString());
		Rabbit r = new Rabbit(2, 5.5, 0.2);
		System.out.println(r.toString());
		Hyena h = new Hyena(14, 36.7, 0.98);
		System.out.println(h.toString());
		Man m = new Man(23, 55, 1.73);
		System.out.println(m.toString());
		Rabbit r2 = new Rabbit(3, 10.5, 0.26);
		System.out.println(r2.toString());
	}

}
