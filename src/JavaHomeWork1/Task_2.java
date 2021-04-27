package JavaHomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number:");
        int numberOfRange1 = in.nextInt();

        System.out.print("Input second number:");
        int numberOfRange2 = in.nextInt();

        System.out.print("Input a number to define the range:");
        int inputNumber = in.nextInt();

        if (numberOfRange1 < numberOfRange2) {
            if (inputNumber <= numberOfRange1) {
                System.out.println("The number belongs to the first range");
            }
            if ((inputNumber > numberOfRange1) && (inputNumber < numberOfRange2)) {
                System.out.println("The number belongs to the second range");
            }
            if (inputNumber >= numberOfRange2) {
                System.out.println("The number belongs to the third range");
            }
        } else {
            if (inputNumber <= numberOfRange2) {
                System.out.println("The number belongs to the first range");
            }
            if ((inputNumber > numberOfRange2) && (inputNumber < numberOfRange1)) {
                System.out.println("The number belongs to the second range");
            }
            if (inputNumber >= numberOfRange1) {
                System.out.println("The number belongs to the third range");
            }
        }
    }
}

