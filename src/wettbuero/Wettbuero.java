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
		System.out.println("Wenn Ja, geben sie bitte 'true' ein und wenn Nein, geben sie bitte 'false' ein: ");
		String anfrage = scn.next();
		boolean repeat = anfrage.equals("true");
		while(repeat) {		
			System.out.println("Bitte gebe deinen Spielernamen ein: ");
			String spieler = scn.next();
			System.out.println("Gebe ein auf welche Schnecke du setzten möchtest (Petra/Uri/BatSnail/Adolf): ");
			String schneckenName = scn.next();
			System.out.println("Gebe nun deinen Wetteinsatz ein ('Komma' als Trennung nutzen): ");
			float wettEinsatz = scn.nextFloat();
			Wette NameSchnecke = new Wette(schneckenName, wettEinsatz, spieler);
			Wetten.add(NameSchnecke);
			System.out.println("Möchten sie weiter Wetten?");
			System.out.println("Wenn Ja, geben sie bitte 'true' ein und wenn Nein, geben sie bitte 'false' ein: ");
			anfrage = scn.next();
			
		}
		scn.close();
	}
		

	public void rennenDurchfuehren() {
		getAktRennen().durchfuehren();
		
	}
	
	public void Ausgabe() {
		Rennschnecke siegerSchneckeObjekt = aktRennen.ermittleGewinner();
		String siegerSchneckeString = siegerSchneckeObjekt.getName();
		System.out.println("Die Schnecke die den Sieg errungen hat ist: " + siegerSchneckeString  );
		System.out.println("Es gab " + Wetten.size() + " Wetten.");
		for(int i = 0; i < Wetten.size(); i++) {
			if(Wetten.get(i).getNameSchnecke().equals(siegerSchneckeString)) {
				float gewinn = Wetten.get(i).getEinsatz() * FAKTOR_WETTE;
				String gewinner = Wetten.get(i).getNameSpieler();
				System.out.println("Bei den Wetten hat gewonnen: " + gewinner);
				System.out.println("Er hat: " + gewinn + "€ gewonnen.");
			}
			
		}
		System.out.println("Das Rennen ist beendet. Danke für's mitspielen.");
	}

	
	
}
