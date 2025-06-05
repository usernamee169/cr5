package ru.sergeeva.geometry;

/**
 * Двухмерная точка с координатами X и Y.
 * @param x координата X (int)
 * @param y координата Y (int)
 * @param color цвет точки (String)
 * @param creationTime время создания (String)
 */
public class Point2D extends AbstractPoint {
    private int x;
    private int y;

    public Point2D(int x, int y, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
        this.y = y;
    }

    public Point2D(int x, int y) {
        this(x, y, "не указан", "не указано");
    }

    public int getX() { 
        return x; 
    }
    
    public void setX(int x) { 
        this.x = x; 
    }

    public int getY() {
        return y; 
    }
    
    public void setY(int y) {
        this.y = y; 
    }

    @Override
    public String toString() {
        return "Двухмерная точка: {" + x + ";" + y + "}, " + super.toString();
    }
}
