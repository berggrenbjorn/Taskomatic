package taskomatic.todomngr.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {

	ImageIcon titleIcon;
	JLabel title;
	JButton addTaskBtn;
	
	public TopPanel() {
		createPanel();
	}
	
	public void createPanel() {		
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.WHITE);

		titleIcon = new ImageIcon("images/taskomatic.png");
		if (titleIcon == null) {
			title = new JLabel("TASKOMATIC");
		} else {
			title = new JLabel(titleIcon);			
		}
		
		addTaskBtn = new JButton("Add New Task");
		addTaskBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));

		GridBagConstraints titleConst = new GridBagConstraints();
		GridBagConstraints addTaskBtnConst = new GridBagConstraints();
		
		titleConst.gridx = 0;
		titleConst.gridy = 0;
		
		addTaskBtnConst.gridx = 0;
		addTaskBtnConst.gridy = 1;
		
		this.add(title, titleConst);
		this.add(addTaskBtn, addTaskBtnConst);
	}

}
