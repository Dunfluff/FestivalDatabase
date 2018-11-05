package database;


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

	public void insertBandIntoTables(int bandId, String bandName, String origin, String workName) {
		int workId = get.getWorkerId(workName);
		Band temp = new Band(bandId, bandName, origin, workId);
		set.insertBandIntoTables(temp);
	}

	public void insertWorkerIntoTables(int workId, String workName, int workPNR, String workAddress) {
		Worker temp = new Worker(workId, workName, workPNR, workAddress);
		set.insertWorkerIntoTables(temp);
	}

	public void insertMusicianIntoTables(int MusId, String MusInfo, String MusName) {
		Musician temp = new Musician (MusId, MusInfo, MusName);
		set.insertMusicianIntoTables(temp);
	}

	public void insertMembersIntoTables(String BandName, String MusName) {
		int bandId = get.getBandId(BandName);
		int musId = get.getMusId(MusName);
		Member temp = new Member(bandId, musId);
		set.insertMemberIntoTables(temp);
	}
	
	public void insertPerformanceIntoTables(String sceneName, String bandName, String startTime, String endTime) {
		int sceneId = get.getSceneId(sceneName);
		int bandId = get.getBandId(bandName);
		Performance temp = new Performance(sceneId,  startTime, endTime,  bandId);
		set.insertPerformanceIntoTables(temp);
		
		
	}


}
