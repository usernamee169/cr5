package ru.sergeeva.main;

import ru.sergeeva.geometry.*;
import ru.sergeeva.utils.MathUtils;
import java.util.Scanner;

    /**
     * Главный класс программы для демонстрации работы всех сущностей.
     */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        demonstrateLineOperations(scanner);
        
        demonstrateSquareOperations();
        
        demonstrateImmutableListOperations(scanner);
        
        demonstratePointOperations();
        
        demonstrateMathOperations();
        
        if (args.length == 2) {
            demonstratePowerOperation(args);
        }
        
        scanner.close();
    }

    private static void demonstrateLineOperations(Scanner scanner) {
        // Задание 1.6
        System.out.println("\n=== Задание 1.6: Работа с линией ===");
        
        System.out.println("Введите координаты начала первой линии (x y):");
        Point start1 = readPoint(scanner);
        System.out.println("Введите координаты конца первой линии (x y):");
        Point end1 = readPoint(scanner);
        Line line1 = new Line(start1, end1);
        System.out.println("Создана первая линия: " + line1);
        
        System.out.println("Введите координаты начала второй линии (x y):");
        Point start2 = readPoint(scanner);
        System.out.println("Введите координаты конца второй линии (x y):");
        Point end2 = readPoint(scanner);
        Line line2 = new Line(start2, end2);
        System.out.println("Создана вторая линия: " + line2);
        
        checkLinesForSharedPoints(line1, line2);
        
        // Задание 8.5
        System.out.println("\n=== Задание 8.5: Клонирование линии ===");
        Line clonedLine = line1.clone();
        System.out.println("Клонированная линия: " + clonedLine);
        System.out.println("Оригинальная и клонированная линии равны? " + 
            line1.equals(clonedLine));
    }

    private static Point readPoint(Scanner scanner) {
        int x = readInt(scanner, "x");
        int y = readInt(scanner, "y");
        return new Point(x, y);
    }

    private static int readInt(Scanner scanner, String coordinateName) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода! Введите целое число для " + coordinateName + ":");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void checkLinesForSharedPoints(Line line1, Line line2) {
        try {
            line1.checkForSharedPoints(line2);
            System.out.println("Линии не имеют общих точек.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    // Задание 1.12
    private static void demonstrateSquareOperations() {
        System.out.println("\n=== Задание 1.12: Работа с квадратом ===");
        
        Square square = new Square(new Point(5, 3), 23);
        System.out.println("Создан квадрат: " + square);
        
        Polyline polyline = square.getPolyline();
        System.out.println("Ломаная линия квадрата: " + polyline);
        System.out.println("Длина ломаной: " + polyline.getLength());
        
        polyline.setPoint(3, new Point(15, 25));
        System.out.println("Ломаная после изменения: " + polyline);
        System.out.println("Новая длина ломаной: " + polyline.getLength());
    }
    
    // Задание 2.1
    private static void demonstrateImmutableListOperations(Scanner scanner) {
        System.out.println("\n=== Задание 2.1: Работа с неизменяемым списком ===");
        
        ImmutableList list1 = new ImmutableList(1, 2, 3, 4);
        System.out.println("Создан список: " + list1);
        
        System.out.println("Введите индекс элемента для получения:");
        int index = readInt(scanner, "индекс");
        System.out.println("Элемент с индексом " + index + ": " + list1.get(index));
        
        System.out.println("Введите индекс элемента для замены:");
        int replaceIndex = readInt(scanner, "индекс");
        System.out.println("Введите новое значение:");
        int newValue = readInt(scanner, "значение");
        ImmutableList newList = list1.set(replaceIndex, newValue);
        System.out.println("Новый список после замены: " + newList);
        
        System.out.println("Размер списка: " + list1.size());
        System.out.println("Список пуст? " + list1.isEmpty());
    }

    private static void demonstratePointOperations() {
        System.out.println("\n=== Задание 4.5: Работа с точками ===");
        
        Point1D point1D = new Point1D(3, "красный", "10:00");
        Point2D point2D = new Point2D(7, 7, "желтый", "15:35");
        Point3D point3D = new Point3D(4, 2, 5, "синий", "11:00");
        
        System.out.println(point1D);
        System.out.println(point2D);
        System.out.println(point3D);
    }

    // Задание 5.1
    private static void demonstrateMathOperations() {
        System.out.println("\n=== Задание 5.1: Сложение чисел ===");
        System.out.println("Сумма 2 + 3/5 + 2.3: " + MathUtils.sum(2, 3.0/5, 2.3));
        System.out.println("Сумма 3.6 + 49/12 + 3 + 3/2: " + 
            MathUtils.sum(3.6, 49.0/12, 3, 3.0/2));
        System.out.println("Сумма 1/3 + 1: " + MathUtils.sum(1.0/3, 1));
    }

    private static void demonstratePowerOperation(String[] args) {
        System.out.println("\n=== Задание 7.3: Возведение в степень ===");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(x + " в степени " + y + " = " + Math.pow(x, y));
    }
}
