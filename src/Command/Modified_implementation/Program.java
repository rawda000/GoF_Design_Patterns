package Command.Modified_implementation;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Modified Command Pattern ***");
        IReceiver receiver = new Receiver1();
        ICommand command = new AdditionCommand(receiver);
        command.performDo();
        command.performDo();
        command.performUndo();
        command.performUndo();
        command.performUndo();
        command.performUndo();
        System.out.println("________________________");
        receiver = new Receiver2();
        command = new PowerCommand(receiver);
        command.performDo();
        command.performDo();
        command.performUndo();
        command.performUndo();
    }
}
