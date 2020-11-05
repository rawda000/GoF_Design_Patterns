package Decorator;

public abstract class AbstractDecorator extends Component {
    Component component;

    public AbstractDecorator() {
        component = new ConcreteComponent();
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public void makeHouse() {
        if (component != null) {
            this.component.makeHouse();
        }
    }

}
