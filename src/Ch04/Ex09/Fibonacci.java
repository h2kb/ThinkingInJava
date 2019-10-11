package Ch04.Ex09;

public class Fibonacci {
    private static int fib(int num) {
        if (num <= 2) {
            return 1;
        }

        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, use java Fibonacci number (for end of the sequence).");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num < 0) {
            System.out.println("Cannot use negative number.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
