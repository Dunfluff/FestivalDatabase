package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class AdminGui {

	private JFrame frmMrtforsFestivalAdministration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGui window = new AdminGui();
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
	public AdminGui() {
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
		
		JLabel lblBandName = new JLabel("Band Name");
		lblBandName.setBounds(666, 171, 114, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandName);
		
		JLabel lblStartTime = new JLabel("Start time");
		lblStartTime.setBounds(666, 210, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblStartTime);
		
		JLabel lblEndTime = new JLabel("End time");
		lblEndTime.setBounds(666, 246, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblEndTime);
		
		JComboBox comboSceneName = new JComboBox();
		comboSceneName.setBounds(793, 127, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboSceneName);
		
		JComboBox comboBandName = new JComboBox();
		comboBandName.setBounds(793, 168, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboBandName);
		
		JLabel lblNewBand = new JLabel("New Band");
		lblNewBand.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewBand.setBounds(15, 101, 123, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblNewBand);
		
		JLabel lblBandName_1 = new JLabel("Band Name");
		lblBandName_1.setBounds(15, 130, 102, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandName_1);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(15, 171, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblCountry);
		
		JButton btnSavePerformance = new JButton("Save Performance");
		btnSavePerformance.setBounds(733, 282, 170, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSavePerformance);
		
		JLabel lblMembers = new JLabel("Band Name");
		lblMembers.setBounds(15, 421, 102, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMembers);
		
		JButton btnSaveBand = new JButton("Save Band");
		btnSaveBand.setBounds(66, 282, 158, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveBand);
		
		JLabel lblAssignWorker = new JLabel("Assign Worker ");
		lblAssignWorker.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblAssignWorker.setBounds(315, 101, 132, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblAssignWorker);
		
		JLabel lblWorkerPNR = new JLabel("Worker PNR");
		lblWorkerPNR.setBounds(315, 133, 104, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorkerPNR);
		
		JTextPane tpWorkerName = new JTextPane();
		tpWorkerName.setBounds(463, 130, 123, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpWorkerName);
		
		JLabel lblToBand = new JLabel("To Band");
		lblToBand.setBounds(315, 171, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblToBand);
		
		JTextPane tpWorkerBand = new JTextPane();
		tpWorkerBand.setBounds(463, 171, 124, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpWorkerBand);
		
		JTextPane tpBandName = new JTextPane();
		tpBandName.setBounds(119, 130, 133, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpBandName);
		
		JTextPane tpBandCountry = new JTextPane();
		tpBandCountry.setBounds(119, 165, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpBandCountry);
		
		JLabel lblMembers_1 = new JLabel("Members");
		lblMembers_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMembers_1.setBounds(97, 334, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMembers_1);
		
		JLabel lblAddMemberTo = new JLabel("Add Member To Band");
		lblAddMemberTo.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblAddMemberTo.setBounds(15, 370, 164, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblAddMemberTo);
		
		JComboBox comboMembarBandName = new JComboBox();
		comboMembarBandName.setBounds(139, 418, 141, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(comboMembarBandName);
		
		JLabel lblMemberName = new JLabel("Member Name");
		lblMemberName.setBounds(15, 457, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMemberName);
		
		JTextPane tpMemberName = new JTextPane();
		tpMemberName.setBounds(138, 451, 142, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpMemberName);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setBounds(15, 493, 112, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblInformation);
		
		JTextPane tpMemberInfo = new JTextPane();
		tpMemberInfo.setBounds(237, 530, -89, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpMemberInfo);
		
		JTextPane tpInfo = new JTextPane();
		tpInfo.setBounds(139, 487, 141, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(tpInfo);
		
		JButton btnSaveMember = new JButton("Save Member");
		btnSaveMember.setBounds(45, 571, 188, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveMember);
		
		JButton btnSaveWorker = new JButton("Save Worker");
		btnSaveWorker.setBounds(399, 282, 158, 29);
		frmMrtforsFestivalAdministration.getContentPane().add(btnSaveWorker);
		
		JLabel lblBookGig = new JLabel("Book Gig");
		lblBookGig.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblBookGig.setBounds(666, 101, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBookGig);
		
		JLabel lblBandId = new JLabel("Band ID");
		lblBandId.setBounds(15, 210, 69, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblBandId);
		
		JLabel lblWorkerId = new JLabel("Worker ID");
		lblWorkerId.setBounds(315, 210, 81, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblWorkerId);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(119, 204, 133, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(463, 210, 123, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(924, 210, -115, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(795, 240, 132, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(793, 204, 134, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane_4);
		
		JLabel lblMusicianId = new JLabel("Musician ID");
		lblMusicianId.setBounds(15, 529, 82, 20);
		frmMrtforsFestivalAdministration.getContentPane().add(lblMusicianId);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(142, 523, 138, 26);
		frmMrtforsFestivalAdministration.getContentPane().add(textPane_5);
	}
}
