package database;

public class Performance {

	private int sceneId;
	private int bandId;
	private String startTime;
	private String endTime;
	
	public Performance(int sceneId, int bandId, String startTime, String endTime) {
		super();
		this.sceneId = sceneId;
		this.bandId = bandId;
		this.startTime = startTime;
		this.endTime = endTime;
		
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
