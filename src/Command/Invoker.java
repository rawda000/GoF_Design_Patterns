package Command;

public class Invoker {
    ICommand command;

    public Invoker() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.executeCommand();
    }
}
