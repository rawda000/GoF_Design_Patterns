package Mediator.ModifiedMediator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void register(Employee employee) {
        if (employee != null)
            employeeList.add(employee);
    }

    @Override
    public void displayRegisteredEmployees() {
        System.out.println("Current registered Employees");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }

    @Override
    public void sendMessage(Employee sender, Employee receiver, String message) throws InterruptedException {
        if (sender.getType().equals("Unauthorized")) {
            System.out.println("[ALERT Everyone] An outsider named " +
                    sender.getName() + " trying to send some messages to " +
                    receiver.getName());
            sender.receive(sender, ",you are not allowed to enter here.");
        } else if (employeeList.contains(sender)) {
            System.out.println("-----" + sender.getName() + " posts some message at: " + LocalDateTime.now() + "-----");
            Thread.sleep(1000);

            if (employeeList.contains(receiver)) {
                receiver.receive(sender, message);
            } else {
                System.out.println(sender.getName() + " , your target recipient does not exist");
            }
        } else {
            System.out.println("[ALERT] An unregistered employee named " +
                    sender.getName() + " trying to send some messages to " +
                    receiver.getName());

            System.out.println(sender.getName() + ", you need to register yourself first.");
        }
    }
}



