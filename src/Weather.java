public class Weather {
    public static void main(String[] args) {
        double fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ..\n");
        fah -= 32;
        fah/=9;
        fah *= 5;
        System.out.println(fah + " stopni Celsiusza\n\n");

        double cel = 33;
        System.out.println(cel + " stopni Celsiusza to ..\n");
        cel *= 9;
        cel /= 5;
        cel += 32;
        System.out.println(cel + " stopni Fahrenheita\n\n");
    }
}
