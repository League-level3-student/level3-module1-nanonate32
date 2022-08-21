package _06_Intro_To_Hash_Maps;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	HashMap<Integer, String> logSearch = new HashMap<Integer, String>();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton addEntry = new JButton();
	JButton searchID = new JButton();
	JButton viewList = new JButton();
	JButton removeEntry = new JButton();

	public void start() {
	
		panel.add(addEntry);
		panel.add(searchID);
		panel.add(viewList);
		panel.add(removeEntry);
			frame.add(panel);
		addEntry.setText( "Add Entry");
		searchID.setText( "Search ID");
		viewList.setText( "View List");
		removeEntry.setText( "Remove Entry");
		
		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		frame.setPreferredSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addEntry) {
               String ID = JOptionPane.showInputDialog("Enter an ID number");
               String name = JOptionPane.showInputDialog("Enter a name");
               int IDnum = Integer.parseInt(ID);
               logSearch.put(IDnum, name);
               
		}
		if (e.getSource() == searchID) {
           String IDnum = JOptionPane.showInputDialog("Enter an ID number");
           if(logSearch.containsKey(IDnum)) {
        	   System.out.println("ID: " + IDnum + ", name: " + logSearch.get(IDnum));
           }
           else {
        	   JOptionPane.showMessageDialog(null, "That name does not exist");
           }
		}
		if (e.getSource() == viewList) {
			for(Integer i : logSearch.keySet()){
	            System.out.println("ID: " + i + ", name: " + logSearch.get(i));
		}
		if (e.getSource() == removeEntry) {
			 String IDnum = JOptionPane.showInputDialog("Enter an ID number");
			  if(logSearch.containsKey(IDnum)){
				  logSearch.remove(IDnum);
			  }
			  else {
				  JOptionPane.showMessageDialog(null, "That name does not exist");
			  }
		}

	}
}
}
