package Factory;

public class AnimalFactory {

    private AnimalFactory() {

    }

    public static Animal createAnimal(String animalType) {

        if ("dog".equals(animalType)) {
            return new Dog();
        } else if ("cat".equals(animalType)) {
            return new Cat();
        } else {
            return null;
        }
    }


}

class AnimalFactoryDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.eat();
    }
}


