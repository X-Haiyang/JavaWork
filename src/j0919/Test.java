package j0919;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] a = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
//
//        int num = 0;
//        while (num != a.length) {
//            a[num] = scan.nextInt();
//            num++;
//        }
//
//        int num = 0;
//        do {
//            a[num] = scan.nextInt();
//            num++;
//        } while (num != a.length);

        for (int i : a) {
            System.out.println(i);
        }
    }
}