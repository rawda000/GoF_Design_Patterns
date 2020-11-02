package Factory_method;

public class Main {
    public static void main(String[] args) {

        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        factory.makeAnimal();
        //////////////////////////////////////////////////
        factory = new CatFactory();
        animal = factory.createAnimal();
        factory.makeAnimal();

    }
}
