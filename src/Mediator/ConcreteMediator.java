package Mediator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void register(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sendMessage(Employee employee, String message) throws InterruptedException {
        if (employees.contains(employee)) {
            System.out.println(employee.getName() + " posts: " + message + " Last" +
                    "message posted at" + LocalDateTime.now());
            Thread.sleep(1000);
        }
    }

    public void displayRegisteredEmployees() {
        System.out.println("Registered Employees are");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
