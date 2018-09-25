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
	
	public int getRennenNr() {
		return RennenNr;
	}

	public void setRennenNr(int rennenNr) {
		RennenNr = rennenNr;
	}
	
	public void rennenDruchfuehren(int RennenNr) {
		setRennenNr(RennenNr);
		
	}
	
	public void Ausgabe() {
		
		System.out.println("Gewonnen hat: " + siegerSchnecke );
		System.out.println("Es geb " + Wetten.size() + " Wetten.");
		for(int i = 0; i <= Wetten.size(); i++) {
			if(Wetten.get(i).getNameSchnecke() == siegerSchnecke) {
				float gewinn = Wetten.get(i).getEinsatz() * FAKTOR_WETTE;
				String gewinner = Wetten.get(i).getNameSpieler();
				System.out.println("Gewonnen hat: " + gewinner);
				System.out.println("Er hat: " + gewinn + "€ gewonnen.");
			}
		System.out.println("Das Rennen ist beendet. Danke für's mitspielen.");	
		}
	}

	
	
}
