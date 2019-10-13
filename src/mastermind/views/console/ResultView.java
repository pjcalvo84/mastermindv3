package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

class ResultView{
	
	private PlayController playController;
	
	ResultView(PlayController playController){
		this.playController = playController;
	}

	public void writeln(int i) {
        MessageView.RESULT.writeln(playController.getBlacks(i), playController.getWhites(i));
	}

}
