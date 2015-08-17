package spiel;

public class Playground {
	
	public enum Weekday {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player p = new Player();
		p.name = "Manni Matter";
		p.item = "Schuh";
		
		System.out.printf( "%s nimmt einen %s mit", p.name, p.item);
		System.out.println();
		System.out.println(p.hasCompundName());
		p.speakName("Mongo");
		
		Player patrick = new Player().name("Patrick Tanner").item("Auto");
		System.out.println(patrick.toString());
		
		patrick.setPass();
		System.out.println(patrick.checkPass(javax.swing.JOptionPane.showInputDialog("Passwort:")));
		patrick.setPass();
		
		System.out.println(Player.isGameIdentifier("Halloooo"));
		
		Room tower = new Room();
		tower.addPlayer(p);
		tower.addPlayer(patrick);
		tower.addPlayer(new Player("Hardi", "Ledertasche"));
		tower.listPlayers();
		
		

	}

}
