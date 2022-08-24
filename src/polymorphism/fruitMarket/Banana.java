package polymorphism.fruitMarket;

public class Banana extends Fruit{
	
	@Override
	public void makeJuice() {
		System.out.println("Banana milk shake is ready");
	}
	
	public void peel() {
		System.out.println("Banana if peeled and ready for eating");
	}
	public Banana() {
		setCalories(3.14);		
	}
	
	
	
}
