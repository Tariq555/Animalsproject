package game;

import java.util.ArrayList;

public class Player {
  // fieldvariablers
    private int money;
    private String name;
    private ArrayList<Animal> animalsOwned;
    private ArrayList<Food> foodOwned;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;

    }

}
