import javax.swing.*;

/*
 *           BorderLayout
 * -----------------------------------
 * - Label   TextField   Button      -
 * -         TextArea                -
 * - Delete  Textfield   DeleteAll   -
 * -----------------------------------                           
 */

public class MagazineView
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MagazineView");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MagazineViewPanel());
		frame.pack();
		frame.setVisible(true);
	}
}