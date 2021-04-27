package JavaHomeWork1;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {

        int number1 = new Random().nextInt(300) + 1;
        int number2 = new Random().nextInt(300) + 1;
        int number3 = new Random().nextInt(300) + 1;
        int min, max, varAverage;

        varAverage = (number1 + number2 + number3) / 3;

        if ((number1 < number2) && (number1 < number3)) {
            min = number1;
        } else {
            if ((number2 < number1) && (number2 < number3)) {
                min = number2;
            } else {
                min = number3;
            }
        }

        if ((number1 > number2) && (number1 > number3)) {
            max = number1;
        } else {
            if ((number2 > number1) && (number2 > number3)) {
                max = number2;
            } else {
                max = number3;
            }
        }

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + varAverage);

    }
}
