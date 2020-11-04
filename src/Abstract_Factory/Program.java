package Abstract_Factory;

public class Program {
    public static void main(String[] args) {
        /**
         * Use the same variables using polymorphism
         */
        Dog dog;
        Tiger tiger;
        AnimalFactory animalFactory;

        animalFactory = new PetAnimalFactory();
        dog = animalFactory.createDog();
        tiger = animalFactory.createTiger();

        dog.speak();
        dog.preferredAction();

        tiger.speak();
        tiger.preferredAction();

        animalFactory = new WildAnimalFactory();
        dog = animalFactory.createDog();
        tiger = animalFactory.createTiger();

        dog.speak();
        dog.preferredAction();

        tiger.speak();
        tiger.preferredAction();
    }


}
