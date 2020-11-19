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

    Employee buildTree(Employee employee1, Employee employee2, Employee employee3, Employee employee4) {
        Employee phase1 = buildExpression(employee1, employee2, "or");
        Employee phase2 = buildExpression(phase1, employee3, "or");
        Employee phase3 = buildExpression(phase1, phase2, "and");
        return phase3;
    }
}
