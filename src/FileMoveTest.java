import java.awt.EventQueue;

import javax.swing.JFrame;

public class FileMoveTest {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				FileMoveJFrame frame = new FileMoveJFrame();
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
