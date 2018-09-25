package wettbuero;

import java.util.*;

public class Wettbuero {

	private int RennenNr = 0;
	private ArrayList<Wette> Wetten = new ArrayList<>();
	private static int FAKTOR_WETTE = 5;

	public void wetteAnnehmen() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Bitte gebe deinen Spieler Namen ein: ");
		String spieler = scn.nextLine();
		System.out.print("Gebe ein auf welche Schnecke du setzten möchtest: ");
		String schneckenName = scn.nextLine();
		System.out.print("Gebe nun deinen Wetteinsatz ein: ");
		float wettEinsatz = scn.nextFloat();
		scn.close();
		
		Wette NameSchnecke = new Wette(schneckenName, wettEinsatz, spieler);
		Wetten.add(NameSchnecke);
		
	}
	
}
