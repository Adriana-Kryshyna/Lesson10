package Lesson10_2Ex;

public class ColorDifferent extends Color{
    public String Color3;
    public String Color4;

    public ColorDifferent(String Color1, String Color2, String color3, String color4) {
        super(Color1, Color2);
        Color3 = color3;
        Color4 = color4;
    }
    public void colorist(){
        System.out.println("Great color ");
    }
}
