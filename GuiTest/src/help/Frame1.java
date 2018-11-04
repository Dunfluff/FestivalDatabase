package help;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class Frame1 {

	private JFrame frmMrtforsFestival;
	private JTable tableSchedule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrtforsFestival = new JFrame();
		frmMrtforsFestival.setTitle("M\u00F6rtfors Festival");
		frmMrtforsFestival.getContentPane().setBackground(Color.PINK);
		frmMrtforsFestival.setBackground(Color.YELLOW);
		frmMrtforsFestival.setBounds(100, 100, 934, 590);
		frmMrtforsFestival.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMrtforsFestival.getContentPane().setLayout(null);
		
		JLabel lblMortforsFestival = new JLabel("M\u00F6rtfors Festival ");
		lblMortforsFestival.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 20));
		lblMortforsFestival.setBounds(367, 16, 190, 20);
		frmMrtforsFestival.getContentPane().add(lblMortforsFestival);
		
		JLabel lblBands = new JLabel("Scenes");
		lblBands.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBands.setBounds(29, 78, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblBands);
		
		JLabel lblBand = new JLabel("Band");
		lblBand.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBand.setBounds(488, 78, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblBand);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setBounds(161, 146, 117, 26);
		frmMrtforsFestival.getContentPane().add(comboBox);
		
		JLabel lblSceneName = new JLabel("Scene Name");
		lblSceneName.setBounds(29, 149, 117, 20);
		frmMrtforsFestival.getContentPane().add(lblSceneName);
		
		JLabel lblBandName = new JLabel("Band Name");
		lblBandName.setBounds(488, 149, 104, 20);
		frmMrtforsFestival.getContentPane().add(lblBandName);
		
		JLabel lblMembers = new JLabel("Members");
		lblMembers.setBounds(488, 194, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblMembers);
		
		JLabel lblCountryOfOrigin = new JLabel("Country of Origin");
		lblCountryOfOrigin.setBounds(488, 230, 135, 20);
		frmMrtforsFestival.getContentPane().add(lblCountryOfOrigin);
		
		JLabel lblFunFacts = new JLabel("Fun Facts");
		lblFunFacts.setBounds(488, 266, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblFunFacts);
		
		JLabel lblPlayingAt = new JLabel("Playing at");
		lblPlayingAt.setBounds(488, 302, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblPlayingAt);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setBounds(29, 213, 69, 20);
		frmMrtforsFestival.getContentPane().add(lblSchedule);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(642, 146, 159, 26);
		frmMrtforsFestival.getContentPane().add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.ORANGE);
		textArea.setBounds(310, 213, -145, 22);
		frmMrtforsFestival.getContentPane().add(textArea);
		
		JTextArea txtrPeopleInBand = new JTextArea();
		txtrPeopleInBand.setText("people in band");
		txtrPeopleInBand.setEditable(false);
		txtrPeopleInBand.setBounds(642, 194, 135, 22);
		frmMrtforsFestival.getContentPane().add(txtrPeopleInBand);
		
		tableSchedule = new JTable();
		tableSchedule.setBounds(38, 325, 97, -55);
		frmMrtforsFestival.getContentPane().add(tableSchedule);
	}
}
