package ru.netology.sqr.Sqr1.services;

public class SQRService {
    public static int calcSqrCount(int minValue, int maxValue) {

        int count = 0;
        for (int i = 10; i < 100; i++) {
            int pow = (int) Math.pow(i, 2);
            if (pow >= minValue && pow <= maxValue) {
                count++;
            }
        }

        return count;
    }

}
