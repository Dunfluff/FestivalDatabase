package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class AdminGui {
	
	private static DatabaseController controller = new DatabaseController();

	private JFrame frmMrtforsFestivalAdministration;
	
	private JTextPane tpBandId = new JTextPane();
	private JTextPane tpBandName = new JTextPane();
	private JTextPane tpBandOrigin = new JTextPane();
	private JComboBox comboBandWorker = new JComboBox();
	
	private JTextPane tpWorkerId = new JTextPane();
	private JTextPane tpWorkerPNR = new JTextPane();
	private JTextPane tpWorkerAddress = new JTextPane();
	
	private JComboBox<String> comboSceneName = new JComboBox();
	private JComboBox comboBandName = new JComboBox();
	private JTextPane tpStartTime = new JTextPane();
	private JTextPane tpEndTime = new JTextPane();
	
	private JComboBox comboMemberBandName = new JComboBox();
	private JTextPane tpMemberName = new JTextPane();
	private JTextPane tpMemberInfo = new JTextPane();
	private JTextPane tpMusicianID = new JTextPane();
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGui window = new AdminGui(controller);
					window.frmMrtforsFestivalAdministration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminGui(DatabaseController controller) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrtforsFestivalAdministration = new JFrame();
		frmMrtforsFestivalAdministration.getContentPane().setBackground(Color.PINK);
		frmMrtforsFestivalAdministration.setTitle("M\u00F6rtfors Festival Administration");
		frmMrtforsFestivalAdministration.setBounds(100, 100, 1008, 672);
		frmMrtforsFestivalAdministration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMrtforsFestivalAdministration.getContentPane().setLayout(null);
		
		JLabel lblBands = new JLabel("Bands");
		lblBands.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBands.setBounds(110, 56, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBands);
		
		JLabel lblWorkers = new JLabel("Workers");
		lblWorkers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWorkers.setBounds(409, 56, 104, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorkers);
		
		JLabel lblPerformance = new JLabel("Performance");
		lblPerformance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPerformance.setBounds(718, 56, 158, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblPerformance);
		
		JLabel lblSceneName = new JLabel("Scene Name");
		lblSceneName.setBounds(666, 130, 104, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblSceneName);
		
		JLabel lblWorker = new JLabel("Worker");
		lblWorker.setBounds(15, 246, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorker);
		
		JLabel lblBandName = new JLabel("Band Name");
		lblBandName.setBounds(666, 171, 114, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandName);
		
		JLabel lblStartTime = new JLabel("Start time");
		lblStartTime.setBounds(666, 210, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblStartTime);
		
		JLabel lblEndTime = new JLabel("End time");
		lblEndTime.setBounds(666, 246, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblEndTime);
		
		JLabel lblNewBand = new JLabel("New Band");
		lblNewBand.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewBand.setBounds(15, 101, 123, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblNewBand);
		
		JLabel lblBandName_1 = new JLabel("Band Name");
		lblBandName_1.setBounds(15, 171, 102, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandName_1);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(15, 210, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblCountry);
		
		JLabel lblAssignWorker = new JLabel("Assign Worker ");
		lblAssignWorker.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblAssignWorker.setBounds(315, 101, 132, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblAssignWorker);
		
		JLabel lblWorkerPNR = new JLabel("Worker PNR");
		lblWorkerPNR.setBounds(315, 174, 104, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorkerPNR);
		
		JLabel lblMembers = new JLabel("Band Name");
		lblMembers.setBounds(15, 421, 102, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMembers);
		
		JLabel lblToBand = new JLabel("Address");
		lblToBand.setBounds(315, 214, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblToBand);
		
		JLabel lblMemberName = new JLabel("Member Name");
		lblMemberName.setBounds(15, 457, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMemberName);
		
		JLabel lblMembers_1 = new JLabel("Members");
		lblMembers_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMembers_1.setBounds(97, 334, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMembers_1);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setBounds(15, 493, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblInformation);
		
		JLabel lblBookGig = new JLabel("Book Gig");
		lblBookGig.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblBookGig.setBounds(666, 101, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBookGig);
		
		JLabel lblBandId = new JLabel("Band ID");
		lblBandId.setBounds(15, 133, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandId);
		
		JLabel lblMusicianId = new JLabel("Musician ID");
		lblMusicianId.setBounds(15, 529, 82, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMusicianId);
		
		JLabel lblWorkerId = new JLabel("Worker ID");
		lblWorkerId.setBounds(315, 137, 81, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorkerId);
		
		JLabel lblAddMemberTo = new JLabel("Add Member To Band");
		lblAddMemberTo.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblAddMemberTo.setBounds(15, 370, 164, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblAddMemberTo);
	
		
		comboBandWorker.setBounds(119, 243, 133, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboBandWorker);
			
		comboSceneName.setBounds(793, 127, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboSceneName);
		
		
		comboBandName.setBounds(793, 168, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboBandName);
		
		comboMemberBandName.setBounds(139, 418, 141, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboMemberBandName);
		
		tpWorkerPNR.setBounds(463, 165, 123, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpWorkerPNR);
		
		tpWorkerAddress.setBounds(462, 214, 124, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpWorkerAddress);
		
		tpBandId.setBounds(119, 130, 133, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpBandId);
		
		tpBandName.setBounds(119, 165, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpBandName);
		
		tpMemberName.setBounds(138, 451, 142, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpMemberName);
		
		tpBandOrigin.setBounds(119, 204, 133, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpBandOrigin);
		
		tpMemberInfo.setBounds(139, 487, 141, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpMemberInfo);
		
		tpWorkerId.setBounds(463, 124, 123, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpWorkerId);
		
		tpEndTime.setBounds(795, 240, 132, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpEndTime);
		
		tpStartTime.setBounds(793, 204, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpStartTime);
		
		tpMusicianID.setBounds(142, 523, 138, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpMusicianID);
		
		
		
		
		JButton btnSaveBand = new JButton("Save Band");
		btnSaveBand.setBounds(66, 282, 158, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveBand);
		btnSaveBand.addActionListener(e ->{
			int id = Integer.parseInt(tpBandId.getText());
			String name = tpBandName.getText();
			String origin = tpBandOrigin.getText();
			
			Band band = new Band(id, name, origin);
			
			controller.insertBandIntoTables(band);
			
		});
		
		
		JButton btnSaveWorker = new JButton("Save Worker");
		btnSaveWorker.setBounds(399, 282, 158, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveWorker);
		btnSaveWorker.addActionListener(e -> {
			int id = Integer.parseInt(tpWorkerId.getText());
			int pnr = Integer.parseInt(tpWorkerPNR.getText());
			String address = tpWorkerAddress.getText();
			
			Worker worker = new Worker(id, pnr, address);
			
			controller.insertWorkerIntoTables(worker);
			
		});
		
		JButton btnSavePerformance = new JButton("Save Performance");
		btnSavePerformance.setBounds(733, 282, 170, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSavePerformance);
		btnSavePerformance.addActionListener(e -> {
			
			
		});
		
		JButton btnSaveMember = new JButton("Save Member");
		btnSaveMember.setBounds(45, 571, 188, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveMember);
		btnSaveMember.addActionListener(e -> {
			
		});
		
		
		
	
		
		
	
	}
	
	public void setScenesGui(ArrayList<String> list) {
		String hold = "test";
		for(int i=0; i<list.size(); i++) {
			hold = list.get(i);
			comboSceneName.addItem(hold);
		}
	}
}
