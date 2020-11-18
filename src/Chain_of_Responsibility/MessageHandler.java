package Chain_of_Responsibility;

public class MessageHandler implements Receiver {
    private Receiver nextHandler;

    @Override
    public boolean handleMessage(Message message) {
        if (message.getText().contains("message")) {
            System.out.println("Message Handler handled the message");
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
