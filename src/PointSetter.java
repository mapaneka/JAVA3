import java.awt.*;

public class PointSetter
{
    public static void main(String[] args) {

        Point location = new Point(4,13);
        show(location, "Polozenie poczatkowe: ");
        changePoint(location, 7,5, "Przejscie do (7,6)");
        show(location, "Polozenie koncowe: ");
    }



    static void show(Point point){
        System.out.println("X = " + point.x);
        System.out.println("Y = " + point.y);
    }

    static void show(Point point, String desc){
        System.out.println(desc);
        System.out.println("X = " + point.x);
        System.out.println("Y = " + point.y);
    }

static void changePoint(Point point, int x, int y, String desc){
    System.out.println(desc);
    point.x = 7;
    point.y = 6;
}




}
