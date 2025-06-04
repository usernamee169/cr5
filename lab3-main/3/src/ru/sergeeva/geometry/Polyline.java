package ru.sergeeva.geometry;

/**
 * Класс для представления ломаной линии.
 * @param points массив точек, образующих ломаную (Point[])
 */
public class Polyline {
    private Point[] points;

    public Polyline(Point[] points) {
        this.points = points.clone();
    }

    /**
     * Вычисление длины ломаной.
     * @return длина ломаной (double)
     */
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int dx = points[i+1].getX() - points[i].getX();
            int dy = points[i+1].getY() - points[i].getY();
            length += Math.sqrt(dx*dx + dy*dy);
        }
        return length;
    }

    /**
     * Изменение точки в ломаной.
     * @param index индекс изменяемой точки
     * @param point новая точка
     * @throws RuntimeException если индекс вне границ
     */
    public void setPoint(int index, Point point) {
        if (index < 0 || index >= points.length) {
            throw new RuntimeException("Индекс за пределами массива");
        }
        points[index] = point;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ломаная линия: ");
        for (Point p : points) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
}
