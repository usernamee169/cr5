package ru.sergeeva.geometry;

/**
 * Класс для представления линии на плоскости.
 * @param start начальная точка (Point)
 * @param end конечная точка (Point)
 */
public class Line implements Cloneable {
    private Point start;
    private Point end;

    /**
     * Конструктор линии по двум точкам.
     * @throws RuntimeException если точки совпадают
     */
    public Line(Point start, Point end) {
        if (start.equals(end)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    public Point getStart() { return start; }
    public Point getEnd() { return end; }

    /**
     * Установка новой начальной точки.
     * @throws RuntimeException если новая точка совпадает с конечной
     */
    public void setStart(Point start) {
        if (start.equals(this.end)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.start = new Point(start.getX(), start.getY());
    }

    /**
     * Установка новой конечной точки.
     * @throws RuntimeException если новая точка совпадает с начальной
     */
    public void setEnd(Point end) {
        if (end.equals(this.start)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.end = new Point(end.getX(), end.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не удалось", e);
        }
    }

    /**
     * Проверка на общие точки с другой линией.
     * @param otherLine другая линия для проверки
     * @throws RuntimeException если линии имеют общие точки
     */
    void checkForSharedPoints(Line otherLine) {
        if (this.start.equals(otherLine.start) || this.start.equals(otherLine.end) ||
                this.end.equals(otherLine.start) || this.end.equals(otherLine.end)) {
            throw new RuntimeException("Ошибка: линии имеют общие точки.");
        }
    }
}
