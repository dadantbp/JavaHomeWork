package JavaHomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        int randomNumber = 100;//new Random().nextInt(300) + 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Input number:");
        int number = in.nextInt();

        System.out.println(randomNumber);

        if ((number >= randomNumber - randomNumber * 0.1) && (number <= randomNumber + randomNumber * 0.1)) {
            System.out.println("Number is within 10%, range " + (randomNumber - randomNumber * 0.1) + "..." + (randomNumber + randomNumber * 0.1));
        } else {
            System.out.println("Number is NOT within 10%, range " + (randomNumber - randomNumber * 0.1) + "..." + (randomNumber + randomNumber * 0.1));
        }
    }
}
