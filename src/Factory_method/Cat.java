package Factory_method;

public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Cat says Mew");
    }

    @Override
    public void preferredAction() {
        System.out.println("Cat preferred Action is Sleeping");
    }
}
