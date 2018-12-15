import java.awt.*;

public class FourDPoint extends Point {

    int z;
    int v;
    // konstruktor Alt+Instert
    public FourDPoint(int x, int y, int z, int v) {
        super(x, y);
        this.z = z;
        this.v = v;
    }

    public static void main(String[] args) {
        FourDPoint p4D = new FourDPoint(4,5,6,7);
        System.out.println("x wynosi "+ p4D.x);
        System.out.println("y wynosi "+ p4D.y);
        System.out.println("z wynosi "+ p4D.z);
        System.out.println("v wynosi "+ p4D.v);
    }


}
