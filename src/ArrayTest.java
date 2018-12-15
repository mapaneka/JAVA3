import java.awt.*;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int [100];
        int arr2[] = new int [100];
        int[] arr3 = {2,5,4,51,51,15};

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        Point[] points = {new Point(1,1), new Point(2,3) , new Point(4,1)  };

    String[] titles = {"Pan","Pani","Państwo","Panna","Doktor"};

        System.out.println(points[0].x);
        System.out.println(titles[0]);
        System.out.println(points.length);

    }
}
