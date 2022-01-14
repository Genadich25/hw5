package ru.lookBag;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
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

        int minValue = 2147483647;
        int maxValue = -2147483648;

        for (int i = 0; i < myGenerateArray.length; i++) {
            if(maxValue < myGenerateArray[i]){
                maxValue = myGenerateArray[i];
            } else if(minValue > myGenerateArray[i]){
                minValue = myGenerateArray[i];
            } else {
                continue;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxValue + " рублей");

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

        System.out.println(); System.out.println();

    // 5 задача

        int[][] matrix = new int[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if(row % 2 == 0 && column % 2 == 0) {
                    matrix[column][row] = 1;
                } else if(row % 2 == 1 && column % 2 == 1) {
                    matrix[column][row] = 1;
                }
                System.out.print(matrix[column][row] + " ");
            }
        System.out.println();
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
