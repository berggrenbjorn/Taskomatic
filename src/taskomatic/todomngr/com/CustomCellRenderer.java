package taskomatic.todomngr.com;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class CustomCellRenderer extends JPanel implements ListCellRenderer<Task> {

	@Override
	public Component getListCellRendererComponent(JList<? extends Task> list,
			Task value, int index, boolean isSelected, boolean cellHasFocus) {
	
	    if (isSelected) {
	    	value.setBackground(Color.BLACK);
	    	value.setPanelColor(new Color(46, 138, 138));
	    } else {
	        value.setBackground(new Color(85, 92, 125));
	        value.setPanelColor(Color.WHITE);
	    };
		
	    // NOT FINISHED
	    
		return value;
	}

}
