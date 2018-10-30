package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VisitorGui {
	String newLine = System.getProperty("line.separator");

	private JFrame frmMrtforsFestival;
	private JTable tableSchedule;
	
	private String[] sceneNames = {"Big Betty", "Grand Master", "Little Miss"};
	private String[] bandNames = {"Rolling Stones", "Prince", "Chance The Rapper"};
	private String[] memberNames = {"Putin", "Stalin", "Pol Pott", "Diana"};
	private String scenes;
	
	 public String displayScene(ResultSet rs) throws SQLException {
		 
	    	rs.next();
	    	scenes = (rs.getString("SceneName") + newLine
	                + rs.getString("BandName") +  "\t"
	                + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
	        while (rs.next()) {
	           scenes = (rs.getString("BandName") +  "\t"
	                     + rs.getString("StartTime") + "-" + rs.getString("EndTime"));
	           
	        }
	        
	        return scenes;
	    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisitorGui window = new VisitorGui();
					window.frmMrtforsFestival.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisitorGui() {
		initialize();
	
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrtforsFestival = new JFrame();
		frmMrtforsFestival.getContentPane().setBackground(Color.PINK);
		frmMrtforsFestival.getContentPane().setLayout(null);
		
		JLabel lblMrtforsFestival = new JLabel("M\u00F6rtfors Festival");
		lblMrtforsFestival.setForeground(Color.WHITE);
		lblMrtforsFestival.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 33));
		lblMrtforsFestival.setBounds(339, 16, 260, 36);
		frmMrtforsFestival.getContentPane().add(lblMrtforsFestival);
		
		JLabel lblScenes = new JLabel("Scenes");
		lblScenes.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblScenes.setBounds(26, 100, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblScenes);
		
		JLabel lblBands = new JLabel("Bands");
		lblBands.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBands.setBounds(26, 333, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblBands);
		
		JLabel lblSceneSchedule = new JLabel("Scene Schedule");
		lblSceneSchedule.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblSceneSchedule.setBounds(407, 101, 157, 20);
		frmMrtforsFestival.getContentPane().add(lblSceneSchedule);
		
		JLabel lblBandInfo = new JLabel("Band Info");
		lblBandInfo.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBandInfo.setBounds(407, 333, 161, 20);
		frmMrtforsFestival.getContentPane().add(lblBandInfo);
		
		JLabel lblChooseScene = new JLabel("Choose Scene:");
		lblChooseScene.setBounds(26, 146, 113, 20);
		frmMrtforsFestival.getContentPane().add(lblChooseScene);
		
		JLabel lblChooseBand = new JLabel("Choose Band: ");
		lblChooseBand.setBounds(26, 386, 113, 20);
		frmMrtforsFestival.getContentPane().add(lblChooseBand);
		

		
		JComboBox comboChooseBand = new JComboBox(bandNames);
		comboChooseBand.setBounds(151, 383, 186, 26);
		frmMrtforsFestival.getContentPane().add(comboChooseBand);
		
		 
		JComboBox comboChooseScene = new JComboBox(sceneNames);
		comboChooseScene.setBounds(151, 143, 168, 26);
		frmMrtforsFestival.getContentPane().add(comboChooseScene);
	
		
		JLabel lblBandName = new JLabel("Band Name");
		lblBandName.setBounds(422, 386, 113, 20);
		frmMrtforsFestival.getContentPane().add(lblBandName);
		
		JLabel lblMembers = new JLabel("Members");
		lblMembers.setBounds(422, 494, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblMembers);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(422, 422, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblCountry);
		
		JLabel lblMemberFunFact = new JLabel("Member Fun Fact");
		lblMemberFunFact.setBounds(419, 530, 145, 20);
		frmMrtforsFestival.getContentPane().add(lblMemberFunFact);
		
		tableSchedule = new JTable();
		tableSchedule.setBounds(460, 317, 327, -148);
		frmMrtforsFestival.getContentPane().add(tableSchedule);
		
		JTextPane tpBandName = new JTextPane();
		tpBandName.setEditable(false);
		tpBandName.setBounds(551, 380, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpBandName);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(658, 431, -4, 26);
		frmMrtforsFestival.getContentPane().add(textPane_1);
		
		JTextPane tpBandCountry = new JTextPane();
		tpBandCountry.setEditable(false);
		tpBandCountry.setBounds(551, 416, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpBandCountry);
		
		JComboBox comboBandMembers = new JComboBox(memberNames);
		comboBandMembers.setBounds(551, 491, 186, 26);
		frmMrtforsFestival.getContentPane().add(comboBandMembers);
		
		JTextPane tpMemberInfo = new JTextPane();
		tpMemberInfo.setEditable(true);
		tpMemberInfo.setBounds(551, 530, 188, 26);
		frmMrtforsFestival.getContentPane().add(tpMemberInfo);
		
		JLabel lblPlayingAt = new JLabel("Playing at");
		lblPlayingAt.setBounds(422, 458, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblPlayingAt);
		
		JTextPane tpBandScene = new JTextPane();
		tpBandScene.setEditable(false);
		tpBandScene.setBounds(551, 452, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpBandScene);
		frmMrtforsFestival.setBackground(Color.PINK);
		frmMrtforsFestival.setTitle("M\u00F6rtfors Festival");
		frmMrtforsFestival.setBounds(100, 100, 1040, 706);
		frmMrtforsFestival.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
}
