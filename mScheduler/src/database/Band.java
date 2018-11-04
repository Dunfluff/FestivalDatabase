package database;

public class Band {
	private int id;
	private String name;
	private String origin;
	
	public Band(int id, String name, String origin) {
		super();
		this.id = id;
		this.name = name;
		this.origin = origin;
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
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
