package Iterator.Implemenation1;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Simple Iterator Demo ***");
        Subject subject = new Arts();
        IIterator iterator = subject.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
