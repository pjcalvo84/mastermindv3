package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.MessageView;

public class UndoCommand  extends Command {

    UndoCommand(PlayController playController) {
        super(MessageView.UNDO_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        this.playController.undo();
        new GameView(this.playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.undoable();
    }

}
