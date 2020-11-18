package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> eligibleGrades = new ArrayList<>();
        eligibleGrades.add("A");
        eligibleGrades.add("B");
        Context context = new Context(10, eligibleGrades);
        Employee individualEmployee = new IndividualEmployee(5, "A");
        Employee individualEmployee2 = new IndividualEmployee(10, "B");
        boolean employee1Eligible = individualEmployee.interpret(context);
        boolean employee2Eligible = individualEmployee2.interpret(context);
        System.out.println("Employee1 is eligible " + employee1Eligible);
        System.out.println("Employee2 is eligible " + employee2Eligible);
        Employee andExpression = new EmployeeBuilder().buildExpression(individualEmployee, individualEmployee2, "and");
        boolean andExpressionEligible = andExpression.interpret(context);
        System.out.println("AndExpression is eligible " + andExpressionEligible);
    }
}
