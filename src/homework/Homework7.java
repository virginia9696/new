package homework;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;



public class Homework7 {
    //Exercise 1
    //    public static void main (String [] args){
//     Scanner scan =new Scanner(System.in);
//     System.out.print("Introduceti literele:");
//     String text= scan.nextLine();
//     String letter = text.replace("a", "b");
//     System.out.println("Au fost efectuate unele modificari:" + letter);
//    }


    //Exercise 2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        System.out.print("Introduceti numele orasului:");
////        String city = scanner.nextLine();
////        if (city.endsWith("burg")) {
////            System.out.print("true");
////        } else {
////            System.out.print("false");
////        }
//    }

    //Exercise 2
//    public static void main (String[]args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Introduceti numele orasului:");
//        String city= scanner.nextLine();
//        System.out.print(city.toLowerCase().contains("burg"));
//    }
//
     //Exercise 3
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti textul:");
        String text = scanner.nextLine();
        String text1 = scanner.nextLine();
        String textnospaces = text.replace(" ", "");
        String textnospaces1 = text1.replace(" ", "");
        System.out.print(textnospaces.equals(textnospaces1));
    }

    //Exercise 4
//    public static void main(String[]args){
////        Scanner scan = new Scanner(System.in);
////        String[] date = scan.next().split("-");
////        StringBuilder newdate = new StringBuilder();
////        newdate.append(date[1]).append('/').append(date[2]).append('/').append(date[0]);
////        System.out.println(newdate.toString());
//        Scanner input = new Scanner(System.in);
//        String str1 = input.nextLine();
//        String[] str2 = str1.split("-");
//
//        System.out.println(str2[1] + "/" + str2[2] + "/" + str2[0]);
//    }

     ///Exercitiul 5


}



