package ru.sergeeva.utils;

    /**
     * Утилиты для математических операций.
     */
public class MathUtils {
    /**
     * Суммирование чисел.
     * @param values числа для суммирования (double...)
     * @return сумма чисел (double)
     */
    public static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }
}
