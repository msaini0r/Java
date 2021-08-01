package oops;

class Cat {
	Boolean hasfur;
	String redcolor;
	
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
		
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
		
		public void description () {
			System.out.println("my cat has " + legs + "legs and " + eyes + " eyes");
		}
}



public class MainClass {

	public static void main(String[] args) {
		
	
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.legs= 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 5;
		
		
		
		cat1.description();
		cat2.description();
		

	}

}

