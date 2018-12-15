import java.awt.*;

public class NamedPoint extends Point {

    String name;
// konstruktor Alt+Instert
    public NamedPoint(int x, int y, String name) {
       super(x, y);
       /* this.x = x;
        this.y = y;*/
        this.name = name;
    }


    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5,5,"SmallPoint");
        System.out.println("x wynosi "+ np.x);
        System.out.println("y wynosi "+ np.y);
        System.out.println("name wynosi "+ np.name);
    }

}
