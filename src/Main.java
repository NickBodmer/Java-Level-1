import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            int random = (int) (Math.random() * 9);
            System.out.println("Задача угадать число за три попытки");
            for (int count = 0; ; count++) {
                System.out.println("Введите число ");
                int a = scanner.nextInt();
                if (a == random) {
                    System.out.println("Вы выиграли!");
                    break;
                } else if (a < random) {

                    System.out.println("Загаданное число больше Попытка: " + count +  " Число " +  random);
                } else if (a > random) {
                    System.out.println("Загаданное число меньше Попытка: " + count +  " Число" +  random);
                }
                if (count == 3) {
                    System.out.println("Количество попыток истекло, вы проиграли");
                    break;

                }
            }
            System.out.println("Хотите продолжить? 1-да/2-нет");
            if (scanner.nextInt() == 2) {
                break;
            }
        }

    }
}