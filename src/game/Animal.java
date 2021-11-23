package game;

import java.util.Set;

public abstract class Animal {

    public enum Sex { //animal genders
        MALE, FEMALE
    }

    public enum foodDiet { // Different type of food for the animals
        FRUIT, DRYFOOD, MEAT
    }

    Set<foodDiet> animalDiet;
    private int foodMultiplier; // health increase by food
    private String name; // name of animal
    private Sex sex; // the animals gender
    private String type; // type of animal
    private int health; // health of animal
    private int price; // price of animal

    public Animal() {
        this.sex = (Math.random() < 0.5) ? Sex.MALE : Sex.FEMALE;
        this.health = 100;
    }
    public int getFoodMultiplier() { //getter for health increasing value
        return foodMultiplier;
    }
    public void removeHealthAnimal(){
        this.setHealth(this.getHealth() - (int) ((Math.random() * 20) + 10));
    }
    public void setFoodMultiplier(int foodMultiplier) {
        this.foodMultiplier = foodMultiplier;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sex getSex() {
        return sex;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health > 100){
            this.health = 100;
        }
    }

    public Set<foodDiet> getDiet(){
        return animalDiet;
    }

}

