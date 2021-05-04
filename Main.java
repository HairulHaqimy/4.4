
public class Main {

	public static void main(String[] args) {
		Fruits a = new Apple("Apple", 0.5);
		System.out.println(a);
		System.out.println();
		
		Fruits b = new RedApple("Red Apple", 0.7, "Red", "Sweet");
		System.out.println(b);
		System.out.println();
		
		Fruits c = new GreenApple("Green Apple", 0.6, "Green", "Sour");
		System.out.println(c);
		System.out.println();
		
		Fruits d = new Mango("Mango", 1.5, 0.75);
		System.out.println(d);
		System.out.println();
		
		Fruits e = new Durian("Durian", 2.0, 0.5);
		System.out.println(e);
		System.out.println();
	}

}