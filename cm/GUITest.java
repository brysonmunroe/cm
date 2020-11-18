package cm;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 300;

	public static void main(String[] args) {
		// so far, all our programs were sequential
		//they reached the END - finito, " long silence - just kidding"
		
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");
		JButton dontPushMe = new JButton("Do Not Push Me");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(dontPushMe);
		
		frame.pack();
		
		frame.setVisible(true);
	}

}
