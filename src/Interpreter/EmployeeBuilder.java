package Interpreter;

public class EmployeeBuilder {
    Employee buildExpression(Employee employee1, Employee employee2, String operator) {
        operator = operator.toLowerCase();
        switch (operator) {
            case "and":
                return new AndExpression(employee1, employee2);
            case "or":
                return new OrExpression(employee1, employee2);
            default:
                System.out.println("The operator is not valid");
                return null;
        }
    }
}
