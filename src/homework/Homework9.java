package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9 {

        public static String fullName (String fistName, String lastName){
            if (fistName == null && lastName == null) {
                return "Both null";
            } else if (fistName == null) {
                return lastName;
            } else if (lastName == null) {
                return fistName;
            } else {
                return fistName + " " + lastName;
            }

    }
        public static void main (String[]args){
            final Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            firstName = "null".equals(firstName) ? null : firstName;
            String lastName = scanner.nextLine();
            lastName = "null".equals(lastName) ? null : lastName;
            System.out.println(fullName(firstName, lastName));
        }
    }





