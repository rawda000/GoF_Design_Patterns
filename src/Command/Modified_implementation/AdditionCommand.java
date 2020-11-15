package Command.Modified_implementation;

public class AdditionCommand implements ICommand {
    private IReceiver receiver;

    public AdditionCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void performDo() {
        receiver.performDo();
    }

    @Override
    public void performUndo() {
        receiver.performUndo();
    }
}
