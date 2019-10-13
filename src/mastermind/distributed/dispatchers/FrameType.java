package mastermind.distributed.dispatchers;

public enum FrameType { 
	START, 
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	COLORS,
	BLACKS,
	WHITES,
	WINNER, 
	LOOSER, 
	ATTEMPTS,
	PROPOSECOMBINATION, 
	WIDTH,
	NEW_GAME,
	CLOSE;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
