package lesson10_EX1;

public class Ship extends Vehicle {
public  int port;
public int pasagir2;

    public Ship(int price, int speed, int year, int port, int pasagir2) {
        super(price, speed, year);
        this.pasagir2=pasagir2;
        this.port=port;
    }
}
