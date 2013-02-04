package taskomatic.todomngr.com;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class View {
	
	private Controller controller;
	
	private JFrame mainFrame;
	
	private JMenuBar menuBar;
	private JPanel contentPane;
	private TopPanel topPanel;
	private TaskPanel taskPanel;
	private BottomPanel botPanel;
	
	public View(Controller controller) {
		this.controller = controller;
		initFrame();
		addComponents();
		mainFrame.setVisible(true);
	}
	
	private void initFrame() {
		mainFrame = new JFrame("TASKOMATIC");
		contentPane = new JPanel();
		setNativeLookAndFeel();
		mainFrame.setContentPane(contentPane);
		mainFrame.setBounds(400, 100, 800, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void addComponents() {
		/*
		 * THE MENUBAR
		 */
		menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu options = new JMenu("Options");
		JMenu about = new JMenu("About");
		menuBar.add(file);
		menuBar.add(options);
		menuBar.add(about);
		mainFrame.setJMenuBar(menuBar);
		
		/*
		 * LAYOUT
		 */
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new GridBagLayout());
		
		topPanel = new TopPanel();
		taskPanel = new TaskPanel();
		botPanel = new BottomPanel();
		
		GridBagConstraints topConst = new GridBagConstraints();
		GridBagConstraints taskConst = new GridBagConstraints();
		GridBagConstraints botConst = new GridBagConstraints();
		
		topConst.gridx = 0;
		topConst.gridy = 0;
		topConst.weightx = 1.0;
		topConst.weighty = 0.5;
		topConst.insets = new Insets(5, 5, 5, 5);
		topConst.fill = GridBagConstraints.BOTH;
		
		taskConst.gridx = 0;
		taskConst.gridy = 1;
		taskConst.weightx = 1.0;
		taskConst.weighty = 1.0;
		taskConst.insets = new Insets(5, 5, 5, 5);
		taskConst.fill = GridBagConstraints.BOTH;
		
		botConst.gridx = 0;
		botConst.gridy = 2;
		botConst.weightx = 1.0;
		botConst.weighty = 0.1;
		botConst.insets = new Insets(5, 5, 5, 5);
		botConst.fill = GridBagConstraints.BOTH;
		
		/*
		 * LISTENERS
		 */
		
		/*
		 * ADDING COMPONENTS
		 */
		contentPane.add(topPanel, topConst);
		contentPane.add(taskPanel, taskConst);
		contentPane.add(botPanel, botConst);
		
	}
	
	private void setNativeLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Error constructing UI.");
		}
	}

}
