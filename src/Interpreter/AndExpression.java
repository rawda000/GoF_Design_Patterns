package Interpreter;

public class AndExpression implements Employee {
    private Employee employee1;
    private Employee employee2;

    public AndExpression(Employee employee1, Employee employee2) {
        this.employee1 = employee1;
        this.employee2 = employee2;
    }

    @Override
    public boolean interpret(Context context) {
        return employee1.interpret(context) && employee2.interpret(context);
    }
}
