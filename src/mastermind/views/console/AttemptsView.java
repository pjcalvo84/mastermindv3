package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

public class AttemptsView{

	private PlayController playController;

	AttemptsView(PlayController playController) {
		this.playController = playController;
	}

	public void writeln() {
	    MessageView.ATTEMPTS.writlne(playController.getAttempts());
	}

}
