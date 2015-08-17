package spiel2;

public class Playground {
	
	public static void main(String[] args) {
		Door door = new Door();
		door.id = 12;

		Key  key1 = new Key(99);

		Key  key2 = new Key(12);

		System.out.printf( "erfolgreich=%b%n", key1.useOn(door) );
		System.out.printf( "erfolgreich=%b, isOpen=%b%n", key2.useOn(door), door.isOpen );
		System.out.printf( "erfolgreich=%b%n", door.useOn(key1) );
		
		
		
		Magazine madMag = new Magazine();
		madMag.price = 2.50;
		Buyable schoki = new Chocolate();
		Magazine maxim = new Magazine();
		maxim.price = 3.00;
		
		if (maxim instanceof Buyable) {
			System.out.println("Troooo");
		}
		
		System.out.printf( "%.2f", PriceUtils.calculateSum( madMag, maxim, schoki ) ); // 6,19
	}

}
