package game;

public class AnimalFabrek {
    public Animal AnimalFactorySpawn(Animal animal){
        switch (animal.getType().toUpperCase()){

            case "PIG":
                return new Pig();
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            case "ELEPHANT":
                return new Elephant();
            case "LION":
                return new Lion();
            default:
                return null;
        }
    }
}