package Mediator.ModifiedMediator;

public class Unauthorized extends Employee{
    public Unauthorized(Mediator mediator, String name) {
        super(mediator, name, false);
    }

    @Override
    protected String getType() {
        return "Unauthorized";
    }
}
