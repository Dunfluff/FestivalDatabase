package database;

public class Worker {
	
	private int id;
	private int PNR;
	private String address;
	
	public Worker(int id, int PNR, String address) {
		super();
		this.id = id;
		this.PNR = PNR;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
