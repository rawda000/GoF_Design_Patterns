package Mediator.ModifiedMediator;

public class ConcreteEmployee extends Employee {
    public ConcreteEmployee(Mediator mediator, String name, boolean authorizedAuthor) {
        super(mediator, name, authorizedAuthor);
    }

    @Override
    protected String getType() {
        return "unauthorized";
    }
}
