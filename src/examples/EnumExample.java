package examples;

public class EnumExample {
	
	public static enum Weekday {
		NONE, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		
		public String toNormalCase() {
			String s1, s2;
			
			if (this == null) return null;
			
			s1 = this.toString().substring(0,1);
			s2 = this.toString().substring(1).toLowerCase();
			return s1 + s2;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = Weekday.MONDAY.ordinal();
		int b = 0;
		
		System.out.println(Weekday.MONDAY);
		System.out.println(Weekday.MONDAY.toNormalCase());
		System.out.println(a);
		
		Weekday day = Weekday.FRIDAY;
		
		switch ( day ) {
			case MONDAY:
				b = 1;
				break;
				
			case TUESDAY:
				b = 2;
				break;
				
			case WEDNESDAY:
				b = 3;
				break;
				
			case THURSDAY:
				b = 4;
				break;
				
			case FRIDAY:
				b = 5;
				break;
				
			case SATURDAY:
				b = 6;
				break;
				
			case SUNDAY:
				b = 7;
				break;
			
			default:
				b=0;
		}
		
		System.out.println(b);

	}

}
