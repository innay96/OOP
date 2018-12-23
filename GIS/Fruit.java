package GIS;


import Game.Map;
import Geom.Geom_element;
import Geom.Point3D;

/**
 * This class represents a "target" in a known geographic location
 * (without movement)
 * @author Inna and Chen
 *
 */
public class Fruit implements GIS_element {
	private static final String COMMA_DELIMITER = ",";

	private int id;
	private Point3D location;
	private int weight;
	private double time = 0;
	private Point3D pointGoogle;

	/**
	 * constructor 
	 * 
	 * @param firstLocation
	 */
	public Fruit(Point3D location, int id) {
		this.id = id;
		this.location = location;
	}
	
	/**
	 * constructor
	 */
	public Fruit(Fruit other) {
		id = other.getId();
		location = other.getLocation();
		weight = other.getWeight();
		time = other.getTime();
	}

	public Fruit(String row){
		int CSV_ID = 1;
		int CSV_LON = 2;
		int CSV_LAT = 3;
		int CSV_ALT = 4;
		int CSV_WIEGHT = 5;

		String [] tokens = row.split(COMMA_DELIMITER);
		if (tokens.length > 0) {
			id = (Integer.parseInt(tokens[CSV_ID]));
			String fruitPoint = tokens[CSV_LAT] + "," + tokens[CSV_LON] + "," + tokens[CSV_ALT];
			String pointToGoogle = tokens[CSV_LON] + "," + tokens[CSV_LAT] + "," + tokens[CSV_ALT];
			pointGoogle = new Point3D(pointToGoogle);
			Point3D polar = new Point3D(fruitPoint);
			location = Map.convertToPixel(polar);
			weight = (Integer.parseInt(tokens[CSV_WIEGHT]));
		}
	}


	public Point3D getGoogle(){
		return pointGoogle;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Point3D getLocation() {
		return location;
	}

	public void setLocation(Point3D location) {
		this.location = location;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public int size() {
		return size();
	}

	//for the new csv save
	public String output(){
		Point3D p = Map.convertToPolar(this.getLocation());
		String ans = "";
		ans = "F," + this.getId() + "," + p.y() + "," + p.x() + "," + p.z() + "," + this.getWeight();
		return ans;
	}
	@Override
	public String toString(){ 
		String ans = "";
		ans = "Fruits: id: " + this.getId() + ", location: " + this.getLocation() + ", weight: " + this.getWeight() + "\n";
		return ans;
	}
	@Override
	public Geom_element getGeom() {
		return null;
	}
	@Override
	public Meta_data getData() {
		return null;
	}
	@Override
	public void translate(Point3D vec) {
		
	}


}
