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

	public SetInfo(String url, String user, String password){
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
    
    
    
    private void getNext(){
    	nextId = new int[4];
        List<String> next = new ArrayList<String>();
    	next.add("SELECT count(Band) FROM band");
    	next.add("SELECT count(Scene) FROM Scene");
    	next.add("SELECT count(Worker) FROM worker");
    	next.add("SELECT count(Musician) FROM Musician");
    	int i = 0;
    	for(String n : next){
        	try (Connection conn = connect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(n)) {
                rs.next();
                nextId[i++]=rs.getInt(1);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    	}	
    }
    
    public void setBand() {
    	
    	String SQL = "INSERT INTO band VALUES (19, 2, 'Prince', 'Kazaks')";
    	System.out.println("Test Sara2");
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayScenes(rs);
    		
    	} catch (SQLException ex) {
    		System.out.println(ex.getMessage());
    	}
}


    
    
    public void setWorker() {
    	
    	String SQL = "INSERT INTO worker VALUES (4, 567891, 'Matgatan 7')";
    	System.out.println(" Hut hut");
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayWorker(rs);
    	} catch (SQLException ex) {
    		System.out.println(ex.getMessage());
    	}
    	
    }
    
    public void setScenes() {
    	
    	String SQL = "INSERT INTO scene VALUES (5, 'Big Heavy')";
    	System.out.println(" Try Setting scenes" );
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayScenes(rs);
    	} catch (SQLException ex) {
    		System.out.print(ex.getMessage());
    	}
    	
    }
    
    public void setPerformance() {
    	
    	String SQL = "INSERT INTO preformance VALUES (5, '14:30:00', '15:30:00', 7)";
    	System.out.println("Try booking performance");
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayWorker(rs);
    	} catch (SQLException ex) {
    		System.out.println(ex.getMessage());
    	}
    }
    
    public void setMusician() {
    	
    	String SQL = "INSERT INTO musician VALUES (4, 'rockar triangeln', 'Rupert')";
    	System.out.println("Try adding musician");
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayWorker(rs);
    	} catch (SQLException ex) {
    		System.out.println(ex.getMessage());
    	}
    }
    
    public void setMembers() {
    	
    	String SQL = "INSERT INTO members VALUES (7, 4)";
    	System.out.println("Try adding members2");
    	
    	try (Connection conn = connect();
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(SQL)) {
    		disp.displayScenes(rs);
    	} catch (SQLException ex) {
    		System.out.println(ex.getMessage());
    	}
    	
    }
    
    
    
    
    
    
    
    
    
}
