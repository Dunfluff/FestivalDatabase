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

public class VisitorGui{
	String newLine = System.getProperty("line.separator");
	
	private static DatabaseController controller = new DatabaseController();

	private JFrame frmMrtforsFestival;
	private JTable tableSchedule;
	
	private Object[] scenesStart;
	private Object[] bandNames;
	private Object[] memberNames;
	private String scenes;
	
	private JComboBox<String> comboChooseScene;
	private JComboBox<String> comboChooseBand;
	private JComboBox<String> comboBandMembers;

	private JTextPane tpBandName;

	private JTextPane sceneInfo;

	private JTextPane tpBandCountry;

	private JTextPane tpMemberInfo;

	private JTextPane tpBandScene;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisitorGui window = new VisitorGui(controller);
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
	public VisitorGui(DatabaseController controller) {	
		updateCombo();
		initialize();
		controller.chooseScene((String)comboChooseScene.getSelectedItem(), sceneInfo);
		controller.chooseBand((String)comboChooseBand.getSelectedItem(), tpBandName, tpBandCountry, comboBandMembers);
		
	}
	
	private void updateCombo() {
		scenesStart = controller.getAllScenes().toArray();
		bandNames = controller.getAllBands().toArray();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrtforsFestival = new JFrame();
		frmMrtforsFestival.getContentPane().setBackground(Color.PINK);
		frmMrtforsFestival.getContentPane().setLayout(null);
		
		comboChooseScene = new JComboBox(scenesStart);
		comboChooseBand = new JComboBox(bandNames);
		comboBandMembers = new JComboBox();
		
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
		
		JLabel lblBandName = new JLabel("Band Name");
		lblBandName.setBounds(422, 386, 113, 20);
		frmMrtforsFestival.getContentPane().add(lblBandName);
		
		JLabel lblMembers = new JLabel("Members");
		lblMembers.setBounds(422, 458, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblMembers);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(422, 422, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblCountry);
		
		JLabel lblMemberFunFact = new JLabel("Member Fun Fact");
		lblMemberFunFact.setBounds(422, 494, 145, 20);
		frmMrtforsFestival.getContentPane().add(lblMemberFunFact);

		// All combo boxes
		
		comboChooseBand.setBounds(151, 383, 186, 26);
		frmMrtforsFestival.getContentPane().add(comboChooseBand);
		comboChooseBand.setName("comboChooseBand");
		comboChooseBand.addActionListener(e ->{	controller.chooseBand((String)comboChooseBand.getSelectedItem(), tpBandName, tpBandCountry, comboBandMembers);});
		
		comboChooseScene.setBounds(151, 143, 168, 26);
		frmMrtforsFestival.getContentPane().add(comboChooseScene);
		comboChooseScene.setName("comboChooseScene");
		comboChooseScene.addActionListener(e ->{	controller.chooseScene((String)comboChooseScene.getSelectedItem(), sceneInfo);});
		
		comboBandMembers.setBounds(551, 452, 186, 26);
		frmMrtforsFestival.getContentPane().add(comboBandMembers);
		comboBandMembers.setName("comboBandMembers");
		comboBandMembers.addActionListener(e ->{controller.chooseMember((String)comboBandMembers.getSelectedItem(), tpMemberInfo);});
		
		
//		tableSchedule = new JTable();
//		tableSchedule.setBounds(460, 317, 327, 148);
//		frmMrtforsFestival.getContentPane().add(tableSchedule);
		
		// All text panes 
		tpBandName = new JTextPane();
		tpBandName.setEditable(false);
		tpBandName.setBounds(551, 380, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpBandName);
		
		sceneInfo = new JTextPane();
		sceneInfo.setBounds(422, 143, 300, 180);
		frmMrtforsFestival.getContentPane().add(sceneInfo);
		
		tpBandCountry = new JTextPane();
		tpBandCountry.setEditable(false);
		tpBandCountry.setBounds(551, 416, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpBandCountry);
		
		tpMemberInfo = new JTextPane();
		tpMemberInfo.setEditable(false);
		tpMemberInfo.setBounds(551, 491, 186, 26);
		frmMrtforsFestival.getContentPane().add(tpMemberInfo);
		

		frmMrtforsFestival.setBackground(Color.PINK);
		frmMrtforsFestival.setTitle("M\u00F6rtfors Festival");
		frmMrtforsFestival.setBounds(100, 100, 1040, 706);
		frmMrtforsFestival.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
//		JComboBox box = (JComboBox) e.getSource();
//		switch (box.getName()) {
//		case "comboChooseBand":
//			controller.chooseBand((String)box.getSelectedItem(), tpBandName, tpBandCountry, comboBandMembers);
//			
//		case "comboBandMembers":
//			controller.chooseMember((String)box.getSelectedItem(), tpMemberInfo);
//			
//		case "comboChooseScene":
//			controller.chooseScene((String)box.getSelectedItem(), sceneInfo);
//			
//		}
//			
//		
//	}

	
	
}
