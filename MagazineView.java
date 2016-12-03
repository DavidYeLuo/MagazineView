/**
 * MagazineView --- A GUI that collects your magazine titles.
 * @author          David Ye Luo, Kenta Medina
 * @version         1.0
 * @since           2016-12-3
 */
//-----------------------------------------------------------
// 1) Initialize list
// 2) Have a TextArea to show all the list
// 3) Create buttons
//    A) Add
//    B) Insert
//    C) Delete
//    D) Delete all
// 4) Put functions to the buttons
// 5) Add them all to the program
//-----------------------------------------------------------
import javax.swing.*;

public class MagazineView
{
	/**
	* Initializes the program
	* @param arg A string array containing 
	* the command line arguments.
	* @exception Any exception
	* @return    No return value.
	*/ 
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MagazineView");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MagazineViewPanel());
		frame.pack();
		frame.setVisible(true);
	}
}