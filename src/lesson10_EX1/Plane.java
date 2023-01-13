package lesson10_EX1;

public class Plane extends Vehicle{
    public int  height;
    public int pasagir;

    public Plane(int price, int speed, int year,int  height,int pasagir) {
        super(price, speed, year);
        this.height=height;
        this.pasagir= pasagir;
    }
}
