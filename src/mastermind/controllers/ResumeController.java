package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.Session;
import mastermind.models.State;

public class ResumeController extends AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.session.resume();
		} else {
			this.session.next();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
