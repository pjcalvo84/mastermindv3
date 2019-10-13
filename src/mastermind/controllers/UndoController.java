package mastermind.controllers;

import mastermind.models.Session;

public class UndoController extends Controller {

    UndoController(Session session) {
        super(session);
    }

    protected void undo() {
        this.session.undo();
    }
    protected boolean undoable() {
        return this.session.undoable();
    }

}
