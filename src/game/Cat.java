package game;

import java.util.EnumSet;

public class Cat extends Animal {

    public Cat() { 
        animalDiet = EnumSet.of(Diet.FRUIT, Diet.DRYFOOD);
        setCost(100); 
        setType("Cat"); 
        setFoodMultiplier(4); 
    }
}
