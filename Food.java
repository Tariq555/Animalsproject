package Animalproject1;

public class Food {
    private String nameOfFood;
    private int priceOfFood;

    public Food(String nameOfFood, int priceOfFood) {
        this.nameOfFood = nameOfFood;
        this.priceOfFood = priceOfFood;
    }
    public Food() {

    }

    public void print() {
        System.out.println("Food;" + getClass());
        System.out.println("Snacks:" + nameOfFood +"---"+ priceOfFood);
    }
}
// The Food are ready to add it to start menu and to the store.