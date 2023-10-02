package jTest;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();
        int a = num;
        int b = 0;
        int number = 0;
        int count = 0;

        while (a > 0) {

            b = a % 10;
            a = a / 10;
            number = number * 10 + b;
            count++;

        }
        if (number == num) {
            System.out.println(true);
        } else {
            {
                System.out.println(false);
            }
        }
        System.out.println(number+" "+count);

    }

}
