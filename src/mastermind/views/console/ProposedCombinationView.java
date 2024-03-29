package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import mastermind.controllers.PlayController;
import mastermind.types.Color;
import santaTecla.utils.Console;
import mastermind.views.MessageView;

class ProposedCombinationView {
	
	private PlayController playController;
    private Console console;

    ProposedCombinationView(PlayController playController) {
		this.playController = playController;
        this.console = new Console();
	}
	
	void write(int position) {
		for (Color color : this.playController.getColors(position)) {
			new ColorView(color).write();
		}
	}

	List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}
