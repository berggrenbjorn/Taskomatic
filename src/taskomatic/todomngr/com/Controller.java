package taskomatic.todomngr.com;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller() {
		model = new Model(this);
		view = new View(this);
	}

}
