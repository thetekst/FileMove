
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


import javax.swing.JFileChooser;

public class FileMoveActionListener implements ActionListener {
	
	FileMoveJPanel parent;
	JFileChooser jFileOne;
	File file1;
	File file2;
	String str1;
	String str2;
	String nameFile1;

	static int countPressed = 0;
	
	final String CATALOG = "E:\\video\\torrents\\";
	
	public FileMoveActionListener(FileMoveJPanel parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if(src == parent.browse1 || src == parent.browse2){
			
			jFileOne = new JFileChooser();
			jFileOne.setCurrentDirectory(new File(CATALOG));
			jFileOne.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			int ret = jFileOne.showDialog(null, "Открыть файл");

			if (src == parent.browse1){
				
				if(ret == JFileChooser.APPROVE_OPTION) {
					 file1 = jFileOne.getSelectedFile(); 
				} else{
					
				}
				
				str1 = file1.getPath();
				nameFile1 = file1.getName();
				parent.jTextOne.setText(str1);
				
			} else{
				
				if(ret == JFileChooser.APPROVE_OPTION) {
					 file2 = jFileOne.getSelectedFile(); 
				}
				
				str2 = file2.getPath();
				parent.jTextTwo.setText(str2 + "\\" + nameFile1);
			}
		} else if(src == parent.button){
			countPressed++;
			String text = parent.button.getText();
			String out = String.format("%s %d", text, countPressed);
			System.out.println(out);
			
			String textField2 = parent.jTextTwo.getText();
			
			
			file2 = new File(textField2);
			
			String strEquals1 = file1.getPath();
			String strEquals2 = file2.getPath();
			
			System.out.println("moveFrom: " + strEquals1);
			System.out.println("moveTo: " + strEquals2);

			File newF2 = new File(textField2);
			
			if (newF2.exists()){
				newF2.delete();
			}
		
			file1.renameTo(newF2);
			System.out.println("Файл успешно перемещен");
			
		}

	}
	
}