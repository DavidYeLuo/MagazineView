import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

public class MagazineViewPanel extends JPanel
{
	MagazineList list;
	// Components
	JPanel topPanel;
	JPanel bottomPanel;
	JButton insertButton;
	JButton addButton;
	JButton deleteButton;
	JButton deleteAllButton;
	JTextField addTextField;
	JTextField deleteTextField;
	JTextArea textArea;
	
	public MagazineViewPanel()
	{
		// This panel
		setPreferredSize(new Dimension(600,600));
		setLayout(new BorderLayout());
		
		// initialization
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		insertButton = new JButton("Insert");
		addButton = new JButton("Add");
		deleteButton = new JButton("Delete");
		deleteAllButton = new JButton("Delete all");
		addTextField = new JTextField(10);
		deleteTextField = new JTextField(10);
		textArea = new JTextArea();
		
		list = new MagazineList();
		
		addButton.addActionListener(new AddButtonListener());
		insertButton.addActionListener(new InsertButtonListener());
		deleteButton.addActionListener(new DeleteButtonListener());
		deleteAllButton.addActionListener(new DeleteAllButtonListener());
		
		textArea.setEditable(false);
		
		topPanel.add(addTextField);
		topPanel.add(addButton);
		topPanel.add(insertButton);
		
		bottomPanel.add(deleteTextField);
		bottomPanel.add(deleteButton);
		bottomPanel.add(deleteAllButton);
		
		add(topPanel, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);  // middle
		add(bottomPanel, BorderLayout.SOUTH);
	}
	// Shows the list
	public void update()
	{
		textArea.setText(list.toString());
	}
	
	private class AddButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			list.add(new Magazine(addTextField.getText()));
			addTextField.setText(null);  // clears text area
			addTextField.grabFocus();  // stay on text area
			update();
		}
	}
	private class InsertButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			list.insert(new Magazine(addTextField.getText()));
			addTextField.setText(null);  // clears text area
			addTextField.grabFocus();  //  stay on text area
			update();
		}
	}
	private class DeleteButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			list.delete(new Magazine(deleteTextField.getText()));
			deleteTextField.setText(null);  // clears text area
			deleteTextField.grabFocus();  //  stay on text area
			update();
		}
	}
	private class DeleteAllButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			list.deleteAll();
			update();
		}
	}
}