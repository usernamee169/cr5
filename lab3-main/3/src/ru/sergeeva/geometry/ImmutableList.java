package ru.sergeeva.geometry;

import java.util.Arrays;

/**
 * Неизменяемый список целых чисел.
 * @param array массив для хранения значений
 */
public class ImmutableList {
    private final int[] array;

    public ImmutableList(int... values) {
        this.array = Arrays.copyOf(values, values.length);
    }

    public ImmutableList(ImmutableList other) {
        this.array = Arrays.copyOf(other.array, other.array.length);
    }

    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива: " + index);
        }
        return array[index];
    }

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
    public int[] toArray() { return Arrays.copyOf(array, array.length); }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
