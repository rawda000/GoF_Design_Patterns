package Chain_of_Responsibility;

public class Program {
    public static void main(String[] args) {
        IssueRaiser raiser = new IssueRaiser();
        Receiver messageHandler = new MessageHandler();
        Receiver emailHandler = new EmailHandler();
        messageHandler.nextHandler(emailHandler);
        raiser.setFirstHandler(messageHandler);
        Message message = new Message("message", MessagePriority.HIGH);
        Message emailMessage = new Message("email", MessagePriority.NORMAL);
        messageHandler.handleMessage(emailMessage);
        messageHandler.handleMessage(message);

    }
}
