package Ex1_9Lesson;

public class InfoAddress {
    public static void main(String[] args) {
        Address address=new Address();
   address.setCity("Vinnytsya");
   address.setApartment(45);
   address.setCountry("Ukraine");
   address.setIndex(23500);
   address.setHouse(6);
   address.setStreet("Soborna");
        System.out.println(address.getIndex()+" "+address.getCountry()+" "+address.getCity()+" "+address.getStreet()+" "+address.getHouse()+" "+address.getApartment());
    }
}
