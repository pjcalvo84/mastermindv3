package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.Session;
import mastermind.models.State;

public abstract class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public int getWidth() {
		return this.session.getWidth();
	}
}
