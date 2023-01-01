package Ex2_9Lesson;

public class Avtor {
    private String nameAuthor;

    public Avtor() {
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    public void  Show(){
        System.out.println("Author: "+nameAuthor);
    }


}
