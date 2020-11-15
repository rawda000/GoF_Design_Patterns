package Command.Modified_implementation;

public class PowerCommand implements ICommand {
    IReceiver receiver;

    public PowerCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void performDo() {
        this.receiver.performDo();
    }

    @Override
    public void performUndo() {
        this.receiver.performUndo();
    }
}
