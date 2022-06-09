package ru.netology.sqr.Sqr1.services;

import org.junit.jupiter.api.Test;

public class SQRSeviceTest {
    @Test // Тест по значениям из задачи
    public void testSetValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(200, 300));

    }

    @Test// Тест с расширенными граничными данными
    public void testAnotherValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(100, 500));

    }

    @Test // Тест с минимальными граничными данными
    public void testLowValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(0, 99));

    }

    @Test //Тест на максимальное количество квадратов
    public void testMaxSquares() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(100, 15000));


    }
}
