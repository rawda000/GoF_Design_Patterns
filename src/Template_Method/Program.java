package Template_Method;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Template Method Pattern ***");
        BasicEngineering basicEngineering = new Electronics();
        basicEngineering.completeCourse();
        System.out.println("________________");
        basicEngineering = new ComputerScience();
        basicEngineering.completeCourse();
    }
}
