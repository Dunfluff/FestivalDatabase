package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SetInfo {
	private String url;
	private String user;
	private String password;
	private int[] nextId;
	private SysoDisplay disp;

	public SetInfo(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		nextId = new int[4];
	}

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 * @throws java.sql.SQLException
	 */
	public Connection connect() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	private void getNext() {
		nextId = new int[4];
		List<String> next = new ArrayList<String>();
		next.add("SELECT count(Band) FROM band");
		next.add("SELECT count(Scene) FROM Scene");
		next.add("SELECT count(Worker) FROM worker");
		next.add("SELECT count(Musician) FROM Musician");
		int i = 0;
		for (String n : next) {
			try (Connection conn = connect();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(n)) {
				rs.next();
				nextId[i++] = rs.getInt(1);
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public void insertBandIntoTables(Band band) {

		PreparedStatement ps = null;

		String SQL = "INSERT INTO band" + "(bandid, workid, bandname, origin) VALUES" + "(?, ?, ?, ?)";

		System.out.println(band.getName());
		System.out.println(band.getOrigin());

		try (Connection conn = connect()) {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, band.getId());
			ps.setInt(2, 2);
			ps.setString(3, band.getName());
			ps.setString(4, band.getOrigin());
			ps.executeUpdate();
			System.out.println("info set into the band");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void insertWorkerIntoTables(Worker worker) {

		PreparedStatement ps = null;

		String SQL = "INSERT INTO worker" + "(workid, workname, pernum, addr) VALUES" + "(?, ?, ?, ?)";

		try (Connection conn = connect()) {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, worker.getId());
			ps.setString(2, worker.getName());
			ps.setInt(3, worker.getPNR());
			ps.setString(4, worker.getAddress());
			ps.executeUpdate();
			System.out.println("worker info updated yo");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}
	}
	
	public void insertPerformanceIntoTables(Performance performance) {

		PreparedStatement ps = null;

		String SQL = "INSERT INTO preformance" + "(sceneid, starttime, endtime, bandid) VALUES" + "(?, ?, ?, ?)";

		try (Connection conn = connect()) {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, performance.getSceneId());
			ps.setString(2, performance.getStartTime());
			ps.setString(3, performance.getEndTime());
			ps.setInt(4, performance.getBandId());
			ps.executeUpdate();
			System.out.println("performance info updated yo");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}
	}

	public void insertMusicianIntoTables(Musician musician) {

		PreparedStatement ps = null;

		String SQL = "INSERT INTO musican" + "(musid, info, musicianname) VALUES" + "(?, ?, ?)";

		try (Connection conn = connect()) {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, musician.getId());
			ps.setString(2, musician.getInfo());
			ps.setString(3, musician.getName());
			ps.executeUpdate();
			System.out.println("musician info updated yey");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}
	}

	public void insertMemberIntoTables(Member member) {

		PreparedStatement ps = null;
		System.out.println(member.getBandId() + " " + member.getMusId());
		String SQL = "INSERT INTO members" + "(bandid, musid) VALUES" + "( ?, ?)";
		try (Connection conn = connect()) {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, member.getBandId());
			ps.setInt(2, member.getMusId());
			ps.executeUpdate();
			System.out.println("member info updated hoho");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

		}
	}

}
