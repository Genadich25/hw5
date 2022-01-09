package ru.lookBag;
import java.util.Arrays;

public class Main {

    static int daysOfMonth = 30;

    public static void main(String[] args) {

    // 1 задача

        System.out.println();

        int[] myGenerateArray = generateRandomArray();
        int sum = 0;

        for (int elements : myGenerateArray){
            sum += elements;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

    // 2 задача

        Arrays.sort(myGenerateArray);

        System.out.println("Минимальная сумма трат за день составила " + myGenerateArray[0] + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + myGenerateArray[daysOfMonth - 1] + " рублей");

        System.out.println();

    // 3 задача

        double averageValue = (double)sum / (double)daysOfMonth;
        String result = String.format("%.2f",averageValue);

        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");

        System.out.println();

    // 4 задача

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[daysOfMonth];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
}
