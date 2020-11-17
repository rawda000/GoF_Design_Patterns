package Mediator.ModifiedMediator;

public interface Mediator {
    void register(Employee employee);

    void displayRegisteredEmployees();

    void sendMessage(Employee sender, Employee receiver, String message) throws InterruptedException;
}
