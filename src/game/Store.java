package game;

public class Store {
    {
        Cat c1 = new Cat("Cat", "Female",    3000);
        Dog d1 = new Dog("Dog", "male", 10000);
        Elephant e1 = new Elephant("Elephant", "Male", 120000);
        Pig p1 = new Pig("Pig", "female", 3200);
        Lion l1 = new Lion("Lion", "male", 130000);


        c1.print(); // Cat
        d1.print(); // Dog
        e1.print(); // Elephant
        p1.print(); // Pig
        l1.print(); // Lion
    }

    {
        DryFood d11 = new DryFood ("DryFood", 100 );
        Fruit f1 = new Fruit("Fruit", 120);
        Meat m1 = new Meat("Meat", 150);

        d11.print();
        f1.print();
        m1.print();
    }




}

