package Animalproject1;

public class Player1 {
    private String nameOfPlayer1;
    private int ageOfPlayer1;
    // Constructions for player1
    public Player1(String nameOfPlayer1, int ageOfPlayer1) {
        this.nameOfPlayer1 = nameOfPlayer1;
        this.ageOfPlayer1 = ageOfPlayer1;
    }





    public void Player1() {

    }
    public void print() {   // superclass
        System.out.println("Players" + getClass().getName());
        System.out.println("Player name" + nameOfPlayer1);
        System.out.println("age:" + ageOfPlayer1);


    }
}
class Player2 {
    private String nameOfPlayer2;
    private int ageOfPlayer2;

    // Constructions for player2
    public Player2(String nameOfPlayer2, int ageOfPlayer2) {
        this.nameOfPlayer2 = nameOfPlayer2;
        this.ageOfPlayer2 = ageOfPlayer2;
    }


    public void Player2() {

    }
    public void print() {   // superclass
        System.out.println("Players" + getClass().getName());
        System.out.println("Player name" + nameOfPlayer2);
        System.out.println("age:" + ageOfPlayer2);


    }
}
