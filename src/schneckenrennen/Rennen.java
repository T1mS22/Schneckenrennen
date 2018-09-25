package schneckenrennen;

import Rennschnecke.Rennschnecke;
import java.util.ArrayList;


public class Rennen {
	private String rennenName = "";
	private int anzahlSchnecken = 0;
	private ArrayList<Rennschnecke> teilnehmendeSchnecken = new ArrayList<Rennschnecke>();
	private int laengeStrecke = 0;
	
	public Rennen(String rennenName, int laengeStrecke) {
		this.rennenName = rennenName;
		this.laengeStrecke = laengeStrecke;
	}
	
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		this.teilnehmendeSchnecken.add(neueSchnecke);
		this.anzahlSchnecken += 1;
	}
	
	public void removeRennschnecke(String name) {
		for (Rennschnecke item: teilnehmendeSchnecken) {
			if (item.getName().equals(name)) {
				this.teilnehmendeSchnecken.remove(item);
				this.anzahlSchnecken -= 1;
			}
		}
		/*if (this.teilnehmendeSchnecken.contains(name) == true) {
			this.teilnehmendeSchnecken.remove(name);
			this.anzahlSchnecken -= 1;
		}*/
	}
	
	public String toString() {
		String ausgabe = this.rennenName + ", " + this.anzahlSchnecken + " Schnecken, "
				+ this.laengeStrecke + "lang. Teilnehmer: " 
				+ this.teilnehmendeSchnecken.toString();
		return ausgabe;
	}
	
	public Rennschnecke ermittleGewinner() {
		Rennschnecke siegerSchnecke = null;
		for (Rennschnecke item: teilnehmendeSchnecken) {
			if (item.getDistance() >= this.laengeStrecke) {
				siegerSchnecke = item;
			}
		}
		return siegerSchnecke;
	}
	
	private void lassSchneckeKriechen() {
		for (Rennschnecke item: teilnehmendeSchnecken) {
			item.krieche();
		}
	}
	public void durchfuehren() {
		while (ermittleGewinner() == null) {
			lassSchneckeKriechen();
		}
	}
}
