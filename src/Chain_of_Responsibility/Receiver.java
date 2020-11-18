package Chain_of_Responsibility;

public interface Receiver {
    boolean handleMessage(Message message);

    void nextHandler(Receiver receiver);
}
