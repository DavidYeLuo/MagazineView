import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class MagazineViewPanel extends JPanel
{
	MagazineList list;
	// Components
	JPanel topPanel;
	JPanel bottomPanel;
	JButton listButton;
	JButton addButton;
	JButton deleteButton;
	JButton deleteAllButton;
	JTextField textField;
	public MagazineViewPanel()
	{
		// This panel
		setPreferredSize(new Dimension(600,600));
		setLayout(new BorderLayout());
		
		// initialization
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		listButton = new JButton("List");
		addButton = new JButton("Add");
		deleteButton = new JButton("Delete");
		deleteAllButton = new JButton("Delete all");
		textField = new JTextField(10);
		// NOTE:
		// Probably should have stored
		// the instance variables to use them
		// like add ActionListener
		// Plan:
		// create listener classes inside this class
		// add the action listener to buttons
		
		topPanel.add(textField);
		topPanel.add(addButton);
		topPanel.add(listButton);
		
		bottomPanel.add(textField);
		bottomPanel.add(deleteButton);
		bottomPanel.add(deleteAllButton);
		
		add(topPanel, BorderLayout.NORTH);
		add(new JTextArea());  // 
		add(bottomPanel, BorderLayout.SOUTH);
	}
	
}