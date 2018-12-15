public class StaticMember {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamilyMember mam = new FamilyMember();
        mam.name = "Anna";
        mam.age = 31;


        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(mam);
        mam.surname = "Kowalsky";
        show(dad);
        show(kid);
        show(mam);

    }

    static void show (FamilyMember famillyMember){
        System.out.print(famillyMember.name); // wypisze wszystkko w jednej linii
        System.out.print(" ");
        System.out.print(famillyMember.surname); // wypisze wszystkko w jednej linii
        System.out.print(" ");
        System.out.print(famillyMember.age); // wypisze wszystkko w jednej linii
        System.out.println(" lat/a");
    }



    }


    class FamilyMember {
    static String surname = "Nowak"; //
    String name;
    int age;

    }
