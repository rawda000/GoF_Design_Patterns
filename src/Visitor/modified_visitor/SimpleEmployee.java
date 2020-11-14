package Visitor.modified_visitor;

public class SimpleEmployee implements IEmployee {
    private String name = "";
    private int yearsOfExperience = 0;

    public SimpleEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printEmployee() {
        System.out.println("Employee Name : " + name + " Number Of years experience : " + yearsOfExperience);
    }

    @Override
    public void acceptVisit(IVisitor visitor) {
        visitor.visitSimpleEmployee(this);
    }


}
