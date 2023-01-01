package Ex2_9Lesson;

public class Book {
    public static void main(String[] args) {
Avtor avtor=new Avtor();
avtor.setNameAuthor("Adrya");
Title title=new Title();
title.setName("Motto");
Content content = new Content();
content.setIncontent("East or West - Home is best ");
avtor.Show();
title.Show();
content.Show();
    }

}
