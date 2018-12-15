import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {

        int accountBallance = 15_005;
        System.out.printf("Saldo: %,d zl %n", accountBallance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us") ,"%.6f%n", pi);

    }



}
