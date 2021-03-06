package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextPane;

public class GetInfo {

	private String url;
	private String user;
	private String password;
	private ArrayList<String> scenes = new ArrayList<>();
	private ArrayList<String> bands = new ArrayList<>();
	private ArrayList<String> workers = new ArrayList<>();
	private ArrayList<String> musician = new ArrayList<>();

	public GetInfo(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
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

	public ArrayList<String> getAllScenes() {

		String SQL = "SELECT SceneName FROM scene group by SceneName order by SceneName";

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			// display scene information
			while (rs.next()) {
				scenes.add(rs.getString("SceneName"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return scenes;
	}

	public ArrayList<String> getAllBands() {

		String SQL = "SELECT bandName FROM band group by bandName order by bandName";

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			while (rs.next()) {
				bands.add(rs.getString("bandName"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return bands;
	}

	public ArrayList<String> getAllWorkers() {

		String SQL = "SELECT workName FROM worker group by workName order by workName";

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			while (rs.next()) {
				workers.add(rs.getString("workName"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return workers;
	}

	public ArrayList<String> getAllMusicians() {

		String SQL = "SELECT musicianName FROM musician group by musicianName order by musicianName";

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			while (rs.next()) {
				musician.add(rs.getString("musicianName"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return musician;
	}

	public void getSceneByName(String n, JTextPane sceneInfo) {
		String newLine = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		String SQL = "SELECT * FROM preformance join band on preformance.BandId=band.BandId join scene on preformance.SceneId=scene.SceneId where SceneName=? order by StartTime";
		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setString(1, n);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
	    	sb.append(rs.getString("BandName") +  "\t"
	                + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
	        while (rs.next()) {
	            sb.append(newLine + rs.getString("BandName") +  "\t"
	                     + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
	        }
			sceneInfo.setText(sb.toString());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		if(sb.length() == 0)sceneInfo.setText("No bands booked");
	}

	public int getBandId(String bName) {

		String SQL = "SELECT bandId from Band where bandName = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, bName);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt("bandId") + "id test");
			return rs.getInt("bandId");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;

	}

	public int getMusId(String mName) {

		String SQL = "SELECT musId from Musician where musicianName = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, mName);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt("musId") + "id test");
			return rs.getInt("musId");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;

	}

	public int getSceneId(String sName) {

		String SQL = "SELECT sceneId from scene where sceneName = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, sName);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt("sceneId") + "id test");
			return rs.getInt("sceneId");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;

	}

	public int getWorkerId(String wName) {

		String SQL = "SELECT workId from worker where workName = ?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, wName);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt("workId") + "id test");
			return rs.getInt("workId");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;

	}

	public void getBandTimesByName(String n) {

		String SQL = "SELECT * FROM preformance join band on preformance.BandId=band.BandId join scene on preformance.SceneId=Scene.SceneId where BandName=? order by StartTime";
		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, n);
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Band getBandInfoByName(String string) {
		Band band = new Band();
		String SQL = "SELECT * FROM members join band on members.BandID = band.BandID join musician on members.MusId = musician.MusId where BandName=?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setString(1, string);
			ResultSet rs = pstmt.executeQuery();
		    	rs.next();
		    	band.setName(rs.getString("BandName"));
		    	band.setOrigin(rs.getString("origin"));
		    	band.setMembers(rs.getString("MusicianName"));
		        while (rs.next()) {
		        	band.setMembers(rs.getString("MusicianName"));
		        }
		        
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return band;
	}

	public void getMemberInfoByName(String string) {

		String SQL = "SELECT BandName, MusicianName, Info FROM members join band on members.BandID = band.BandID join musician on members.MusId = musician.MusId where MusicianName=?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setString(1, string);
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public String getMemberFunInfoByName(String selectedItem) {
		String SQL = "SELECT Info FROM  musician where MusicianName=?";

		try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setString(1, selectedItem);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getString("Info");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

}
