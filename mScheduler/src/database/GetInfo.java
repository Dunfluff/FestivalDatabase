package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetInfo {
	
	private String url;
	private String user;
	private String password;
	private SysoDisplay disp;

	public GetInfo(String url, String user, String password){
		this.url = url;
		this.user = user;
		this.password = password;
		disp = new SysoDisplay();
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
    

    
    
    public void getAllScenes() {
   	 
        String SQL = "SELECT SceneName FROM scene group by SceneName order by SceneName";
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            // display scene information
            disp.displayScenes(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void getSceneByName(String n) {
   	 
        String SQL = "SELECT * FROM preformance join band on preformance.BandId=band.BandId join scene on preformance.SceneId=scene.SceneId where SceneName=? order by StartTime";
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, n);
            ResultSet rs = pstmt.executeQuery();
            disp.displayScene(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void getBandTimesByName(String n) {
   	 
        String SQL = "SELECT * FROM preformance join band on preformance.BandId=band.BandId join scene on preformance.SceneId=Scene.SceneId where BandName=? order by StartTime";
        System.out.println("test1");
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, n);
            ResultSet rs = pstmt.executeQuery();
            disp.displayBandTimes(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

	public void getBandInfoByName(String string) {
		
		String SQL = "SELECT * FROM members join band on members.BandID = band.BandID join musician on members.MusId = musician.MusId where BandName=?";
		 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, string);
            ResultSet rs = pstmt.executeQuery();
            disp.displayBandInfo(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	}

	public void getMemberInfoByName(String string) {
			
			String SQL = "SELECT BandName, MusicianName, Info FROM members join band on members.BandID = band.BandID join musician on members.MusId = musician.MusId where MusicianName=?";
			 
	        try (Connection conn = connect();
	                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
	 
	            pstmt.setString(1, string);
	            ResultSet rs = pstmt.executeQuery();
	            disp.displayMusicianInfo(rs);
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
		
	}
    
    
    

}