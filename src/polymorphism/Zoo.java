package polymorphism;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog rocky = new Dog();
		rocky.makeSound();
		rocky.fetch();
		feed(rocky);
		
		Animal sasha = new Dog();
		sasha.makeSound();
		feed(sasha);
		
		
		
		sasha = new Cat();
		sasha.makeSound();
		((Cat) sasha).scratch();
		feed(sasha);

	}
	public static void feed(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("Eat Dog food");
		}
		else if (animal instanceof Cat) {
			System.out.println("Eat Cat food");
		}
		else {
			System.out.println("I don't know your food type");
			
		}
	}

}
