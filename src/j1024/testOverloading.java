package j1024;

public class testOverloading {

    void show(int a) {
        System.out.println("show(int a): " + a);
    }

    void show(String s) {
        System.out.println("show(String s): " + s);
    }

    void show(int a, String s) {
        System.out.println("show(int a, String s): " + a + ", " + s);
    }

}
