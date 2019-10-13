package mastermind.views;

import mastermind.types.Error;
import santaTecla.utils.Console;

public class ErrorView {

	public static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	protected Error error;
    private Console console;
	public ErrorView(Error error) {
		this.error = error;
		console = new Console();
	}
	
	public String getMessage() {
		return ErrorView.MESSAGES[this.error.ordinal()];
	}

    public void writeln(){
        this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }
}
