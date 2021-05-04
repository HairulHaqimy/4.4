import java.util.Scanner;

public class Fruits {							
	Scanner scan = new Scanner(System.in);
	protected String name;				
	public Fruits(String name) {		
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			System.out.println(this.name + " is constructed");
		
	}
}