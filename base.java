package ad221.milstein;

public class Dml {

    public static boolean chheckArr(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void fizzBuzzGame() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkSplit(int[] array) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < array.length - 1; i++) {
            l += array[i];
            r = 0;
            for (int j = i + 1; j < array.length; j++) {
                r += array[j];
            }
            if (l == r) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 2, 1};
        int[] array2 = {2, 1, 1, 2, 1};
        int[] array3 = {10, 10};
        System.out.println(chheckArr(array1)); // true
        fizzBuzzGame();
        System.out.println();
        System.out.println(checkSplit(array2)); // false
    }

}
