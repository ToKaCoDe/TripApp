package lt.tokacode.tietoevry.tripapp.model;

public class Item {

	private String name;
	private String use;
	private double weight;
	
	public Item(String name, String use, double weight) {
		this.name = name;
		this.use = use;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getUse() {
		return use;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}

