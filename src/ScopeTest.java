public class ScopeTest {

int test = 10;

void printTest () {
    int test = 20;
    System.out.println("Test = " + test);
}

    public static void main(String[] args) {

ScopeTest scopeTest = new ScopeTest();

        System.out.println("---" + scopeTest.test);
scopeTest.printTest();

      //  System.out.println("---" + scopeTest.test);
    }


}
