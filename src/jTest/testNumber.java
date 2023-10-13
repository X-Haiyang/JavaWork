package jTest;

public class testNumber {

    public static void main(String[] args) {
//随机数
        int a = 55;

        int c=0;
        while (true) {
            int number = (int) (Math.random() * 100);
            if (number == a) {
                System.out.println(number);
                System.out.println(c);
                break;
            }
            c++;

        }

    }

}
