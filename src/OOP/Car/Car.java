package OOP.Car;

public class Car {
    String type;
    String model = "asdasad";
    String color;
    int speed;
    int speedLimit = 180;

    Car(){
        System.out.println("Kurucu Metod ayağa kalktı");
    }

    Car(String model, int speed, String color ) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    public void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit){
            speed += increment;
        }
    }

    public void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printInfo() {
        System.out.println(this.model + " Hızı: " + this.speed + " Renk: " + this.color);
    }
}
