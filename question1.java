package com.lpu.test3;

public class question1 {

    public static void findMinMax(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println("Error: Invalid Array");
            return;
        }

        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int num : numbers) {

            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println("Minimum: " + minValue + ", Maxi: " + maxValue);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        findMinMax(arr);
    }
}
