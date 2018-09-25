package wettbuero;

public class Wette {

		private String NameSchnecke = new String();
		private float Einsatz = 0;
		private String NameSpieler = new String();
		
		public Wette(String NameSchnecke, float Einsatz, String NameSpieler) {
			this.setNameSchnecke(NameSchnecke);
			this.setEinsatz(Einsatz);
			this.setNameSpieler(NameSpieler);
		}
		
		public String getNameSchnecke() {
			return NameSchnecke;
		}
		public void setNameSchnecke(String nameSchnecke) {
			NameSchnecke = nameSchnecke;
		}
		public float getEinsatz() {
			return Einsatz;
		}
		public void setEinsatz(float einsatz) {
			Einsatz = einsatz;
		}
		public String getNameSpieler() {
			return NameSpieler;
		}
		public void setNameSpieler(String nameSpieler) {
			NameSpieler = nameSpieler;
		}
		

		
		
		
}
