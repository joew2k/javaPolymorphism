package polymorphism.fruitMarket;

public class Orange extends Fruit {
	public Orange() {
		setCalories(2.14);
	}
	
	public void removeSeed() {
		System.out.println("Removed seed");
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Orange juice is ready");
	}
	
}
