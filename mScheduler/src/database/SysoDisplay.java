package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SysoDisplay {
	String newLine = System.getProperty("line.separator");
	
	
	
	/**
     * Display Scene times
     *
     * @param rs
     * @throws SQLException
     */	
    public void displayScene(ResultSet rs) throws SQLException {
;
    	rs.next();
    	System.out.println(rs.getString("SceneName") + newLine
                + rs.getString("BandName") +  "\t"
                + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
        while (rs.next()) {
            System.out.println(rs.getString("BandName") +  "\t"
                     + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
        }
    }
    
    /**
     * Display Band Times
     *
     * @param rs
     * @throws SQLException
     */	
    public void displayBandTimes(ResultSet rs) throws SQLException {
    	rs.next();
    	System.out.println(rs.getString("BandName")+ newLine
                + rs.getString("SceneName") +  "\t"
                + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
        while (rs.next()) {
            System.out.println(rs.getString("SceneName") + "\t"
                     + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
        }
    }

    
    /**
     * Display Scenes
     *
     * @param rs
     * @throws SQLException
     */	
    public void displayScenes(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("SceneName")); 
        }
    }

	public void displayBandInfo(ResultSet rs) throws SQLException {
    	rs.next();
    	System.out.println(rs.getString("BandName")+  "\t" + rs.getString("origin") + newLine
                + rs.getString("MusicianName") +  "\t");
        while (rs.next()) {
            System.out.println(rs.getString("MusicianName"));
        }
	}

	public void displayMusicianInfo(ResultSet rs) throws SQLException {
		rs.next();
    	System.out.println(rs.getString("MusicianName")+  " Info: " +  rs.getString("Info") + newLine + "Spelar i: " + newLine + rs.getString("BandName"));
        while (rs.next()) {
            System.out.println(rs.getString("BandName"));
        }
	}
}