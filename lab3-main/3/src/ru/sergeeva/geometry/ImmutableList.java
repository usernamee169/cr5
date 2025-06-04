package ru.sergeeva.geometry;

import java.util.Arrays;

/**
 * Неизменяемый список целых чисел.
 * @param array массив для хранения значений (int[])
 */
public class ImmutableList {
    private final int[] array;

    /**
     * Конструктор с переменным числом аргументов.
     * @param values значения для списка (int...)
     */
    public ImmutableList(int... values) {
        this.array = Arrays.copyOf(values, values.length);
    }

    /**
     * Конструктор копирования.
     * @param other другой ImmutableList для копирования
     */
    public ImmutableList(ImmutableList other) {
        this.array = Arrays.copyOf(other.array, other.array.length);
    }

    /**
     * Получение значения по индексу.
     * @param index индекс элемента (int)
     * @return значение элемента (int)
     * @throws IndexOutOfBoundsException если индекс вне границ
     */
    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива: " + index);
        }
        return array[index];
    }

    /**
     * Замена значения по индексу (создает новый список).
     * @param index индекс элемента (int)
     * @param value новое значение (int)
     * @return новый ImmutableList с измененным значением
     * @throws IndexOutOfBoundsException если индекс вне границ
     */
    public ImmutableList set(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива: " + index);
        }
        int[] newArray = Arrays.copyOf(array, array.length);
        newArray[index] = value;
        return new ImmutableList(newArray);
    }

    public boolean isEmpty() { return array.length == 0; }
    public int size() { return array.length; }

    /**
     * Получение массива значений.
     * @return копия внутреннего массива (int[])
     */
    public int[] toArray() { 
        return Arrays.copyOf(array, array.length); 
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
