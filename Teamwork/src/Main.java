import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[20];
        Random rand = new Random();
        for (int i : ints) {
            i = rand.nextInt(100) + 1;
        }
    }

    public static int getMinFromArray(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int countEven(int[] arr) {
        int counter = 0;

        for (int i : arr) {
            if (i%2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}
