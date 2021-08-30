package homework;

import java.util.Scanner;
import java.util.Arrays;
public class Homework8 {

    public static void sort(int[] numbers) {
        int[] intArray = numbers;
        int n = 0;
        for (int i = 0; i <= intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    n = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = n;
                }
            }
        }
    }
    public static void main(String[]args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));	}
}