public class MarsRobot {//implements Robot {
    String status;
    int speed;
    float temperature;
/*
 */
    public void checkTemperature(){
            if (temperature < -80) {
            status = "Powrot do domu";
            speed = 5;
        }
    }

    public void checkStatus(){

        }



    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperatura: " + temperature);

    }


MarsRobot (String status, int speed, float temperature){
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
}



}
