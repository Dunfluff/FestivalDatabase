package database;

import java.sql.Connection;
import java.sql.DriverManager;
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
}