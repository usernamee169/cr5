package ru.sergeeva.utils;

public class MathUtils {
    /*
     * Утилиты для математических операций.
     */
    public static double sum(double... values) {
    /*
     * Суммирование чисел.
     * @param values числа для суммирования (double...)
     * @return сумма чисел (double)
     */
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }
}
