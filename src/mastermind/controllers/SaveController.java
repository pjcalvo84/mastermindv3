package mastermind.controllers;

import mastermind.models.Session;

public abstract class SaveController extends AcceptorController{

    public SaveController(final Session session){
        super(session);
    }

    public abstract void save(String name);

    public abstract void save();

    public abstract void next();

    public abstract boolean hasName();

    public abstract boolean exists(String readString);

    @Override
    public void accept(final ControllersVisitor controllerVisitor){
        controllerVisitor.visit(this);
    }
}
