package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */
	JFrame frame = new JFrame();
	JButton addEntry = new JButton();
	JButton searchID = new JButton();
	JButton viewList = new JButton();
	JButton removeEntry = new JButton();

	public void start() {
		frame.add(addEntry);
		frame.add(searchID);
		frame.add(viewList);
		frame.add(removeEntry);
		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addEntry) {
               String ID = JOptionPane.showInputDialog("Enter an ID number");
               String name = JOptionPane.showInputDialog("Enter a name");
               
               
		}
		if (e.getSource() == addEntry) {

		}
		if (e.getSource() == addEntry) {

		}
		if (e.getSource() == addEntry) {

		}

	}
}
