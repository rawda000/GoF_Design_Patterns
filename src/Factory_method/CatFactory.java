package Factory_method;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
