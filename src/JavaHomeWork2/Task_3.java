package JavaHomeWork2;

import java.util.Scanner;

public class Task_3 {

    private static final int NUMBER_OF_ATTEMPTS = 5;
    private static final int CORRECT_ANSWER = 16;

    public static void main(String[] args) {
        int count = 0;
        int currentAttempts = NUMBER_OF_ATTEMPTS;

        while (count < NUMBER_OF_ATTEMPTS) {
            System.out.print("Со скольки лет в США можно получить права для вождения автомобиля?" +
                    " (Количество попыток: " + currentAttempts + ", если захотите сдаться введите -1)");

            Scanner scanner = new Scanner(System.in);
            int answerFromUser = scanner.nextInt();

            if (answerFromUser == CORRECT_ANSWER && answerFromUser != -1) {
                System.out.println("Поздравляем! Вы ответили верно");
                break;
            } else if (answerFromUser == -1) {
                System.out.println("Вы сдались, верный ответ " + CORRECT_ANSWER);
                break;
            }
            count++;
            currentAttempts--;

            if (currentAttempts == 0) {
                System.out.println("Все попытки закончились и вы не смогли ответить верно");
            }
        }
    }
}
