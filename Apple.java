public class Apple extends Fruits {							
	protected int number;									
	protected double discountrate, price, totalprice;
	Apple(String name, double price){						
		super(name);										
		this.price = price;
		System.out.println("The price per apple is RM" + this.price);
		System.out.print("The number of apple you want to buy is :");
		this.number = scan.nextInt();
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {					//Overriding method
		if (this.number <10 ) {
			totalprice = CalculatePrice();
		}
		else if (this.number > 10  && this.number < 100) {
			discountrate = 0.9;
			System.out.println("Since you buy more than 10 and less than 100 apples, you have 10% discount");
			totalprice = CalculatePrice(discountrate);
		}
		else {
			discountrate = 0.85;
			number = 100;
			System.out.println("Since you buy 100 or more apples, you have 15% discount and the price is always calculated using 100 apples");
			totalprice = CalculatePrice(discountrate, number);
		}
	}
	
	public double CalculatePrice() {										
		return this.number * this.price;
	}
	
	public double CalculatePrice(double discountrate) {						
		return this.number * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, int number) {			
		return number * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + totalprice);
	}

}