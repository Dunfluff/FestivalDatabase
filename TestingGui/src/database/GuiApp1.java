package database;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiApp1 {
	// Note: Typically the main method will be in a
	// separate class. As this is a simple one class
	// example it's all in the one class.
	public static void main(String[] args) {
		new GuiApp1();
	}

	public GuiApp1() {
		JFrame guiFrame = new JFrame();
		
		// make sure the program exits when the frame closes
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Festival Time");
		guiFrame.setSize(1200, 950);
		
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		
		// Options for the JComboBox
		String[] fruitOptions = { "Scen1", "Scen2", "Scen3", "Scen4"};
		
		
		// Options for the JList
		String[] vegOptions = { "Rolling Stones", "Gorillaz", "Chance The Rapper", "ABBA", "Prince" };
		
		// The first JPanel contains a JLabel and JCombobox
		
		final JPanel comboPanel = new JPanel();
		JLabel comboLbl = new JLabel("Scen:");
		JLabel Bandlbl = new JLabel("Band Name: ");
		
		JComboBox fruits = new JComboBox(fruitOptions);
		comboPanel.add(comboLbl);
		comboPanel.add(fruits);
		comboPanel.add(Bandlbl);
		
		
		// Create the second JPanel. Add a JLabel and JList and
		// make use the JPanel is not visible.
		final JPanel listPanel = new JPanel();
		listPanel.setVisible(true);
		JLabel listLbl = new JLabel("Vegetables:");
		JLabel lblCountry = new JLabel("Country: ");
		JList vegs = new JList(vegOptions);
		vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listPanel.add(listLbl);
		listPanel.add(vegs);
		listPanel.add(lblCountry);
		JButton vegFruitBut = new JButton("Fruit or Veg");
		
		// The ActionListener class is used to handle the
		// event that happens when the user clicks the button.
		// As there is not a lot that needs to happen we can
		// define an anonymous inner class to make the code simpler.
		vegFruitBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// When the fruit of veg button is pressed
				// the setVisible value of the listPanel and
				// comboPanel is switched from true to
				// value or vice versa.
				listPanel.setVisible(!listPanel.isVisible());
				comboPanel.setVisible(!comboPanel.isVisible());
			}
		});
		
		// The JFrame uses the BorderLayout layout manager.
		// Put the two JPanels and JButton in different areas.
		guiFrame.add(comboPanel, BorderLayout.NORTH);
		guiFrame.add(listPanel, BorderLayout.CENTER);
		guiFrame.add(vegFruitBut, BorderLayout.SOUTH);
		// make sure the JFrame is visible
		guiFrame.setVisible(true);
	}
}