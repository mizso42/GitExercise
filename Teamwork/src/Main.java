import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[20];
        Random rand = new Random();
        for (int i : ints) {
            i = rand.nextInt(100) + 1;
        }
    }
}
