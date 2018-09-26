package wettbuero;

import java.util.*;
import Rennschnecke.Rennschnecke;
import schneckenrennen.Rennen;



public class Wettbuero {

	private String RennName = "";
	private ArrayList<Wette> Wetten = new ArrayList<>();
	private static int FAKTOR_WETTE = 5;
	private Rennen aktRennen = null;

	


	public Wettbuero(String rennName, Rennen aktuellesRennen) {
		this.setRennName(rennName);
		this.setAktRennen(aktuellesRennen);
	}
	
	public Rennen getAktRennen() {
		return aktRennen;
	}


	public void setAktRennen(Rennen aktRennen) {
		this.aktRennen = aktRennen;
	}
	
	public String getRennName() {
		return RennName;
	}


	public void setRennName(String rennName) {
		RennName = rennName;
	}
	
	
	public void wetteAnnehmen() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Möchten sie Wetten?");
		System.out.print("Wann ja geben sie bitte true ein und wenn Nein geben sie bitte false ein: ");
		Boolean Anfrage = scn.hasNextLine();
		while(Anfrage) {		
			System.out.print("Bitte gebe deinen Spieler Namen ein: ");
			String spieler = scn.nextLine();
			System.out.print("Gebe ein auf welche Schnecke du setzten möchtest: ");
			String schneckenName = scn.nextLine();
			System.out.print("Gebe nun deinen Wetteinsatz ein: ");
			float wettEinsatz = scn.nextFloat();
			Wette NameSchnecke = new Wette(schneckenName, wettEinsatz, spieler);
			Wetten.add(NameSchnecke);
			System.out.println("Möchten sie weiter Wetten?");
			System.out.print("Wann ja geben sie bitte true ein und wenn Nein geben sie bitte false ein: ");
			Anfrage = scn.hasNextLine();
			
		}
		scn.close();
	}
		

	public void rennenDurchfuehren() {
		getAktRennen().durchfuehren();
	}
	
	public void Ausgabe() {
		
		String siegerSchneckeString = Rennschnecke.class.getName();
		System.out.println("Gewonnen hat: " + siegerSchneckeString  );
		System.out.println("Es geb " + Wetten.size() + " Wetten.");
		for(int i = 0; i <= Wetten.size(); i++) {
			if(Wetten.get(i).getNameSchnecke() == siegerSchneckeString) {
				float gewinn = Wetten.get(i).getEinsatz() * FAKTOR_WETTE;
				String gewinner = Wetten.get(i).getNameSpieler();
				System.out.println("Gewonnen hat: " + gewinner);
				System.out.println("Er hat: " + gewinn + "€ gewonnen.");
			}
		System.out.println("Das Rennen ist beendet. Danke für's mitspielen.");	
		}
	}

	
	
}
