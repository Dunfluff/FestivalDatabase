package database;
import java.sql.*;
import java.util.*;


public class DatabaseController {
    private final String url = "jdbc:postgresql://pgserver.mah.se/mscheduler";
    private final String user = "ai0923";
    private final String password = "bgm9o0w2";
    private GetInfo get;
    private SetInfo set;

    public DatabaseController(){
    	get = new GetInfo(url, user, password);
    	set = new SetInfo(url, user, password);
    }

	public void getAllScenes() {
		get.getAllScenes();
	}

	public void getSceneByName(String string) {
		get.getSceneByName(string);
	}

	public void getBandTimesByName(String string) {
		get.getBandTimesByName(string);
	}

	public void getBandInfoByName(String string) {
		get.getBandInfoByName(string);
		
	}

	public void getMemberInfoByName(String string) {
		get.getMemberInfoByName(string);
		
	}
	
	public void setBand(String string) {
		set.setBand();
	}
	
	public void setWorker(String string) {
		set.setWorker();
	}
	
	public void setScene(String string) {
		set.setScenes();
	}

	public void setPerformance(String string) {
		set.setPerformance();
	}
	
	public void setMusician(String string) {
		set.setMusician();
	}
	
	public void setMembers(String string) {
		set.setMembers();
	}
}


