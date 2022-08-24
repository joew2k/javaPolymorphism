package polymorphism.fruitMarket;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banana bole = new Banana();
		System.out.println("The calorie in Bole banana is " + bole.getCalories());
		bole.makeJuice();
		bole.peel();
		bole.drinkJuice();
		
		Fruit plantain = new Banana();
		System.out.println("The calorie in tangerine is " + plantain.getCalories());
		plantain.makeJuice();
		
		plantain = new Orange();
		plantain.makeJuice();
		((Orange) plantain).removeSeed();

	}
	public static void drinkJuice(Fruit fruit) {
		if(fruit instanceof Banana) {
			System.out.print("Please take your banana milk shake");
		}
		else if(fruit instanceof Orange) {
			System.out.print("Please take your Orange Juice");
		}
		else {System.out.print("I don't understand your request");
		}
		}
	
	}


}
