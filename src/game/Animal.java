package game;

public class Animal {
    private String nameOfAnimal;
    private String gender;
    private int priceOfAnimal;

    public Animal (String nameOfAnimal, String gender, int priceOfAnimal){
        this.nameOfAnimal = nameOfAnimal;
        this.gender = gender;
        this.priceOfAnimal = priceOfAnimal;
    }
    public Animal() {

    }
    public void print() {   // superclass
        System.out.println("Animal sort:" + getClass().getName());
        System.out.println("-" + "---" + nameOfAnimal + "---" + "age:" + gender + "---" + "price:" + priceOfAnimal);

    }

}
