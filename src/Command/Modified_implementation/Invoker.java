package Command.Modified_implementation;

public class Invoker {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void executeDo() {
        this.command.performDo();
    }

    public void executeUndo() {
        this.command.performUndo();
    }
}
