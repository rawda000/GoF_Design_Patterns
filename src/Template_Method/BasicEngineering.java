package Template_Method;

public abstract class BasicEngineering {
    public final void completeCourse() {
        completeMath();
        completeSoftSkill();
        completeSpecialPaper();
        if (isAdditionalPaperNeeded()) completeAdditionalPaper();
    }

    private void completeSoftSkill() {
        System.out.println("Soft Skills course");
    }

    private void completeMath() {
        System.out.println("Math course");
    }

    public boolean isAdditionalPaperNeeded() {
        return true;
    }

    private void completeAdditionalPaper() {
        System.out.println("Additional Paper is needed for this course");
    }

    public abstract void completeSpecialPaper();
}
