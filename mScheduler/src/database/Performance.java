package database;

public class Performance {

	private int sceneId;
	private int bandId;
	private String startTime;
	private String endTime;
	
	public Performance(int sceneId,  String startTime, String endTime, int bandId) {
		super();
		this.sceneId = sceneId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.bandId = bandId;
	}
	
	public int getSceneId() {
		return sceneId;
	}
	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}
	public int getBandId() {
		return bandId;
	}
	public void setBandId(int bandId) {
		this.bandId = bandId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
