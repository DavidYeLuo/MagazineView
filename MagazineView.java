import javax.swing.*;

public class MagazineView
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MagazinePanel());
		frame.pack();
		frame.setVisible(true);
	}
}