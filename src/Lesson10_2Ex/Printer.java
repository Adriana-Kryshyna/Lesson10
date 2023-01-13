package Lesson10_2Ex;

public class Printer {
    public static void main(String[] args) {

Color color=new Color("Blue","Yellow");
color.Forcolor();
        System.out.println((char)27+"[44m"+color.Color1+" \n"
                +(char)27+"[43m"+ color.Color2+"\n"+(char)27+"[0m");

        ColorDifferent colorDifferent=new ColorDifferent("Purple","Cyan","Green","Black");
colorDifferent.colorist();
        System.out.println((char)27+"[35m"+colorDifferent.Color1+"\n"
                +(char)27+"[36m"+colorDifferent.Color2+"\n"
                +(char)27+"[32m"+colorDifferent.Color3+"\n"
                + (char)27+"[30m"+colorDifferent.Color4);
    }
}
