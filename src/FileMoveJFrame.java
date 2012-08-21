import javax.swing.JFrame;

public class FileMoveJFrame extends JFrame {
	
	FileMoveJPanel panel;
	
	public FileMoveJFrame() {
		
		setTitle("Move Files");
		panel = new FileMoveJPanel();
		add(panel);
	}
}