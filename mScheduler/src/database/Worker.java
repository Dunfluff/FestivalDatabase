package database;

public class Worker {
	
	private int id;
	private int PNR;
	private String address;
	private String name;
	
	public Worker(int id, String name, int PNR, String address) {
		super();
		this.id = id;
		this.PNR = PNR;
		this.address = address;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPNR() {
		return PNR;
	}
	public void setPNR(int pNR) {
		PNR = pNR;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
