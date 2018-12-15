public class Lab4_1_3 {

    public static void main(String[] args) {


      new A(false);
        System.out.println(" ");
        new B();
        System.out.println(" ");
        //     b.show();
        new C(true);
        //    c.show();
    }
}


    class A {
        public A() {
            System.out.println("Konstruuję A");
        }
        public A(boolean cisza) {
           if (!cisza) {
               System.out.println("Konstruuję A- nie ma ciszy");
           }
           }
        }



    class B extends A {
        public B() {
            System.out.println("Konstruuję B");
        }
        public B(boolean cisza) {
            super(true);
            if (!cisza) {
                System.out.println("Konstruuję B- nie ma ciszy");
            }
        }
    }

    class C extends B {
        public C() {
            System.out.println("Konstruuję obiekt C");
        }
        public C(boolean cisza) {
            super(true);
            if (!cisza) {
                System.out.println("Konstruuję C- nie ma ciszy");
            }
        }

        }


