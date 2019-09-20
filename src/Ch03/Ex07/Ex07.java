package Ch03.Ex07;
import java.util.Random;

public class Ex07 {
    public  static void main(String[] args) {
        Random rand = new Random();
        boolean flip = rand.nextBoolean();

        System.out.println(flip ? "Head" : "Tail");
    }
}
