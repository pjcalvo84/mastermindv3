package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

public class RedoCommand  extends Command{

    RedoCommand(PlayController playController) {
        super(MessageView.REDO_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        this.playController.redo();
        new GameView(this.playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.redoable();
    }

}
