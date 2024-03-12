
interface IAnimal {
    void speak();
}

class Dog implements IAnimal {
    public void speak() {
        System.out.println("woof");
    }
}

class Cat implements IAnimal {
    public void speak() {
        System.out.println("meow");
    }
}

class AnimalFactory {
    public static IAnimal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Singleton
        Logger singletonLogger = Logger.Instance();
        System.out.println("Singleton logger: ");
        singletonLogger.log("Comment", "This is a comment.");
        singletonLogger.log("Warning", "This is a warning.");
        singletonLogger.log("Error", "An error occurred.");

        // Static
        StaticLogger.log("Comment", "This is a static comment.");
        StaticLogger.log("Warning", "This is a static warning.");
        StaticLogger.log("Error", "A static error occurred.");

        // Animal factory
        IAnimal dog = AnimalFactory.createAnimal("Dog");
        dog.speak();
        IAnimal cat = AnimalFactory.createAnimal("Cat");
        cat.speak();
    }
}
