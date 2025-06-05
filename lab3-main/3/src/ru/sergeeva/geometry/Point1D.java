package ru.sergeeva.geometry;

/**
 * Одномерная точка с координатой X.
 * @param x координата X (int)
 * @param color цвет точки (String)
 * @param creationTime время создания (String)
 */
public class Point1D extends AbstractPoint {
    private int x;

    public Point1D(int x, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
    }

    public Point1D(int x) {
        this(x, "не указан", "не указано");
    }

    public int getX() {
        return x; 
    }
    public void setX(int x) { 
        this.x = x; 
    }

    @Override
    public String toString() {
        return "Одномерная точка: {" + x + "}, " + super.toString();
    }
}
