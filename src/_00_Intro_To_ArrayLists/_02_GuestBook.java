package _00_Intro_To_ArrayLists;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
          static JFrame frame = new JFrame();
          static JPanel panel = new JPanel();
          static JButton viewNames = new JButton();
          static JButton addNames = new JButton();
          ArrayList<String> names = new ArrayList<String>();
      public void start() {
		  panel.add(viewNames);
		panel.add(addNames);
		frame.add(panel);
		addNames.addActionListener(this);
		viewNames.addActionListener(this);
		addNames.setText("Add Names");
		viewNames.setText("View Names");
		frame.setVisible(true); 
	}
      
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addNames) {
			String response = JOptionPane.showInputDialog("Please enter a name");
			  
			  names.add(response);
		}
		if(e.getSource() == viewNames) {
            printArrayList(names);
		}
	}

 void printArrayList(ArrayList<String> strings) {
for(int i = 0; i < strings.size(); i++) {
	String s = strings.get(i);
	JOptionPane.showMessageDialog(null, " Guest " + i + ":" + " " + s);
}
}
}