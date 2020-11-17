package Mediator.ModifiedMediator;

public abstract class Employee {
    private String name;
    boolean authorizedAuthor;
    private Mediator mediator;

    public Employee(Mediator mediator, String name, boolean authorizedAuthor) {
        this.name = name;
        this.authorizedAuthor = authorizedAuthor;
        this.mediator = mediator;
        if (authorizedAuthor) {
            this.mediator.register(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void send(Employee employee, String message) throws InterruptedException {
        this.mediator.sendMessage(this, employee, message);
    }

    public void receive(Employee receiver, String message) throws InterruptedException {
        System.out.println(this.name + " received a message : " + message
                + " from an employee " + receiver.getName() + ".");
    }

    protected abstract String getType();
}
