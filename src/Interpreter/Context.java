package Interpreter;

import java.util.List;

public class Context {
    private int yearsOfExperience;
    private List<String> permissibleGrades;

    public Context(int yearsOfExperience, List<String> permissibleGrades) {
        this.yearsOfExperience = yearsOfExperience;
        this.permissibleGrades = permissibleGrades;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }
}
