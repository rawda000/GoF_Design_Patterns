package Command;

public class MyUndoCommand implements ICommand {
    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        this.receiver.performUndo();
    }
}
