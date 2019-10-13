package mastermind.views;

import santaTecla.utils.Console;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
    REDO_COMMAND("Redo previous Proposal"),
    UNDO_COMMAND("Undo previous Proposal"),
    PROPOSE_COMMAND("Propose Combination"),
    LOOSER("You've lost!!! :-(");

	private String message;
    private Console console;

    MessageView(String message) {
        this.message = message;
        this.console = new Console();
    }
	
	public String getMessage() {
		return this.message;
	}

    public void writeln(){
	    console.writeln(this.message);
    }

    public void writeln(int blacks, int whites) {
        this.console.writeln(this.message.replaceAll("#blacks", "" + blacks).replaceAll("#whites", "" + whites));
    }

    public void writlne(int attempts){
        this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
    }
}
