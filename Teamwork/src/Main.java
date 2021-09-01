import java.util.Random;

public class Main {

    int[] intArray = {33, 2, 0, 34, 12, 110, 2, 14, 22, 80, 30, 5};

    public static void main(String[] args) {
        int[] ints = new int[20];
        Random rand = new Random();
        for (int i : ints) {
            i = rand.nextInt(100) + 1;
        }
    }

    public static int maxOfArray(int[] intArray) {
        int maxNum = intArray[0];

        for (int i : intArray) {
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println("Maximum number = " + maxNum);
        return maxNum;

    }

    public static int countOdds(int[] intArray) {
        int numberOfOdds = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                numberOfOdds++;
            }
        }
        System.out.println(numberOfOdds);
        return numberOfOdds;
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

            if (i % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int sumOdd(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        return sum;
    }
    public static int sumEven(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

