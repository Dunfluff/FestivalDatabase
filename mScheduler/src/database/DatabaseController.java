package database;

import java.sql.*;
import java.util.*;

public class DatabaseController {
	private final String url = "jdbc:postgresql://pgserver.mah.se/mscheduler";
	private final String user = "ai0923";
	private final String password = "bgm9o0w2";
	private GetInfo get;
	private SetInfo set;

	public DatabaseController() {
		get = new GetInfo(url, user, password);
		set = new SetInfo(url, user, password);
	}

	public ArrayList<String> getAllScenes() {
		return get.getAllScenes();
	}

	public ArrayList<String> getAllBands() {
		return get.getAllBands();
	}

	public ArrayList<String> getAllWorkers() {
		return get.getAllWorkers();
	}

	public ArrayList<String> getAllMusicians() {
		return get.getAllMusicians();
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

	public void insertBandIntoTables(Band band) {
		set.insertBandIntoTables(band);
	}

	public void insertWorkerIntoTables(Worker worker) {
		set.insertWorkerIntoTables(worker);
	}

	public void insertMusicianIntoTables(Musician musician) {
		set.insertMusicianIntoTables(musician);
	}

	public void insertMembersIntoTables(String BandName, String MusName) {
		int bandId = get.getBandId(BandName);
		int musId = get.getMusId(MusName);
		Member temp = new Member(bandId, musId);
		set.insertMemberIntoTables(temp);
	}
	
	public void insertPerformanceIntoTables(String sceneName, String startTime, String endTime, String bandName) {
		int sceneId = get.getSceneId(sceneName);
		int bandId = get.getBandId(bandName);
		Performance temp = new Performance(sceneId,  startTime, endTime,  bandId);
		set.insertPerformanceIntoTables(temp);
		
	}
//	public void insertPerformanceIntoTables(Performance performance) {
//		set.insertPerformanceIntoTables(performance);
//	}

}
