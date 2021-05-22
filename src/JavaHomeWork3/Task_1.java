package JavaHomeWork3;

import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        //String
        String str = "";
        for (int i = 0; i < 100; i++) {
            int randomValue = new Random().nextInt(1000);
            str = str.join(" ",String.valueOf(randomValue),str);
        }
        System.out.println("String: " + str);

        //StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int randomValue = new Random().nextInt(1000);
            strBuilder.append(String.valueOf(randomValue) + " ");
        }
        System.out.println("StringBuilder: " + strBuilder);
    }

}
