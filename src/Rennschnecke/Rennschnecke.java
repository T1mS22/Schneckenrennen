package Rennschnecke;

public class Rennschnecke 
{
	private String name = "";
	private String breed = "";
	private double maxvelocity = 0;
	private double distance = 0;

	public Rennschnecke(String name, String breed, double maxvelocity) 
	{
		this.setName(name);
		this.setBreed(breed);
		this.setMaxvelocity(maxvelocity);
	}
  
	public void krieche() {
		this.distance += Math.random() * this.maxvelocity;
	}

	@Override
	public String toString() {
		return "Rennschnecke Name = " + name + ", Rasse = " + breed + "" + ", Maximalgeschwindigkeit = " + maxvelocity
				+ ", Zurückgelegter Weg = " + distance + "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getMaxvelocity() {
		return maxvelocity;
	}

	public void setMaxvelocity(double maxvelocity) {
		this.maxvelocity = maxvelocity;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
