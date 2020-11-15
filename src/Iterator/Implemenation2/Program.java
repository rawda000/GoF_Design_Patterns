package Iterator.Implemenation2;



public class Program {
    public static void main(String[] args) {
        System.out.println("*** Simple Iterator Demo ***");
        Subject subject = new Arts();
        ArtsIterator iterator = subject.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
