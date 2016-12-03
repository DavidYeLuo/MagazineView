/**
 * MagazineViewPanel --- A GUI that collects your magazine titles.
 * @author               David Ye Luo, Kenta Medina
 * @version              1.0
 * @since                2016-12-3
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
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
	
    //-----------------------------------------------------------------
    //  Default Constructor
    //-----------------------------------------------------------------
	public MagazineViewPanel()
	{
		// This panel
		setPreferredSize(new Dimension(600,600));
		setLayout(new BorderLayout());
		
		// initialization
		list = new MagazineList();
		
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		insertButton = new JButton("Insert");
		addButton = new JButton("Add");
		deleteButton = new JButton("Delete");
		deleteAllButton = new JButton("Delete all");
		addTextField = new JTextField(10);
		deleteTextField = new JTextField(10);
		textArea = new JTextArea();
		
		// Listeners
		addButton.addActionListener(new AddButtonListener());
		insertButton.addActionListener(new InsertButtonListener());
		deleteButton.addActionListener(new DeleteButtonListener());
		deleteAllButton.addActionListener(new DeleteAllButtonListener());
		addTextField.addKeyListener(new AddButtonKeyListener());
		deleteTextField.addKeyListener(new DeleteButtonKeyListener());
		
		textArea.setEditable(false);  // Quite annoying its editable
		
		// Adding components to new panels
		topPanel.add(addTextField);
		topPanel.add(addButton);
		topPanel.add(insertButton);
		bottomPanel.add(deleteTextField);
		bottomPanel.add(deleteButton);
		bottomPanel.add(deleteAllButton);
		
		// Adding the panels to the layouts
		add(topPanel, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}
	
	//-----------------------------------------------------------------
	//  Refreshes the text area
	//-----------------------------------------------------------------	
	public void update()
	{
		textArea.setText(list.toString());
	}
	
	/**
	 * AddButtonListener --- Sends event object when button pressed.
	 * @author               David Ye Luo, Kenta Medina
	 * @version              1.0
	 * @since                2016-12-3
	 */
	private class AddButtonListener implements ActionListener
	{
		//-----------------------------------------------------------------
		//  When Button is pressed
		//-----------------------------------------------------------------	
		public void actionPerformed(ActionEvent arg0) 
		{
			list.add(new Magazine(addTextField.getText()));
			addTextField.setText(null);  // clears text area
			addTextField.grabFocus();  // stay on text area
			update();
		}
	}
	
	/**
	 * InsertButtonListener --- Sends event object when button pressed.
	 * @author                  David Ye Luo, Kenta Medina
	 * @version                 1.0
	 * @since                   2016-12-3
	 */
	private class InsertButtonListener implements ActionListener
	{
		//-----------------------------------------------------------------
		//  When Button is pressed
		//-----------------------------------------------------------------	
		public void actionPerformed(ActionEvent e) 
		{
			list.insert(new Magazine(addTextField.getText()));
			addTextField.setText(null);  // clears text area
			addTextField.grabFocus();  //  stay on text area
			update();
		}
	}
	
	/**
	 * DeleteButtonListener --- Sends event object when button pressed.
	 * @author                  David Ye Luo, Kenta Medina
	 * @version                 1.0
	 * @since                   2016-12-3
	 */
	private class DeleteButtonListener implements ActionListener
	{
		//-----------------------------------------------------------------
		//  When Button is pressed
		//-----------------------------------------------------------------	
		public void actionPerformed(ActionEvent e)
		{
			list.delete(new Magazine(deleteTextField.getText()));
			deleteTextField.setText(null);  // clears text area
			deleteTextField.grabFocus();  //  stay on text area
			update();
		}
	}
	
	/**
	 * DeleteAllButtonListener --- Sends event object when button pressed.
	 * @author                     David Ye Luo, Kenta Medina
	 * @version                    1.0
	 * @since                      2016-12-3
	 */
	private class DeleteAllButtonListener implements ActionListener
	{
		//-----------------------------------------------------------------
		//  When Button is pressed
		//-----------------------------------------------------------------	
		public void actionPerformed(ActionEvent e) 
		{
			list.deleteAll();
			update();
		}
	}
	
	/**
	 * AddButtonListener --- Sends event object when keyboard is pressed.
	 * @author               David Ye Luo, Kenta Medina
	 * @version              1.0
	 * @since                2016-12-3
	 */
	private class AddButtonKeyListener implements KeyListener
	{
		//-----------------------------------------------------------------
		//  When a key from the keyboard is pressed
		//-----------------------------------------------------------------	
		public void keyPressed(KeyEvent e) 
		{
			if(e.getKeyCode() == KeyEvent.VK_ENTER) // checks for the enter key
			{
				list.add(new Magazine(addTextField.getText()));
				addTextField.setText(null);  // clears text area
				addTextField.grabFocus();  // stay on text area
				update();
			}
		}
		//-----------------------------------------------------------------
		//  When a key from the keyboard is released after pressed
		//-----------------------------------------------------------------	
		@Override
		public void keyReleased(KeyEvent arg0) {}
		//-----------------------------------------------------------------
		//  When a key from the keyboard is typed
		//-----------------------------------------------------------------	
		@Override
		public void keyTyped(KeyEvent e) {}
	}
	
	/**
	 * DeleteAllButtonListener --- Sends event object when keyboard is pressed.
	 * @author                     David Ye Luo, Kenta Medina
	 * @version                    1.0
	 * @since                      2016-12-3
	 */
	private class DeleteButtonKeyListener implements KeyListener
	{
		//-----------------------------------------------------------------
		//  When a key from the keyboard is pressed
		//-----------------------------------------------------------------	
		public void keyPressed(KeyEvent e) 
		{
			if(e.getKeyCode() == KeyEvent.VK_ENTER)
			{
				list.delete(new Magazine(deleteTextField.getText()));
				deleteTextField.setText(null);  // clears text area
				deleteTextField.grabFocus();  //  stay on text area
				update();
			}
		}
		//-----------------------------------------------------------------
		//  When a key from the keyboard is released after pressed
		//-----------------------------------------------------------------	
		@Override
		public void keyReleased(KeyEvent arg0) {}
		//-----------------------------------------------------------------
		//  When a key from the keyboard is typed
		//-----------------------------------------------------------------	
		@Override
		public void keyTyped(KeyEvent e) {}
	}
}