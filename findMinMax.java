import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));

        int[] result = findMinAndMax(numbers);
        System.out.println("Min (from combined method): " + result[0]);
        System.out.println("Max (from combined method): " + result[1]);

        scanner.close();
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }
}
