package JavaHomeWork3;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {

    public static void main(String[] args) {
        String regex = "\\D\\d{2}\\D";
        Pattern pattern = Pattern.compile(regex);
        //String
        String str = "";
        for (int i = 0; i < 100; i++) {
            int randomValue = new Random().nextInt(1000);
            str = str.join(" ",String.valueOf(randomValue),str);
        }
        System.out.println("String: " + str);

        Matcher matcher = pattern.matcher(str);
        System.out.println("String Replace: " + matcher.replaceAll(" -1 "));


        //StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int randomValue = new Random().nextInt(1000);
            strBuilder.append(String.valueOf(randomValue) + " ");
        }
        System.out.println("StringBuilder: " + strBuilder);

        Matcher matcherBuilder = pattern.matcher(strBuilder);
        System.out.println("StringBuilder Replace: " + matcherBuilder.replaceAll(" -1 "));
    }

}
