package taskomatic.todomngr.com;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class TaskPanel extends JPanel {
	
	DefaultListModel<Task> listModel;
	JList<Task> list;
	
	public TaskPanel() {
		listModel = new DefaultListModel<Task>();
		list = new JList<Task>(listModel);
		createPanel();
		
		listModel.addElement(new Task("Eating", "Description 1", "2013-02-08", "Rainbows", 1));
		listModel.addElement(new Task("Playing", "Description 2", "2013-02-09", "Unicorns", 2));
		listModel.addElement(new Task("Movies", "Description 3", "2013-02-10", "Fairies", 3));
		listModel.addElement(new Task("Football", "Description 4", "2013-02-11", "Gnomes", 4));
		listModel.addElement(new Task("Homework", "Description 5", "2013-02-12", "Angels", 5));
		listModel.addElement(new Task("Sleep", "Description 6", "1974-01-05", "Muffins", 6));
		listModel.addElement(new Task("Eating", "Description 1", "2013-02-08", "Rainbows", 1));
		listModel.addElement(new Task("Playing", "Description 2", "2013-02-09", "Unicorns", 2));
		listModel.addElement(new Task("Movies", "Description 3", "2013-02-10", "Fairies", 3));
		listModel.addElement(new Task("Football", "Description 4", "2013-02-11", "Gnomes", 4));
		listModel.addElement(new Task("Homework", "Description 5", "2013-02-12", "Angels", 5));
		listModel.addElement(new Task("Sleep", "Description 6", "1974-01-05", "Muffins", 6));
		listModel.addElement(new Task("Eating", "Description 1", "2013-02-08", "Rainbows", 1));
		listModel.addElement(new Task("Playing", "Description 2", "2013-02-09", "Unicorns", 2));
		listModel.addElement(new Task("Movies", "Description 3", "2013-02-10", "Fairies", 3));
		listModel.addElement(new Task("Football", "Description 4", "2013-02-11", "Gnomes", 4));
		listModel.addElement(new Task("Homework", "Description 5", "2013-02-12", "Angels", 5));
		listModel.addElement(new Task("Sleep", "Description 6", "1974-01-05", "Muffins", 6));
		
	}
	
	public void createPanel() {
		this.setLayout(new BorderLayout());
		list.setCellRenderer(new CustomCellRenderer());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		JScrollPane listScrollPane = new JScrollPane(list);
		this.add(listScrollPane, BorderLayout.CENTER);
	}

}
