
package SchneckenrennenStart;

import Rennschnecke.Rennschnecke;
import schneckenrennen.Rennen;
import wettbuero.*;

public class rennStart {

	public static void main(String[] args) {
		
		Rennschnecke Schnecke1 = new Rennschnecke("Petra", "Sibirische Weinbergschnecke", (100- Math.random()));
		Rennschnecke Schnecke2 = new Rennschnecke("BatSnail", "Flederschnecke", (100- Math.random()));
		Rennschnecke Schnecke3= new Rennschnecke("Uri", "auﬂeriridische Nacktschnecke vom Planeten Tofu", (100- Math.random()));
		Rennschnecke Schnecke4 = new Rennschnecke("Adolf", "Fuehrerschnecke", (100- Math.random()));
		
		Rennen eins = new Rennen("Olympia",200000);
		Rennen zwei = new Rennen("Nuerburgring", 6000);
		
		eins.addRennschnecke(Schnecke1);
		eins.addRennschnecke(Schnecke2);
		eins.addRennschnecke(Schnecke3);
		eins.addRennschnecke(Schnecke4);
		
		zwei.addRennschnecke(Schnecke1);
		zwei.addRennschnecke(Schnecke2);
		zwei.addRennschnecke(Schnecke3);
		zwei.addRennschnecke(Schnecke4);
		
		
		
		
		Wettbuero Rennen1 = new Wettbuero("Eins", eins);
		
		Rennen1.wetteAnnehmen();
		Rennen1.rennenDurchfuehren();
		Rennen1.Ausgabe();
		
		Wettbuero Rennen2 = new Wettbuero("Zwei", zwei);
		
		Rennen2.wetteAnnehmen();
		Rennen2.rennenDurchfuehren();
		Rennen2.Ausgabe();
		
	
	}
}
