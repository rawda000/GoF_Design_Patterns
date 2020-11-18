package Chain_of_Responsibility;

public class EmailHandler implements Receiver {
    private Receiver nextHandler;

    @Override
    public boolean handleMessage(Message message) {
        if (message.getText().contains("email")) {
            System.out.println("Email Handler handled the message");
            return true;
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
        return false;
    }

    @Override
    public void nextHandler(Receiver receiver) {
        this.nextHandler = receiver;
    }
}
