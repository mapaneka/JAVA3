public class MarsApplication {
    public static void main(String[] args) {

        MarsApplication MarsRobot;
        MarsRobot spirit = new MarsRobot("eksploracja", 2, -60);



        spirit.showAttributes();

        System.out.println("Zwiekszenie predkosci do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();


        MarsRobot opportunity = new MarsRobot("eksploracja", 2, -60);



        opportunity.showAttributes();

    }

}
