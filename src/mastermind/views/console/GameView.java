package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

public class GameView {

    public GameView(PlayController playController) {
        new AttemptsView(playController).writeln();
        new SecretCombinationView(playController).writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController).write(i);
            new ResultView(playController).writeln(i);
        }
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }

}
