package lesson10_EX1;

public class Car {
    public static void main(String[] args) {
        Plane plane=new Plane(123,240,2020,100,50);
        System.out.println(" FOR PLANE ");
        System.out.println(plane.getPrice()+" "+ plane.getSpeed()+" "+ plane.getYear()+" "+ plane.height+" "+plane.pasagir+"\n");

   Ship ship= new Ship(1234,250,2007,4,5);

        System.out.println("FOR SHIP");

        System.out.println(ship.getPrice()+" "+ship.getSpeed()+" "+ ship.getYear()+" "+ ship.port+" "+ ship.pasagir2);

    }
}
