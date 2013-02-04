package taskomatic.todomngr.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		addTaskBtn.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent ae) {
	            showEditPanel();
	        }
	    });

		GridBagConstraints titleConst = new GridBagConstraints();
		GridBagConstraints addTaskBtnConst = new GridBagConstraints();
		
		titleConst.gridx = 0;
		titleConst.gridy = 0;
		
		addTaskBtnConst.gridx = 0;
		addTaskBtnConst.gridy = 1;
		
		this.add(title, titleConst);
		this.add(addTaskBtn, addTaskBtnConst);
	}
	

	


private void showEditPanel() {
	
	JTextField taskField = new JTextField(20);
	JTextField dateField = new JTextField(20);
	JTextField descField = new JTextField(10);
	JTextField categoryField = new JTextField(10);
	JTextField priorityField = new JTextField(10);
	JPanel editPanel = new JPanel();
	
	editPanel.setLayout(new GridBagLayout());
	/*editPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
	
	editPanel.add(new JLabel("Task name"));
	editPanel.add(taskField);
	editPanel.add(new JLabel("Due date"));
	editPanel.add(dateField);
	*/
	GridBagConstraints c = new GridBagConstraints();
	
	//natural height, maximum width
	c.fill = GridBagConstraints.HORIZONTAL;
	//c.weightx = 30;

	c.gridx = 0;
	c.gridy = 0;
	editPanel.add(new JLabel("Task name"),c);
	c.gridx = 1;
	editPanel.add(taskField, c);
	
	c.gridx = 0;
	c.gridy = 1;
	editPanel.add(new JLabel("Due date"),c);
	c.gridx = 1;
	editPanel.add(dateField, c);

	c.gridx = 0;
	c.gridy = 2;
	editPanel.add(new JLabel("Category"),c);
	c.gridx = 1;
	editPanel.add(categoryField, c);
	
	c.gridx = 0;
	c.gridy = 3;
	editPanel.add(new JLabel("Priority"),c);
	c.gridx = 1;
	editPanel.add(priorityField, c);
	
	int result = JOptionPane.showConfirmDialog(null,editPanel, "Edit task",  JOptionPane.OK_CANCEL_OPTION);
	if (result == JOptionPane.OK_OPTION) {
		//Add it to the list of tasks
		//TaskPanel.currentTasks.add(new Task(dateField.getText(), taskField.getText(), categoryField.getText(), priorityField.getText()));
		//TaskPanel.currentTasks.get(0).printTask();
	}

	
	
}

}
