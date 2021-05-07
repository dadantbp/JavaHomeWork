package JavaHomeWork2;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        System.out.println("Загадайте число от " + MIN_VALUE + " до " + MAX_VALUE + ":");
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();

        int randomValue = new Random().nextInt(MAX_VALUE - MIN_VALUE);
        int count = 1;

        while (randomValue!=numberFromUser) {
            randomValue = new Random().nextInt(MAX_VALUE - MIN_VALUE);
            count++;
        }

        System.out.println("Загаданное число = " + randomValue + ", кол-во попыток = " + count);
    }
}
