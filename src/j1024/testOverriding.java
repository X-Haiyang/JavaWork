package j1024;

public class testOverriding {


        void show() {
            System.out.println("testOverriding");
        }


    public class test extends testOverriding {
        @Override
        void show() {
            System.out.println("test");
        }
    }
}
