package javax.swing;

public class JFrame
{
	private static final String EXIT_ON_CLOSE = null;

	public static void main(String args[])
	{
	JFrame frame=new JFrame();
	frame.setSize(100, 100);
	frame.setDefaultCloseOpreation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    JPanel panel =new JPanel();
   }
}