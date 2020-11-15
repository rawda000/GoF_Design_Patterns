package Iterator.implementation3;

public class Program {
    public static void main(String[] args) {
        EmployeesIterator iterator = new EmployeeDB().createEmployeesIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
