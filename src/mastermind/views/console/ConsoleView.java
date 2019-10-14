package mastermind.views.console;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.SaveController;
import mastermind.controllers.StartController;
import mastermind.views.SaveView;
import mastermind.views.View;

public class ConsoleView extends View{

    private final StartView startView;

    private final PlayView playView;

    private final ResumeView resumeView;

    private SaveView saveView;

    public ConsoleView(){
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void visit(final StartController startController){
        this.startView.interact(startController);
    }

    @Override
    public void visit(final PlayController playController){
        this.playView.interact(playController);
    }

    @Override
    public void visit(final ResumeController resumeController){
        this.resumeView.interact(resumeController);
    }

    @Override
    public void visit(final SaveController saveController){
        this.saveView.interact(saveController);
    }

    @Override
    public void interact(final AcceptorController acceptorController){
        acceptorController.accept(this);
    }
}
