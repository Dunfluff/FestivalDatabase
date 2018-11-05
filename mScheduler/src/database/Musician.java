package database;

public class Musician {

	private int id;
	private String info;
	private String name;
	
	public Musician(int id, String info, String name) {
		super();
		this.id = id;
		this.info = info;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
