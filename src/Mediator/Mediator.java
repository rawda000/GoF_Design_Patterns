package Mediator;

public interface Mediator {
    void register(Employee employee);

    void sendMessage(Employee employee, String message) throws InterruptedException;
}
