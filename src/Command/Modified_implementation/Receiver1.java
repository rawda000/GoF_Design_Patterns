package Command.Modified_implementation;

public class Receiver1 implements IReceiver {
    private int myInt;

    public Receiver1() {
        myInt = 10;
        System.out.println("Receiver1 is initialized with " + this.myInt);
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public void performDo() {
        this.myInt += 2;
        System.out.println("Receiver1 has myInt " + this.myInt);
    }

    @Override
    public void performUndo() {
        if (this.myInt > 10) {
            this.myInt -= 2;
            System.out.println("Receiver1 has been undone -> current value " + myInt);
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
