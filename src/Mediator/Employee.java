package Mediator;

public abstract class Employee {
    private String name;
    private Mediator mediator;

    public Employee(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) throws InterruptedException {
        mediator.sendMessage(this, message);
    }

    public abstract String employeeType();
}
