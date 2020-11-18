package Interpreter;

public class IndividualEmployee implements Employee {
    private int yearsOfExperience;
    private String currentGrade;

    public IndividualEmployee(int yearsOfExperience, String currentGrade) {
        this.yearsOfExperience = yearsOfExperience;
        this.currentGrade = currentGrade;
    }

    @Override
    public boolean interpret(Context context) {
        if (yearsOfExperience >= context.getYearsOfExperience()
                && context.getPermissibleGrades().contains(currentGrade)) {
            return true;
        }
        return false;
    }
}
