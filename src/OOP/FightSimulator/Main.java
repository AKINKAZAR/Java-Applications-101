package OOP.FightSimulator;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Akın", 25, 200, 70, 50);
        Fighter fighter2 = new Fighter("Selim", 25, 200, 84, 50);

        Ring ring = new Ring(fighter1, fighter2, 70, 130);
        ring.run();


    }
}
