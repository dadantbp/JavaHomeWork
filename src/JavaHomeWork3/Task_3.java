package JavaHomeWork3;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scanner.next();

        System.out.print("Введите ваш возраст: ");
        int userAge = scanner.nextInt();

        System.out.println(String.format("Привет, %s! Твой возраст %d и сегодня %tD %tT", userName, userAge, new Date(), new Date() ));

    }

}
