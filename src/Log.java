import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.text.DecimalFormat;

public class Log
{
    public static void main(String[] args) {

        System.out.println( "Pierwsze zadanie" );
        System.out.println( "" );

 double start = 14_000;
        System.out.println("Liczba poczatkowa: " +start);
 start += (start *=0.4);
        System.out.println(start);
start -= 1500;
        System.out.println(start);
start += (start*+0.12);
        System.out.println("Wynik to: " + start);

        System.out.println( "" );
        // 2
        System.out.println( "Drugie zadanie" );
        System.out.println( "" );


        int pierwsza = 100;
        int druga = 35;
        int dzielenie = pierwsza/druga;
        int reszta = pierwsza%druga;
//"Wynik pierwsza/druga to: " +
        System.out.println( "Pierwsza liczba to: " + pierwsza );
        System.out.println( "Druga liczba to: " + druga );
        System.out.println( "Wynik pierwsza/druga to: " + dzielenie + " \t Reszta to: " + reszta );

        System.out.println( "" );
        // 2
        System.out.println( "Trzecie zadanie" );
        System.out.println( "" );

int liczba = 20453;

//DecimalFormat df = new DecimalFormat("F:#");
   //     System.out.println(df.format(liczba));


        System.out.println( "Liczba: " + liczba + " dwojkowo(binarnie) to: " + Integer.toBinaryString(liczba)  );
        System.out.println( "Liczba: " + liczba + " w HEXie to: " + Integer.toHexString(liczba)  );
        System.out.println( "Liczba: " + liczba + " 16stkowo to: " + Integer.toOctalString(liczba)  );





    }
}
