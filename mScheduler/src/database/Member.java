package database;

public class Member {

	private int bandId;
	private int musId;

	public Member(int bandId, int musId) {
		super();
		this.bandId = bandId;
		this.musId = musId;
	}

	public int getBandId() {
		return bandId;
	}

	public void setBandId(int bandId) {
		this.bandId = bandId;
	}

	public int getMusId() {
		return musId;
	}

	public void setMusId(int musId) {
		this.musId = musId;
	}

}
