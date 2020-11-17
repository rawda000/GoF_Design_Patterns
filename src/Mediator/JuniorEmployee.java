package Mediator;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(Mediator mediator, String name) {
        super(mediator);
        super.setName(name);
    }

    @Override
    public String employeeType() {
        return "Junior Employee";
    }
}
