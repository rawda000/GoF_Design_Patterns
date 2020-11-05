package Decorator;

public class ConcreteComponent extends Component {
    public ConcreteComponent() {
    }

    @Override
    public void makeHouse() {
        System.out.println("The House is being made");
    }
}
