package Template_Method;

public abstract class BasicEngineering {
    public final void completeCourse() {
        completeMath();
        completeSoftSkill();
        completeSpecialPaper();
    }

    private void completeSoftSkill() {
        System.out.println("Soft Skills course");
    }

    private void completeMath() {
        System.out.println("Math course");
    }

    public abstract void completeSpecialPaper();
}
