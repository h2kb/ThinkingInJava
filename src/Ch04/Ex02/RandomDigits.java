package Ch04.Ex02;

import java.util.Random;

public class RandomDigits {
    static Random r = new Random();

    public static void compareBand() {
        int x = r.nextInt();
        int y = r.nextInt();

        System.out.println("x = " + x + ", b = " + y);

        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            compareBand();
        }
    }
}
