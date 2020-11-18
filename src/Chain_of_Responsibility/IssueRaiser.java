package Chain_of_Responsibility;

public class IssueRaiser {
    Receiver receiver;

    public void setFirstHandler(Receiver receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(Message message) {
        receiver.handleMessage(message);
    }
}
