package taskomatic.todomngr.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
	
	private String taskName;
	private String taskDescription;
	private String taskDueDate;
	private String taskCategory;
	private int taskPriority;
	
	JTextField nameTF;
	JTextField descTF;
	JTextField dateTF;
	JTextField cateTF;
	JTextField prioTF;
	
	public Task(String name, String desc, String dueDate, String cat, int prio) {
		this.taskName = name;
		this.taskDescription = desc;
		this.taskDueDate = dueDate;
		this.taskCategory = cat;
		this.taskPriority = prio;
		createPanel();
	}
	
	public void createPanel() {
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		this.setLayout(new GridBagLayout());
		nameTF = new JTextField(taskName);
		descTF = new JTextField(taskDescription);
		dateTF = new JTextField(taskDueDate);
		cateTF = new JTextField(taskCategory);
		prioTF = new JTextField(Integer.toString(taskPriority));
		
		nameTF.setHorizontalAlignment(JTextField.CENTER);
		descTF.setHorizontalAlignment(JTextField.CENTER);
		dateTF.setHorizontalAlignment(JTextField.CENTER);
		cateTF.setHorizontalAlignment(JTextField.CENTER);
		
		prioTF.setHorizontalAlignment(JTextField.CENTER);
		nameTF.setFont(new Font("sansserif", Font.BOLD, 30));
		descTF.setFont(new Font("sansserif", Font.ITALIC, 15));
		dateTF.setFont(new Font("sansserif", Font.PLAIN, 15));
		cateTF.setFont(new Font("sansserif", Font.ITALIC, 15));
		prioTF.setFont(new Font("sansserif", Font.PLAIN, 15));
		
		nameTF.setPreferredSize(new Dimension(30, 50));
		descTF.setPreferredSize(new Dimension(15, 50));
		dateTF.setPreferredSize(new Dimension(15, 50));
		cateTF.setPreferredSize(new Dimension(15, 50));
		prioTF.setPreferredSize(new Dimension(15, 50));
		
		GridBagConstraints nameTFConstraints = new GridBagConstraints();
		GridBagConstraints descTFConstraints = new GridBagConstraints();
		GridBagConstraints dateTFConstraints = new GridBagConstraints();
		GridBagConstraints cateTFConstraints = new GridBagConstraints();
		GridBagConstraints prioTFConstraints = new GridBagConstraints();
		
		nameTFConstraints.gridx = 0;
		nameTFConstraints.gridy = 0;
		nameTFConstraints.weightx = 1.0;
		nameTFConstraints.weighty = 1.0;
		nameTFConstraints.fill = GridBagConstraints.BOTH;
		
		descTFConstraints.gridx = 1;
		descTFConstraints.gridy = 0;
		descTFConstraints.weightx = 0.5;
		descTFConstraints.weighty = 1.0;
		descTFConstraints.fill = GridBagConstraints.BOTH;
		
		dateTFConstraints.gridx = 2;
		dateTFConstraints.gridy = 0;
		dateTFConstraints.weightx = 0.5;
		dateTFConstraints.weighty = 1.0;
		dateTFConstraints.fill = GridBagConstraints.BOTH;
		
		cateTFConstraints.gridx = 3;
		cateTFConstraints.gridy = 0;
		cateTFConstraints.weightx = 0.5;
		cateTFConstraints.weighty = 1.0;
		cateTFConstraints.fill = GridBagConstraints.BOTH;
		
		prioTFConstraints.gridx = 4;
		prioTFConstraints.gridy = 0;
		prioTFConstraints.weightx = 0.5;
		prioTFConstraints.weighty = 1.0;
		prioTFConstraints.fill = GridBagConstraints.BOTH;
		
		this.add(nameTF, nameTFConstraints);
		this.add(descTF, descTFConstraints);
		this.add(dateTF, dateTFConstraints);
		this.add(cateTF, cateTFConstraints);
		this.add(prioTF, prioTFConstraints);
	}
	
	public void setPanelColor(Color c) {
		nameTF.setBackground(c);
		descTF.setBackground(c);
		dateTF.setBackground(c);
		cateTF.setBackground(c);
		prioTF.setBackground(c);
	}

}
