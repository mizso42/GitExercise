public class Main {
    public static void main(String[] args) {
        
    }

        public void maxOfArray(){

            int[] intArray = {33, 2, 0, 34, 12, 110, 2, 14, 22, 80, 30, 5};

            int maxNum = intArray[0];

            for (int i : intArray) {
                if (i > maxNum)
                    maxNum = i;
            }

            System.out.println("Maximum number = " + maxNum);

        }
    }

