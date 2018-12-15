public class Sample2 {
    public static void main(String[] args) {
        new AA();
        new AA(1);
        new AA("raz, dwa, trzy");


    }
}

class AA{
    AA(){
        System.out.println("Dziala konstruktor bezargumentowy");
    }
    AA(int i){
        System.out.println("Dziala konstruktor z int = " + i);
    }
    AA(String str){
        System.out.println("Dziala konstruktor ze String = " + str);
    }

}

class BB {
}







/*
class Employee {}
class VicePresident extends Employee{};
*/