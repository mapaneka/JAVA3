import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Lab4_2 {


    public static void main(String[] args) {

        int wartosc = 10;
        for (int i = 0; i <wartosc; i++) {
            for (int j = 0; j <wartosc ; j++) {
                for (int k = 0; k <wartosc ; k++) {




            Random random1 = new Random();
            Random random2 = new Random();
            Random random3 = new Random();

int a,b,c;
            a = random1.nextInt(10);
            b = random2.nextInt(10);
            c = random3.nextInt(10);

            if (a == 7 & b == 7 & c == 7) {
                System.out.print("a= " + a + ", ");
                System.out.print("b= " + b+ ", ");
                System.out.print("c= " + c + " w konf: "  + (i*j*k));
                System.out.println(" ");

            }
              else {
                System.out.println("Nie wygrano w konf: " + i+ ", "+ j+ ", "+ k + " TEST: " + i*j*k);
            }

                }
            }
        }


    }


}



