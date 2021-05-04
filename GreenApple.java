public class GreenApple extends Apple {						
	private String color, taste;							
	GreenApple(String name, double price, String color, String taste){			
		super (name, price);													
		this.color = color;
		this.taste = taste;
	}
	
	public String toString() {
		return ("Total price = RM" + totalprice + "\n" + this.name + " color is " + this.color + "\n" + this.name + " taste is " + this.taste);
	}
}