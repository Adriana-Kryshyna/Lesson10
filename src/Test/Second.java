package Test;

public class Second {



    public class Vnutr extends First{
        // икликає методи та передає парамери
        public void Method(){
            MetOne(2,45);
            Mettwo(140,40);
            Metthree(34,56);
        }
    }


    public static void main(String[] args) {
        Second.Vnutr second= new Second().new Vnutr();
        second.Method();

    }
}
