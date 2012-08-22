import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class FileMoveJPanel extends JPanel{
	
	JLabel moveFrom;
	JLabel moveTo;
	JLabel informer;
	JTextField jTextOne;
	JTextField jTextTwo;
	JButton browse1;
	JButton browse2;
	JButton button;
	
	public FileMoveJPanel(){
		
		GridLayout gl = new GridLayout(3,3,2,2);
		setLayout(gl);
		
		moveFrom = new JLabel("moveFrom");
		moveTo = new JLabel("moveTo");
		jTextOne = new JTextField(20);
		jTextTwo = new JTextField(20);
		browse1 = new JButton("Browse");
		browse2 = new JButton("Browse");
		button = new JButton("Move");
		informer = new JLabel("");
		
		add(moveFrom);
		add(jTextOne);
		add(browse1);
		add(moveTo);
		add(jTextTwo);
		add(browse2);
		add(button);
		add(informer);

		FileMoveActionListener fileMove = new FileMoveActionListener(this);
		browse1.addActionListener(fileMove);
		browse2.addActionListener(fileMove);
		button.addActionListener(fileMove);
	}

}
