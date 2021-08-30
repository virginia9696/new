package homework;

import java.util.Scanner;
import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int numbers= console.nextInt();
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum = +i;
        }
        System.out.println(sum);

    }
}



