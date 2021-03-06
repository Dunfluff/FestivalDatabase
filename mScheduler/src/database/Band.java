package database;

import java.util.ArrayList;

public class Band {
	private int id;
	private String name;
	private String origin;
	private int worker;
	private ArrayList<String> members;
	
	public Band(int id, String name, String origin, int worker) {
		super();
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.worker = worker;
	}
	public Band() {
		members = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	public int getWorker() {
		return worker;
	}
	public void setWorker(int worker) {
		this.worker = worker;
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
	public ArrayList<String> getMembers() {
		return members;
	}
	public void setMembers(String n) {
		members.add(n);
	}

}
