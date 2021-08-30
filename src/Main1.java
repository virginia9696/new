public class Main1 {
    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

//        double result = multiply( 10,10) + 15;
//        System.out.println(result);
        System.out.println("Using return");
        System.out.println(addString("Andrei", "Ciuvaga"));
        System.out.println("Using void");
        addString1("Andrei", "Ciuvaga");

        String text = "Virginia";
        String substring = text.substring(0,3);
        System.out.println(substring);


    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static String addString(String text1, String text2) {
        return text1 + " " + text2;
    }

    public static void addString1(String text1, String text2) {
        System.out.println(text1 + text2);
    }
}
