public class Lesson1 {
    public static void main(String[] args) {
//        byte a =3;
//        short b = 4;
//        int c =5;
//        long d = 1000000;
//        float e = 2.58f;
//        double f = 2.256;
//        char g = '\u0001';
//        boolean i = true;
        System.out.println(calc(2, 5, 7, 8));
        System.out.println(ravenstvo(6, 6));
        number(0);
        System.out.println(minus(-1));
        Name("Jack");
        System.out.println(visokos(2019));
    }

    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean ravenstvo(int a, int b) {
        int c = a + b;
        return c > 10 && c <= 20;

    }

   public static void number(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");


        }
    }

    public static boolean minus(int d) {
        return d < 0;
    }

    public static void Name(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static boolean visokos(int year) {
        return year % 4 == 0 && year % 100 != 0 && year % 400 == 0;


        }
    }


