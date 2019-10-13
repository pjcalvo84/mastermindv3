package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.implementation.LogicImplementation;
import mastermind.views.View;
import mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	protected Logic createLogic() {
		return new LogicImplementation();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
