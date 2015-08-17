package spiel;

import java.util.*;

public class Room {
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void listPlayers(){
		
		for( Player player : players) {
			System.out.println(player.toString());
		}
	}
	
}
