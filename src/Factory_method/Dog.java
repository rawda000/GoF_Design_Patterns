package Factory_method;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Dog Says woof");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dod preferred action is barking");
    }
}
