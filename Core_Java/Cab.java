package Core_Java;

public class Cab {
	private String color;
	private String cabModel;
	private String cabno;
	private String cabDriverName;
	private int noOfSeats;
	private String destination;
	private String pickup;
	public Cab(String color, String cabModel, String cabno, String cabDriverName, int noOfSeats, String destination,
			String pickup) {
		super();
		this.color = color;
		this.cabModel = cabModel;
		this.cabno = cabno;
		this.cabDriverName = cabDriverName;
		this.noOfSeats = noOfSeats;
		this.destination = destination;
		this.pickup = pickup;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCabModel() {
		return cabModel;
	}
	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}
	public String getCabno() {
		return cabno;
	}
	public void setCabno(String cabno) {
		this.cabno = cabno;
	}
	public String getCabDriverName() {
		return cabDriverName;
	}
	public void setCabDriverName(String cabDriverName) {
		this.cabDriverName = cabDriverName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	

}
