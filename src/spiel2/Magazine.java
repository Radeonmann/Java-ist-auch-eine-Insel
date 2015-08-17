package spiel2;

public class Magazine extends GameObject implements Buyable, Comparable<Magazine> {

	double price;
	
	
	@Override
	public double price() {
		return price;
	}

	@Override
	public boolean useOn(GameObject oject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Magazine that) {
		
		return Double.compare(this.price(), that.price());
		
	}

}
