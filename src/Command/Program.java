package Command;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Command Pattern Demo ***");
        Receiver receiver = new Receiver();
        ICommand command = new MyRedoCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        System.out.println("______________________");
        command = new MyUndoCommand(receiver);
        invoker.setCommand(command);
        invoker.executeCommand();

    }
}
