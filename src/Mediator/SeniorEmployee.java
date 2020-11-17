package Mediator;

public class SeniorEmployee extends Employee {
    public SeniorEmployee(Mediator mediator, String name) {
        super(mediator);
        super.setName(name);
    }

    @Override
    public String employeeType() {
        return "Senior Employee";
    }
}
