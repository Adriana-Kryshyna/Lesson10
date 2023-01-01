package EX3_9lesson;

public class Computer {
    private  int[] array =new int[5];

    public Computer() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void Sh(){
       // array= new int[]{1, 3, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
