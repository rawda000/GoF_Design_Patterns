package Command.Modified_implementation;

public class Receiver2 implements IReceiver {
    private boolean status;

    public Receiver2() {
        status = false;
        System.out.println("Receiver2 is initialized with status " + status);
    }

    @Override
    public void performDo() {
        if (status == false) {
            status = true;
            System.out.println("System is now on");
        } else {
            System.out.println("System is already on");
        }
    }

    @Override
    public void performUndo() {
        System.out.println("Undo Operation");
        this.status = !this.status;
        System.out.println("Current status : " + this.status);
    }
}
