package spiel;

public class Player {
	
	public static final int MAX_ID_LEN = 20 /* chars */;
	
	public String name = ""; // Mit vorbelegung
	public String item;
	private Room room = null;
	private String password = "";
	private int falseCount = 0;
	
	
	// Konstruktoren ( überladen )
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player(String name, String item) {
		this.name = name;
		this.item = item;
	}
	
	// Anderen Konstruktor über this() aufrufen
	public Player( Player player ) {
		this( player.name, player.item );
	}
	
	
	
	
	
	public static boolean isGameIdentifier( String name ) {
		
		if (name == null) return false;
		
		return name.length() <= MAX_ID_LEN;
	}
	
	
	public void clearName() {
		name = "";
	}
	
	public boolean hasCompundName() {
		
		return (name == null) ? false : name.contains( " " );
		
	}
	
	public void speakName( String name ) {
		
		// Durch this kann die Referenz auf das aktuelle Objekt
		// abgerufen werden. z.B. bei Überschreibung der Objektattribute
		// durch Parameternamen in Methoden
		System.out.println(this.name + " sagt: '" + name + " spielt gut'");
	}
	
	
	// Attibute setzen mit Referenzrückgabe
	// z.B. für kaskadierende Anwendung
	// "Builder"
	public Player name(String name) {
		this.name = name;
		return this;
	}
	
	public Player item(String item) {
		this.item = item;
		return this;
	}
	
	
	// setXXX mach Konvention als void!!
	public void setName(String name) {
		this.name = name;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	// Eigenes toString
	@Override public String toString() {
		String str = this.name + ", " + this.item;
		return str;
	}
	
	@Override public Player clone() {
		return new Player(this);
	}
	
	// Passwort prüfen, Methode in Klasse hat Zugriff auf privates Element
	public boolean checkPass(String inputPass) {
		if (this.password.equals(inputPass)) {
			this.falseCount = 0;
			return true;
		} else {
			this.falseCount += 1;
			System.err.println(this.falseCount + ". Fehlversuch");
			return false;
		}
	}
	
	// Passwort setzen
	public boolean setPass() {
		if ( this.password.length() == 0 || this.checkPass(javax.swing.JOptionPane.showInputDialog("Altes Passwort:"))) {
			this.password = javax.swing.JOptionPane.showInputDialog("Neues Passwort:");
			return true;
		} else {
			return false;
		}
	}

}
